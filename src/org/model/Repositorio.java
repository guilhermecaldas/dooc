/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.model;

import org.control.Conexao;

/**
 *
 * @author Tailan
 */
public abstract class Repositorio implements ICrud{

    private Conexao connection;

    public Repositorio() {
        this.connection = Conexao.getInstance();
    }
    

}
