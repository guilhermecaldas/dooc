/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.model;

import java.util.HashMap;

/**
 *
 * @author guilherme
 */
public class ProxyCacheRelatorio {
    
    private static HashMap<String,Relatorio> relatoriosCache=new HashMap<>();
    
    public static Relatorio getRelatoriosChache(String param){
        if(relatoriosCache.containsKey(param)){
            return relatoriosCache.get(param);
        }else{
            
            System.out.println("Relatorio não existe em cache- criando novo");
            return null;
            /*a cache que tem que gerenciar o conteúdo do hash, 
             * sendo assim
             */
        }
    }
}
