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
        //Primeira Regra será validar se o objeto não foi preenchido, caso algum campo não seja preenchido vai retornar o erro 400
        //Devido ao JPA ter a opcao do unique na classe usuarios consigo retornar o erro 400 de forma mais facil ao retornar null no inserir usuarios
        try{
            if (usuario.getDataNascimento() != null && usuario.getEmail() != null && usuario.getNome() != null && usuario.getCpf() != null) {
                dao.save(usuario);
                return usuario;
            }
        }
        catch(Exception ex){
            System.out.println("DEBUG = "+ ex.getMessage());
        }

        return null;

    }

    @Override
    public Usuarios findByEmail(String email){
        Usuarios encontrado = null;
        try{
            if(dao.findByEmail(email)!=null){
                encontrado = dao.findByEmail(email);
            }
        }
        catch(Exception ex){
            System.out.println("DEBUG = "+ ex.getMessage());
        }
        return encontrado;
    }

}
