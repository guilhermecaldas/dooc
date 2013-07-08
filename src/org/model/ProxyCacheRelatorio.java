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
    
    public static Relatorio getRelatorioChache(Corretor corretor) throws Exception{
        if(relatoriosCache.containsKey(""+corretor.getCodCorretor())){
            return relatoriosCache.get(corretor);
        }else{
            System.out.println("Relatorio não existe em cache- criando novo");
            
            RelatorioVendaCorretor relatorio=new RelatorioVendaCorretor(corretor);
            relatoriosCache.put(""+corretor.getCodCorretor(),relatorio);
            return relatorio;
        }
    }
    
    public static Relatorio getRelatorioChache(Periodo periodo) throws Exception{
        if(relatoriosCache.containsKey(""+periodo.getDate()+";"+periodo.getTipo())){
            return relatoriosCache.get(""+periodo.getDate()+";"+periodo.getTipo());
        }else{
            System.out.println("Relatorio não existe em cache- criando novo");
            
            RelatorioVendaPeriodo relatorio=new RelatorioVendaPeriodo(periodo);
            relatoriosCache.put(""+periodo.getDate()+";"+periodo.getTipo(),relatorio);
            return relatorio;
        }
    }
    
    public static Relatorio getRelatorioChache(String tipo,double valor,Periodo tempo) throws Exception{
        if(relatoriosCache.containsKey(""+tipo+";"+valor+";"+tempo.getDate()+";"+tempo.getTipo())){
            return relatoriosCache.get(""+tipo+";"+valor+";"+tempo.getDate()+";"+tempo.getTipo());
        }else{
            System.out.println("Relatorio não existe em cache- criando novo");
            
            RelatorioImovel relatorio=new RelatorioImovel(tipo,valor,tempo);
            relatoriosCache.put(""+tipo+";"+valor+";"+tempo.getDate()+";"+tempo.getTipo(),relatorio);
            return relatorio;
        }
    }
    
}