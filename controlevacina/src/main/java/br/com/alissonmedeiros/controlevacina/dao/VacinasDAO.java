package br.com.alissonmedeiros.controlevacina.dao;

import br.com.alissonmedeiros.controlevacina.model.Vacina;
import org.springframework.data.repository.CrudRepository;

public interface VacinasDAO extends CrudRepository <Vacina, Integer> {
}
