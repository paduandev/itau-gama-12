package br.gama.itau.spring03.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gama.itau.spring03.dto.VeiculoDTO;
import br.gama.itau.spring03.model.Veiculo;
import br.gama.itau.spring03.repository.VeiculoRepo;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepo repo;

    public Veiculo getById(long id) {
        Optional<Veiculo> veiculoOptional = repo.findById(id);

        if (veiculoOptional.isEmpty()) {
            return null;
        }

        Veiculo veiculoEncontrado = veiculoOptional.get();
        return veiculoEncontrado;
    }

    public List<VeiculoDTO> getAll() {
        // o método finAll retorna um Iterable, e nós precisamos de um List
        // por isso fazemos um Casting, transformando para o tipo que precisamos
        List<Veiculo> lista = (List<Veiculo>) repo.findAll();

        List<VeiculoDTO> listaDTO = new ArrayList<>();

        for (Veiculo veiculo : lista) {
            listaDTO.add(new VeiculoDTO(veiculo));
        }

        return listaDTO;
    }

    public Veiculo newVeiculo(Veiculo novoVeiculo) {
        // ao criar um novo veículo, não pode ter a chave primária
        if(novoVeiculo.getId() > 0) {
            return null;
        }
        Veiculo veiculoInserido = repo.save(novoVeiculo);
        return veiculoInserido;
    }
}
