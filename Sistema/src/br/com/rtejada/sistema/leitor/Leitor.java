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
import java.util.Scanner;


/**
 *
 * @author rogte
 */
public class Leitor {
    
    BufferedReader br = null;
    
    public Leitor(){     
                
    }    
       
    public void read() throws FileNotFoundException, IOException { 
        Boolean ok = new Boolean(false);
        String arq = new String();
        Scanner scan = new Scanner(System.in);      
                
        do{ 
            try{ 
                System.out.println("Digite o caminho correto do arquivo:");
                arq = scan.nextLine();
                br = new BufferedReader(new FileReader(arq));
                ok=true;
                armazena();
                
                
            }catch(FileNotFoundException e){
                ok=false;
                System.out.println("Arquivo Nao encontrado!");                    
                                
            }
        }while(ok!=true);     
               
         
    }
    
    public void armazena() throws IOException{
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

    

