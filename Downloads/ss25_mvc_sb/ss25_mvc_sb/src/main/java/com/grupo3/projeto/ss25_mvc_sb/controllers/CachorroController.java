package com.grupo3.projeto.ss25_mvc_sb.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.grupo3.projeto.ss25_mvc_sb.dao.CachorroDAO;
import com.grupo3.projeto.ss25_mvc_sb.models.Cachorro;

@RestController
@RequestMapping("/api/cachorros")
public class CachorroController {
    private CachorroDAO cachorroDAO = new CachorroDAO();

    public CachorroController() {}

    @PostMapping
    public void cadastrarCachorro(@RequestBody Cachorro cachorro) {
        cachorroDAO.addCachorro(cachorro.getNome(), cachorro.getRaca());
    }

    // Mantém o método existente para compatibilidade
    @GetMapping("/cadastrar")
    public void cadastrarCachorroParam(@RequestParam String nome, @RequestParam String raca) {
        cachorroDAO.addCachorro(nome, raca);
    }

    @GetMapping
    public List<Cachorro> listarCachorros() {
        return cachorroDAO.listarCachorros();
    }

    // Mantém o método existente para compatibilidade
    @GetMapping("/listar")
    public List<Cachorro> listarCachorrosLegado() {
        return cachorroDAO.listarCachorros();
    }
}