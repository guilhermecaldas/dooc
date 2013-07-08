/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.model;

/**
 *
 * @author guilherme
 */
public class RelatorioFactory {
  
    public static Relatorio getRelatorio(Corretor corretor) throws Exception{
        return ProxyCacheRelatorio.getRelatorioChache(corretor);
    }
    
    public static Relatorio getRelatorio(Periodo periodo) throws Exception{
        return ProxyCacheRelatorio.getRelatorioChache(periodo);
    }
    
    public static Relatorio getRelatorio(String tipo,double valor,Periodo tempo) throws Exception{
        return ProxyCacheRelatorio.getRelatorioChache(tipo, valor, tempo);
    }

}
