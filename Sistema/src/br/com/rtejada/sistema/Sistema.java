/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtejada.sistema;

import br.com.rtejada.sistema.comparador.Comparador;
import br.com.rtejada.sistema.leitor.Leitor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author rogte
 */
public class Sistema {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here     
        
       Leitor read = new Leitor();
         
       read.read();        
       
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Escolha uma opçao:");
        System.out.println("Digite 1 para: Realizar media das idades");
        System.out.println("Digite 2 para: Realizar media salario");
        System.out.println("Digite 3 para: Descobrir o maior e menor salario");
        System.out.println("Digite 0 para: encerrar o programa!");
        
        
        Integer resultado1 = new Integer(0);
        Double resultado2 = new Double(0);
        int tec = teclado.nextInt();
        Comparador comp = new Comparador();
        
        do{           
            switch (tec){
                case 1:
                    resultado1 = comp.calcIdadeMedia();
                    System.out.println("Media das Idades: " + resultado1);
                    break;
                case 2:
                    resultado2 = comp.calcSalarioMedia();
                    System.out.println("Media dos Salários: " + resultado2);
                    break;
                case 3:
                    resultado2 = comp.menorSalario();
                    System.out.println("Menor Salario: " + resultado2);
                    resultado2 = comp.maiorSalario();
                    System.out.println("Maior Salario: " + resultado2);
                    break;
                case 0:
                    System.out.println("Fim do Programa!");
                    break;
                default:
                    System.out.println("Digite um Número Válido!");
                    break;            
            }
            tec = teclado.nextInt();
            
        }while(tec != 0); 
         
                 
    }
  
}
