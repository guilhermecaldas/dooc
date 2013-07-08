/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.model;

/**
 *
 * @author guilherme
 */
public class RelatorioVendaPeriodo extends Relatorio{
    
    private Periodo periodo;

    public RelatorioVendaPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
    
    @Override
    public void gerar(){
        if(getResultado()==null){
            setResultado("Resultado venda por período\n");
        }
        
        System.out.println(getResultado());
    }
}
