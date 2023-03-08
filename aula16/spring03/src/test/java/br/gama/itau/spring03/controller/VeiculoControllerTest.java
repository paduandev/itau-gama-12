package br.gama.itau.spring03.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.hamcrest.CoreMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import br.gama.itau.spring03.dto.VeiculoDTO;
import br.gama.itau.spring03.model.Veiculo;
import br.gama.itau.spring03.service.VeiculoService;
import br.gama.itau.spring03.util.GenerateVeiculo;

@WebMvcTest(VeiculoController.class)
public class VeiculoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper; // Json para String

    @MockBean
    private VeiculoService service;

    @Test
    public void getAll_returnListVeiculos_whenSuccess() throws Exception {
        // preparação
        List<VeiculoDTO> lista = new ArrayList<>();
        lista.add(new VeiculoDTO(GenerateVeiculo.veiculoValido()));
        lista.add(new VeiculoDTO(GenerateVeiculo.veiculoValidoId2()));

        BDDMockito.when(service.getAll()).thenReturn(lista);

        // ação
        ResultActions resposta = mockMvc.perform(get("/veiculo").contentType(MediaType.APPLICATION_JSON));

        // verificações
        resposta.andExpect(status().isOk()) // verifica se o status é OK (200)
                // verifica se o tamanho da lista na resposta é 2 (lista.size)
                .andExpect(jsonPath("$.size()", CoreMatchers.is(lista.size())))
                // verifique se a placa do primeiro veículo é a placa esperada
                .andExpect(jsonPath("$[0].placa", CoreMatchers.is(GenerateVeiculo.veiculoValido().getPlaca())));
    }

    @Test
    public void getById_returnVeiculo_whenIdExist() throws Exception {
        Veiculo veiculo = GenerateVeiculo.veiculoValido();

        BDDMockito.when(service.getById(anyLong())).thenReturn(veiculo);

        // ação
        ResultActions resposta = mockMvc.perform(get("/veiculo/{id}", veiculo.getId())
                .contentType(MediaType.APPLICATION_JSON));

        resposta.andExpect(status().isOk())
                .andExpect(jsonPath("$.placa", CoreMatchers.is(veiculo.getPlaca())));
    }
}
