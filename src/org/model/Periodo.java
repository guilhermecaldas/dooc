/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.model;

import java.util.Date;

/**
 *
 * @author guilherme
 */
public class Periodo {
    
    private Date data;
    private int tipo;
    public static final int MENSAL=0;
    public static final int QUINZENAL=1;

    public Periodo(Date date, int tipo) {
        this.data = date;
        this.tipo = tipo;
    }

    public Date getDate() {
        return data;
    }

    public void setDate(Date date) {
        this.data = date;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
