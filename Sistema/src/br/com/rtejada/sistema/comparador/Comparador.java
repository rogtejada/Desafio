/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtejada.sistema.comparador;

import br.com.rtejada.sistema.entidades.Pessoa;
import br.com.rtejada.sistema.entidades.Storage;
import java.util.List;

/**
 *
 * @author rogte
 */
public class Comparador {    
    
    
    public Comparador(){  }                              
        
    

    public Integer calcIdadeMedia(){
        List<Pessoa> pessoas = Storage.getPessoas();
        Integer idadetotal = new Integer(0);

        for(int i=0; i<pessoas.size(); i++){            
                idadetotal += pessoas.get(i).getIdade();            
        }

        int media = idadetotal/pessoas.size();
            
        return media;        
    }
    
    public Double calcSalarioMedia(){
        List<Pessoa> pessoas = Storage.getPessoas();
        Double salariototal = new Double(0);
        
        for(int i=0; i<pessoas.size(); i++){            
                salariototal += pessoas.get(i).getSalario();            
        }
        
        Double media = salariototal/pessoas.size();
        
        return media;
    }
    
    public Double menorSalario(){
        List<Pessoa> pessoas = Storage.getPessoas();        
        Double menor = new Double(0);
        
        for(int i=0; i<(pessoas.size()-1); i++){            
            if((pessoas.get(i).getSalario()) < (pessoas.get(i+1).getSalario())){
                menor = pessoas.get(i).getSalario();
            }else{
                menor = pessoas.get(i+1).getSalario();
            }           
        }
                
        return menor;
    }
    
    public Double maiorSalario(){
        List<Pessoa> pessoas = Storage.getPessoas();        
        Double maior = new Double(0);
        
        for(int i=0; i<(pessoas.size()-1); i++){            
            if((pessoas.get(i).getSalario()) > (pessoas.get(i+1).getSalario())){
                maior = pessoas.get(i).getSalario();
            }else{
                maior = pessoas.get(i+1).getSalario();
            }           
        }
                
        return maior;
    }
}
    

