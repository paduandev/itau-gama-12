package br.gama.itau.spring03.dto;

import br.gama.itau.spring03.model.Veiculo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // gera um construtor sem parâmetros
// DTO = Data Tranfer Object = Objeto usado para transferência de dados, geralmente
// aplicando um filtro nos dados originais
public class VeiculoDTO {
    private String placa;
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public VeiculoDTO(Veiculo veiculo) {
        this.placa = veiculo.getPlaca();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.anoFabricacao = veiculo.getAnoFabricacao();
    }
 }
