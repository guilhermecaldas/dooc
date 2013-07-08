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
public class Backup {
    private double size;
    private String filename;
    private String filepath;

   
    public void createBackup(Memento m)
    {
        m.setMemento(this);
        m.setDate(new Date());
        m.save();
    }

}

