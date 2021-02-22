package br.com.alissonmedeiros.controlevacina.dao;

import br.com.alissonmedeiros.controlevacina.model.Usuarios;
import org.springframework.data.repository.CrudRepository;

public interface UsuariosDAO extends CrudRepository<Usuarios, Integer> {
    //Design Pattern Data Access Object
    Usuarios findByEmail(String email);
}
