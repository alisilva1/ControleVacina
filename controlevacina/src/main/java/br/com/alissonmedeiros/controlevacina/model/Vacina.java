package br.com.alissonmedeiros.controlevacina.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

//Ele é uma entidade que vai ser gerenciada pela minha ferramenta de ORM no caso ser gerenciada pelo JPA e essa classe vai corresponder a uma tabela do BD
@Entity
@Table(name = "tbl_vacinas", schema = "db_controle_vacinas_zup")
public class Vacina {

    //Essa anotacao indica que o ID é minha chave primária e vai ser auto incrementavel no sistema
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vacina")
    private Integer id;

    @Column(name = "nome",length = 50)
    private String nome;

    @Column(name = "tbl_usuarios_id",length = 50)
    private String email;

    @JsonFormat(pattern="dd/MM/yyyy")
    @Column(name = "data_realizado")
    private Date dataRealizado;


    //Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataRealizado() {
        return dataRealizado;
    }

    public void setDataRealizado(Date dataRealizado) {
        this.dataRealizado = dataRealizado;
    }
}
