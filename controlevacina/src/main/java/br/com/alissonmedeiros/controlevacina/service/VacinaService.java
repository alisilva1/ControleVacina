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
        try {
            if (usuarioVacinado.getId() != null) {
                Integer idUsuario = usuarioVacinado.getId();
                vacina.setEmail(Integer.toString(idUsuario));
                dao.save(vacina);
                return vacina;
            }

        }
        catch(Exception ex){
            System.out.println("DEBUG = "+ ex.getMessage());
        }
        return null;
    }
}
