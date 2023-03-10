package br.gama.itau.hospital.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.gama.itau.hospital.dto.PacienteDTO;
import br.gama.itau.hospital.model.Paciente;
import br.gama.itau.hospital.repo.PacienteRepo;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PacienteService {
    
    private final PacienteRepo repo;

    public List<Paciente> getAll() {
        return (List<Paciente>) repo.findAll();
    }

    public List<PacienteDTO> getAllDTO() {
        List<Paciente> listaPaciente = (List<Paciente>) repo.findAll();
        List<PacienteDTO> listaPacienteDTO = new ArrayList<>();

        for(Paciente paciente: listaPaciente){
            listaPacienteDTO.add(new PacienteDTO(paciente));
        }
        
        return listaPacienteDTO;
    }


}
