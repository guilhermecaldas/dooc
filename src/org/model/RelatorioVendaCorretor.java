/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.model;

/**
 *
 * @author guilherme
 */
public class RelatorioVendaCorretor extends Relatorio {

    private Corretor corretor;

    public RelatorioVendaCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }
}
