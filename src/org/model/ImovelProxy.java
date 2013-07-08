/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.model;

import java.util.ArrayList;

/**
 *
 * @author Tailan
 */
public class ImovelProxy extends Imovel {

    public ArrayList<Imovel> getImoveis()
    {
        Imovel i = new Imovel();
        ArrayList<Imovel> list = i.getImoveis();
        ArrayList<Imovel> listproxy = new ArrayList<>();
        for (Imovel o : list) {
            Imovel proxy = new Imovel();
            proxy.setCodImovel(o.getCodImovel());
            proxy.setDescricao(o.getDescricao());

            listproxy.add(proxy);
        }
        return listproxy;
    }

}

