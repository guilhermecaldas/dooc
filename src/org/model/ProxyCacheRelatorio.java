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
    
    public static Relatorio getRelatorioChache(String param) throws Exception{
        if(relatoriosCache.containsKey(param)){
            return relatoriosCache.get(param);
        }else{
            
            System.out.println("Relatorio não existe em cache- criando novo");
            
            Relatorio newRalatorio=parseParamKey(param);
            
            relatoriosCache.put(param,newRalatorio);
            return newRalatorio;
        }
    }
    
    private static Relatorio parseParamKey(String paramKey) throws Exception{
        String[] params=paramKey.split(";");
        if(params.length>1){
            
            if(params[0].equals("vc")){ //se for relatório de Vendas por Correto
                return new RelatorioVendaCorretor(new Corretor(Integer.parseInt(params[1]),"temp",null));
            }else if(params[0].equals("vp")){ //se for relatório de vendas por período
                //retirar se quinzenal ou mensal
            }else if(params[0].equals("i")){ //se for relatório de imóvel
                //retirar o tipo, valor e tempo
            }
            return null;
        }else{
            throw new Exception("Chave de parametro inválida!");
        }
        
    }
}
