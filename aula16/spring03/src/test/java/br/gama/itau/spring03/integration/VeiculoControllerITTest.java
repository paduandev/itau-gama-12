package br.gama.itau.spring03.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import org.hamcrest.CoreMatchers;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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

    @Test
    public void newVeiculo_returnVeiculoInserido_whenDadosVeiculoValido() throws Exception {
        Veiculo novoVeiculo = GenerateVeiculo.novoVeiculoToSave();

        ResultActions resposta = mockMvc.perform(post("/veiculo")
                        .content(objectMapper.writeValueAsString(novoVeiculo))
                        .contentType(MediaType.APPLICATION_JSON));

        resposta.andExpect(status().isCreated())
                .andExpect(jsonPath("$.placa", CoreMatchers.is(novoVeiculo.getPlaca())));
    }
}
