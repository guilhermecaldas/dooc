/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control;

/**
 *
 * @author guilherme
 */
public class Conexao {
    private static Conexao instance;

    private Conexao()
    {
        instance = new Conexao();
    }

    public static Conexao getInstance()
    {
        if(instance == null)
            return new Conexao();
        return instance;
    }
    
}
