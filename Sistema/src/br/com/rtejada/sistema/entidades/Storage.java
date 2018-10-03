/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtejada.sistema.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rogte
 */
public class Storage {  
    
    public Storage(){}
    
    private static List<Pessoa> pessoas = new ArrayList<>();
    
    public static void save(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    
    public static List<Pessoa> getPessoas(){        
        return pessoas;
    }
    
}
