package br.com.alissonmedeiros.controlevacina.service;

import br.com.alissonmedeiros.controlevacina.dao.UsuariosDAO;
import br.com.alissonmedeiros.controlevacina.dao.VacinasDAO;
import br.com.alissonmedeiros.controlevacina.model.Usuarios;
import br.com.alissonmedeiros.controlevacina.model.Vacina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VacinaService implements InterfaceVacinaService{

    @Autowired
    private VacinasDAO dao;

    @Autowired
    private UsuariosDAO daoUsuarios;

    @Override
    public Vacina cadastrarVacina(Vacina vacina){
        Usuarios usuarioVacinado = daoUsuarios.findByEmail(vacina.getEmail());
        System.out.println(usuarioVacinado);
        //Criar uma função de busca Id atraves do getby e-mail
        /*
        Usuarios temId;
        if (1=2) {
            dao.save(vacina);
            return vacina;
        }
        */
        return null;
    }
}
