package br.gama.itau.spring03.integration;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.gama.itau.spring03.model.Veiculo;
import br.gama.itau.spring03.repository.VeiculoRepo;
import br.gama.itau.spring03.util.GenerateVeiculo;

// carrega o contexto do Spring para teste usando uma porta aleatória
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class VeiculoControllerITTest {
    
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private VeiculoRepo veiculoRepo;

    @BeforeEach
    public void setup() {
        veiculoRepo.deleteAll();
    }

    @Test
    public void newVeiculo_returnVeiculoInserido_whenDadosVeiculoValido() throws Exception {
        Veiculo novoVeiculo = GenerateVeiculo.novoVeiculoToSave();

        ResultActions resposta = mockMvc.perform(post("/veiculo")
                        .content(objectMapper.writeValueAsString(novoVeiculo))
                        .contentType(MediaType.APPLICATION_JSON));

        resposta.andExpect(status().isCreated())
                .andExpect(jsonPath("$.placa", CoreMatchers.is(novoVeiculo.getPlaca())));
    }

    @Test
    public void getById_returnVeiculo_whenIdExist() throws Exception {
        Veiculo novoVeiculo = GenerateVeiculo.novoVeiculoToSave();

        Veiculo veiculoCriado = veiculoRepo.save(novoVeiculo);

        // ação
        ResultActions resposta = mockMvc.perform(get("/veiculo/{id}", veiculoCriado.getId())
                .contentType(MediaType.APPLICATION_JSON));

        // verificar os resultados
        resposta.andExpect(status().isOk())
                .andExpect(jsonPath("$.placa", CoreMatchers.is(veiculoCriado.getPlaca())));
    }

    @Test
    public void getAll_returnListVeiculos_whenSuccess() throws Exception {
        // preparação
        List<Veiculo> lista = new ArrayList<>();
        lista.add(GenerateVeiculo.novoVeiculoToSave());
        lista.add(GenerateVeiculo.novoVeiculoToSave2());

        veiculoRepo.saveAll(lista);

        // ação
        ResultActions resposta = mockMvc.perform(get("/veiculo").contentType(MediaType.APPLICATION_JSON));

        // verificações
        resposta.andExpect(status().isOk()) 
                .andExpect(jsonPath("$.size()", CoreMatchers.is(lista.size())))
                .andExpect(jsonPath("$[0].placa", CoreMatchers.is(GenerateVeiculo.veiculoValido().getPlaca())));
    }
}
