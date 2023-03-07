package br.gama.itau.spring03.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.gama.itau.spring03.dto.VeiculoDTO;
import br.gama.itau.spring03.exception.NotFoundException;
import br.gama.itau.spring03.model.Veiculo;
import br.gama.itau.spring03.repository.VeiculoRepo;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // precisa gerar o construtor com os atributos obrigatórios
public class VeiculoService {

    // Outras opções de injeção de dependência, sem usar Autowired

    private final VeiculoRepo repo; // final, indica um atributo obrigatório para esta classe

    // construtor pode ser usado quando não colocamos final no atributo
    // public VeiculoService(VeiculoRepo repo) {
    //     this.repo = repo;
    // }

    public Veiculo getById(long id) {
        Optional<Veiculo> veiculoOptional = repo.findById(id);

        if (veiculoOptional.isEmpty()) {
            throw new NotFoundException("Veículo não encontrado");
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

    public Veiculo updateVeiculo(long id, Veiculo veiculo) {
        Optional<Veiculo> veiculoOptional = repo.findById(id);

        if(veiculoOptional.isEmpty()) {
            return null;
        }
        veiculo.setId(id);
        Veiculo veiculoAtualizado = repo.save(veiculo);
        return veiculoAtualizado;
    }

    public boolean deleteVeiculo(long id) {
        Optional<Veiculo> veiculoOptional = repo.findById(id);

        if(veiculoOptional.isEmpty()) {
            return false;
        }
        
        repo.deleteById(id);
        return true;
    }

    public Veiculo getByPlaca(String placa) {
        return repo.findByPlaca(placa);
    }

    public List<Veiculo> getGreaterThanAnoFabricacao(int anoFabricacao) {
        return repo.findByAnoFabricacaoGreaterThanEqual(anoFabricacao);
    }

    public List<Veiculo> getAllOrderMarca() {
        return repo.getAllOrderMarca();
    }
  }
