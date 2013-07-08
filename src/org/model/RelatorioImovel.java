/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.model;

/**
 *
 * @author guilherme
 */
public class RelatorioImovel extends Relatorio{
    
    private String tipo;
    private double valor;
    private Periodo tempo;

    public RelatorioImovel(String tipo, double valor, Periodo tempo) {
        this.tipo = tipo;
        this.valor = valor;
        this.tempo = tempo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Periodo getTempo() {
        return tempo;
    }

    public void setTempo(Periodo tempo) {
        this.tempo = tempo;
    }
    
    @Override
    public void gerar(){
        if(getResultado()==null){
            setResultado("Resultado venda por imóvel\n");
        }
        
        System.out.println(getResultado());
    }
}
