package br.csi.model;

/*
CREATE TABLE PERMISSAO
(
	idPermissao serial,
	nomePermissao varchar(25) not null,
	primary key(idPermissao)
)

insert into permissao (nomePermissao) VALUES ('ADMIN')

select * from permissao
*/

public class Permissao {

    private int id;
    private String nome;

    public Permissao (int it, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
