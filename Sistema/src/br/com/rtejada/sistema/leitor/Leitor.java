/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtejada.sistema.leitor;

import br.com.rtejada.sistema.entidades.Pessoa;
import br.com.rtejada.sistema.entidades.Storage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author rogte
 */
public class Leitor {
    
    public Leitor(){     
                
    }
    
    public void read() throws FileNotFoundException, IOException {               
              
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/rogte/OneDrive/Documentos/arquivo.txt"));
              
        
        
        for(int i =0;i<3;i++) {            
            
            String linha = br.readLine();
            String info[] = linha.split(",");
            Pessoa p = new Pessoa();            
            p.setNome(info[0]);
            p.setIdade(info[1]);
            p.setSalario(info[2]);            
            Storage.save(p);
        }         
        
    }
    
}
