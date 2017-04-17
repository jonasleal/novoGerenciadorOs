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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author JonasJr
 */
@Entity
@Table(name = "cliente")
public class Cliente extends Usuario implements Serializable {

//    @OneToMany(mappedBy = "cliente", targetEntity = Equipamento.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private List<Equipamento> listaEquipamentos = new ArrayList<>();

    public Cliente() {
        super();

    }

    public Cliente(Long cpf, String senha, String nome, List<Telefone> telefone) {
        super.setCpf(cpf);
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setSenha(senha);
    }

//    public List<Equipamento> getListaEquipamentos() {
//        return listaEquipamentos;
//    }
//
//    public void setListaEquipamentos(List<Equipamento> listaEquipamentos) {
//        this.listaEquipamentos = listaEquipamentos;
//    }
}
