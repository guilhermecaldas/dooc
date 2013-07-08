/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Tailan
 */
public class Proxy {

    public ArrayList<Imovel> validarAcesso(Usuario u)
    {
        if(u != null){
            Imovel i = new Imovel();
            return i.getImoveis();
       }
        else{
        Imovel i = new Imovel();
            return i.getImoveis();
        }

    }
}
