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
public class Corretor {
    
    private int codCorretor;
    private String nome;
    private Date dtNasci;

    public Corretor(int codCorretor, String nome, Date dtNasci) {
        this.codCorretor = codCorretor;
        this.nome = nome;
        this.dtNasci = dtNasci;
    }
    
    public int getCodCorretor() {
        return codCorretor;
    }

    public void setCodCorretor(int codCorretor) {
        this.codCorretor = codCorretor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNasci() {
        return dtNasci;
    }

    public void setDtNasci(Date dtNasci) {
        this.dtNasci = dtNasci;
    }
    
    
}
