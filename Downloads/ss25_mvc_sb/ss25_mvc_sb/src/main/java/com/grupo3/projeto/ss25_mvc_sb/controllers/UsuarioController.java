package com.grupo3.projeto.ss25_mvc_sb.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.grupo3.projeto.ss25_mvc_sb.dao.UsuarioDAO;
import com.grupo3.projeto.ss25_mvc_sb.models.Usuario;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public UsuarioController() {}

    @PostMapping
    public void cadastrarUsuario(@RequestBody Usuario usuario) {
        usuarioDAO.addUsuario(usuario.getUser(), usuario.getPassword());
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioDAO.listarUsuarios();
    }
}