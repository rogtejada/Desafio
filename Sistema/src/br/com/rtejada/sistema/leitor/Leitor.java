/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtejada.sistema.leitor;

import br.com.rtejada.sistema.entidades.Pessoa;
import br.com.rtejada.sistema.entidades.Storage;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rogte
 */
public class Leitor {
    
    public Leitor(){     
                
    }
    
    public void read() throws FileNotFoundException {
                

        Scanner scanner = new Scanner(new FileReader("C:/Users/rogte/OneDrive/Documentos/arquivo.txt"))
                .useDelimiter(",");
                
        Pessoa p = new Pessoa();
        
        while (scanner.hasNextLine()) {
            p.setNome(scanner.next());
            p.setIdade(scanner.next());
            p.setSalario(scanner.next());
            Storage.save(p);
        }          
        
    }
    
}
