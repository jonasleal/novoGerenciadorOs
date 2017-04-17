/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author JonasJr
 */
@Entity
public class Pessoa implements Serializable {

    @Id
    private Long cpf;
    @Column(nullable = false)
    private String nome;
    @OneToMany(mappedBy = "telefone", targetEntity = Pessoa.class, fetch = FetchType.EAGER)
    private List<Telefone> telefone;
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Pessoa() {
        telefone = new ArrayList<>();
    }

    public Pessoa(long cpf, String nome, List<Telefone> telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Long getCpf() {
        return this.cpf;
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

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }

    public void addTelefone(Telefone telefone) {
        for (Telefone tel : this.telefone) {
            if (tel.getNumero().equals(telefone.getNumero())) {
                return;
            }
        }
        telefone.setProprietaro(this);
        this.telefone.add(telefone);
    }

    public void removerTelefone(Telefone telefone) {
        this.telefone.remove(telefone);
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + '}';
    }
    
    

}
