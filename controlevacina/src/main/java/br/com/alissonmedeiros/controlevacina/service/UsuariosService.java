package br.com.alissonmedeiros.controlevacina.service;

import br.com.alissonmedeiros.controlevacina.dao.UsuariosDAO;
import br.com.alissonmedeiros.controlevacina.model.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuariosService implements InterfaceUsuariosService {

    @Autowired
    private UsuariosDAO dao;

    @Override
    public Usuarios inserirUsuarios(Usuarios usuario) {
        if (usuario.getDataNascimento() != null && usuario.getEmail() != null && usuario.getNome() != null) {
            dao.save(usuario);
            return usuario;
        }
        return null;

    }
        //Validar regras
        //Nome,e-mail,Data nascimento,CPF
        //Verificar se existe e-mail e CPF

}
