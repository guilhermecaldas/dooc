/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.model;

/**
 *
 * @author Tailan
 */
public class Simulacao {

    private Usuario usuario;
    private double renda;
    private Imovel imovelDesejado;
    private int qtdParcela;
    private double valorParcela;

    public Simulacao(Usuario usuario, double renda, Imovel imovelDesejado) {
        this.usuario = usuario;
        this.renda = renda;
        this.imovelDesejado = imovelDesejado;
    }

    public Simulacao gerarSimulacao()
    {
        this.qtdParcela = 0;
        this.valorParcela = 0;
        return this;
    }

    public Imovel getImovelDesejado() {
        return imovelDesejado;
    }


    public int getQtdParcela() {
        return qtdParcela;
    }

  

    public double getRenda() {
        return renda;
    }


    public Usuario getUsuario() {
        return usuario;
    }

  

    public double getValorParcela() {
        return valorParcela;
    }

   



}
