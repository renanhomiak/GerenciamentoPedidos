package com.homiak.ex03.service;

import com.homiak.ex03.models.PedidoModel;
import com.homiak.ex03.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public PedidoModel salvar(PedidoModel livro) {
        return repository.save(livro);
    }

    public List<PedidoModel> listar() {
        return repository.findAll();
    }

    public Optional<PedidoModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}