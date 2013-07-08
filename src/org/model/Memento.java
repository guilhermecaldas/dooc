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
public class Memento {
    private Backup memento;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Backup getMemento() {
        return memento;
    }

    public void setMemento(Backup memento) {
        this.memento = memento;
    }
    public void save(){
        //salva o arquivo
    }

    public Backup restoreBackup(){
        return this.memento;

    }
    

}
