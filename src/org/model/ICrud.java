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
public interface ICrud {

   public void Salvar(Object o);
   public void Editar(Object o);
   public void Alterar(Object o);
   public void Excluir(Object o);
   public ArrayList<Object> Listar(Object parameter);
   public ArrayList<Object> Listar();

}
