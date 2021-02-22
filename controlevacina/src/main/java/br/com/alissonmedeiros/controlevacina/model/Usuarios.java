package br.com.alissonmedeiros.controlevacina.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.util.Date;

//Ele é uma entidade que vai ser gerenciada pela minha ferramenta de ORM no caso ser gerenciada pelo JPA e essa classe vai corresponder a uma tabela do BD
@Entity
@Table(name = "tbl_usuarios", schema = "db_controle_vacinas_zup")
public class Usuarios {

    //Essa anotacao indica que o ID é minha chave primária e vai ser auto incrementavel no sistema
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cpf")
    private Long cpf;

    @Column(name = "nome",length = 100,unique = true)
    private String nome;

    @Column(name = "email",length = 100,unique = true)
    private String email;

    @JsonFormat(pattern="dd/MM/yyyy")
    @Column(name = "dataNascimento")
    private Date dataNascimento;


    //Getters and Setters
    public Integer getId() {        return id;    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
