/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entidades;

import Model.Interfaces.ItemOrcamentoInterface;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author JonasJr
 */
public class Servico implements ItemOrcamentoInterface{
    
    private String nome;
    private String descicao;
    private BigDecimal valor;
    private List<String> material;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public List<String> getMaterial() {
        return material;
    }

    public void setMaterial(List<String> material) {
        this.material = material;
    }
    
    public boolean addMaterial(String material){
        return this.material.add(nome);
    }
    
}
