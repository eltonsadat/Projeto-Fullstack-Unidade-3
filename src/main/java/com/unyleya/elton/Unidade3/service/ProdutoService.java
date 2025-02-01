package com.unyleya.elton.Unidade3.service;

import com.unyleya.elton.Unidade3.model.Produto;
import com.unyleya.elton.Unidade3.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(String id) {
        return produtoRepository.findById(id);
    }

    public Produto cadastrar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto atualizar(String id, Produto produto) {
        produto.setId(id);
        return produtoRepository.save(produto);
    }

    public void remover(String id) {
        produtoRepository.deleteById(id);
    }
}