/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entidades;

import Model.Interfaces.ItemOrcamentoInterface;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author JonasJr
 */
public class Orcamento {
    
    private Long id;
    private BigDecimal valor;
    private String observacao;
    private Date dataValidade;
    private Date dataAprovado;
    private Date dataCriacao;
    private List<ItemOrcamentoInterface> itens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Date getDataAprovado() {
        return dataAprovado;
    }

    public void setDataAprovado(Date dataAprovado) {
        this.dataAprovado = dataAprovado;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public List<ItemOrcamentoInterface> getItens() {
        return itens;
    }

    public void setItens(List<ItemOrcamentoInterface> itens) {
        this.itens = itens;
    }
    
    public boolean addItem(ItemOrcamentoInterface item){
        return this.itens.add(item);
    }
    
}
