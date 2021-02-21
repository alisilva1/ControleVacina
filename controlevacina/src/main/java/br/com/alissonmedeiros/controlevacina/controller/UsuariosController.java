package br.com.alissonmedeiros.controlevacina.controller;

import br.com.alissonmedeiros.controlevacina.model.Usuarios;
import br.com.alissonmedeiros.controlevacina.service.InterfaceUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosController {

    @Autowired
    private InterfaceUsuariosService service;

    @PostMapping("/cadastrarusuario")
    public ResponseEntity<Usuarios> adicionarNova(@RequestBody Usuarios usuario){
        Usuarios resultado = service.inserirUsuarios(usuario);
        if(resultado != null){
            return ResponseEntity.status(201).body(resultado);
        }
        return ResponseEntity.badRequest().build();
    }
}
