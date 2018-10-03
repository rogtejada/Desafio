/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtejada.sistema.entidades;

/**
 *
 * @author rogte
 */
public class Pessoa { 
    
    private String nome;
    
    private Integer idade;
    
    private Double salario;   
    
    public String getNome() {
        return nome;
    }    
    public void setNome(String nome) {
        this.nome = nome;
    }
     public Integer getIdade() {
        return idade;
    }    
    public void setIdade(String idade) {
        this.idade = Integer.parseInt(idade);
    }
     public Double getSalario() {
        return salario;
    }    
    public void setSalario(String salario) {
        this.salario = Double.parseDouble(salario);
    }
       
}
