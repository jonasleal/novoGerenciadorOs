/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entidades;


import Model.Constantes.NivelAcesso;
import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author JonasJr
 */
@Entity
public class Usuario extends Pessoa implements Serializable {

    private String senha;
    private NivelAcesso nivel;

    public Usuario() {
        super();

    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public NivelAcesso getNivel() {
        return nivel;
    }

    public void setNivel(NivelAcesso nivel) {
        this.nivel = nivel;
    }


}
