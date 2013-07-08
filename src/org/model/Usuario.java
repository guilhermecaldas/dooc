/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.model;

/**
 *
 * @author Gilherme,Tailan
 */
public class Usuario {
    
    private int codUsuario;
    private String login;
    private String senha;
    private boolean ativo;

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autenticar()
    {
        return this.ativo 
                && this.login.length()>0
                && this.senha.length()>0;
    }

    public Simulacao SimularParcelmento(Imovel imovel,double renda)
    {
         Simulacao simulador = new Simulacao(this, renda, imovel);
         simulador.gerarSimulacao();
        return simulador;
    }
}
