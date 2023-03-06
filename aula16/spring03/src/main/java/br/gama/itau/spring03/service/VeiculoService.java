package br.gama.itau.spring03.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gama.itau.spring03.model.Veiculo;
import br.gama.itau.spring03.repository.VeiculoRepo;

@Service
public class VeiculoService {
    
    @Autowired
    private VeiculoRepo repo;
    
    public Veiculo getById(long id) {
        Optional<Veiculo> veiculoOptional = repo.findById(id);

        if(veiculoOptional.isEmpty()) {
            return null;
        }

        Veiculo veiculoEncontrado = veiculoOptional.get();
        return veiculoEncontrado;
    }
}
