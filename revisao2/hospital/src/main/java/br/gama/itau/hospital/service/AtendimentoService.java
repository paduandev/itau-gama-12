package br.gama.itau.hospital.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.gama.itau.hospital.model.Atendimento;
import br.gama.itau.hospital.repo.AtendimentoRepo;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AtendimentoService {
    
    private final AtendimentoRepo repo;

    public List<Atendimento> getAll() {
        return (List<Atendimento>) repo.findAll();
    }
}
