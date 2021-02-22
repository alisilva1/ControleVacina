package br.com.alissonmedeiros.controlevacina.controller;

import br.com.alissonmedeiros.controlevacina.model.Usuarios;
import br.com.alissonmedeiros.controlevacina.model.Vacina;
import br.com.alissonmedeiros.controlevacina.service.InterfaceUsuariosService;
import br.com.alissonmedeiros.controlevacina.service.InterfaceVacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacinasController {

    @Autowired
    private InterfaceVacinaService service;

    @PostMapping("/cadastrarvacina")
    public ResponseEntity<Vacina> adicionarNova(@RequestBody Vacina vacina){
        Vacina resultado = service.cadastrarVacina(vacina);
        if(resultado != null){
            return ResponseEntity.status(201).body(resultado);
        }
        return ResponseEntity.badRequest().build();
    }
}
