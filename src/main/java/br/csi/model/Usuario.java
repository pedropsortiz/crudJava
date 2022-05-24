package br.csi.model;

//CREATE TABLE USUARIO
//        (
//        idUsuario serial,
//        nomeUsuario varchar(50) not null,
//        emailUsuario varchar(50) unique not null,
//        senhaUsuario varchar(50) not null,
//        dataCadastroUsuario date,
//        ativoUsuario boolean,
//        idPermissao integer,
//        primary key(idUsuario),
//        foreign key (idPermissao) references PERMISSAO(idPermissao)
//        )
//
//        INSERT INTO USUARIO (nomeUsuario, emailUsuario, senhaUsuario, dataCadastroUsuario, ativoUsuario, idPermissao)
//        VALUES ('Cláudio Roberto da Silva', 'claudio.silva@gmail.com', '1234', CURRENT_DATE, true, 1)

import java.sql.Date;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private Date dataCadastro;
    private boolean ativo;
    private Permissao permissao;

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Permissao getPermissao() {
        return permissao;
    }

    public void setPermissao(Permissao permissao) {
        this.permissao = permissao;
    }
}
