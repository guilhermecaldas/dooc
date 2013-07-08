/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.model;

/**
 *
 * @author guilherme
 */
public abstract class Relatorio {
    
    private String resultado=null;
    
    public void gerar(){
        
    }
    
    public void setResultado(String resultado){
        this.resultado=resultado;
    }
    
    public String getResultado(){
        return resultado;
    }
}
