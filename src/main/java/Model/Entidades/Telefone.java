/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entidades;


import Model.Constantes.TelefoneTipo;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author JonasJr
 */
@Entity
public class Telefone implements Serializable {

    @Id
    @ManyToOne
    private Pessoa proprietaro;
    @Id
    private Long numero;
    private TelefoneTipo tipo;

    public Telefone() {
    }

    public Telefone(Long numero, TelefoneTipo tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Pessoa getProprietaro() {
        return proprietaro;
    }

    public void setProprietaro(Pessoa proprietaro) {
        this.proprietaro = proprietaro;
    }

    @Override
    public String toString() {
        return "Telefone{ numero=" + numero + ", tipo=" + tipo + '}';
    }

    public TelefoneTipo getTipo() {
        return tipo;
    }

    public void setTipo(TelefoneTipo tipo) {
        this.tipo = tipo;
    }

}
