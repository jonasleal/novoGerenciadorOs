/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author JonasJr
 */
@Entity
public class Rua implements Serializable{
    @Id
    private Integer cep;
    @ManyToOne
    private Cidade cidade;
    @ManyToOne
    private Bairro bairro;
    private String nome;

    public Rua() {
    }

    public Rua(Cidade cidade, String nome) {
        this.cidade = cidade;
        this.nome = nome;
    }

    public Rua(Integer cep, Cidade cidade, String nome) {
        this.cep = cep;
        this.cidade = cidade;
        this.nome = nome;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
