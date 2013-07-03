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
        /*a chave gerada fica:
         * vc;idCorretor
         * vc=venda corretor
         * idCorretor=variavel com o id do objeto
         */
        return ProxyCacheRelatorio.getRelatorioChache("vc;"+corretor.getCodCorretor());
    }

}
