/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.model;

import java.util.ArrayList;

/**
 *
 * @author tailan
 */
public class Imovel {

    private int codImovel;
    private String descricao;
    private double altura;
    private double largura;
    private double comprimento;
    private String imagem;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getCodImovel() {
        return codImovel;
    }

    public void setCodImovel(int codImovel) {
        this.codImovel = codImovel;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    public ArrayList<Imovel> getImoveis()
    {
        return new ArrayList<Imovel>();
    }

    public double calculaArea(){
        return this.altura * this.comprimento * this.largura;
    }
}
