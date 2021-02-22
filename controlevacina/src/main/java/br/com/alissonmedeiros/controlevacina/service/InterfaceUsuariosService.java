package br.com.alissonmedeiros.controlevacina.service;

import br.com.alissonmedeiros.controlevacina.model.Usuarios;

public interface InterfaceUsuariosService {
    public Usuarios inserirUsuarios(Usuarios usuario);
    public Usuarios findByEmail(String email);
}
