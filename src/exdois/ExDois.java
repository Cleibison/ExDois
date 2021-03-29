/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exdois;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExDois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int n1; // 1º variavel

        // 2º criart um objeto para capturar dados, objeto teclado usando a classe scanner
        Scanner leia = new Scanner(System.in);
        //COmeçamos criando uma janela que pede ao usuario para digita o numero
        System.out.println("Digite um numero para a tabuada: ");
        //armazenamos na variavel n1 o que foi digitado no teclado
        n1 = leia.nextInt();
        //estrutura de repetição for
        //no for (i = 0 = inicio/<= 10 o sinal de = inclui o numero 10= fim e i++ incremento
        // i++ = significa que é i = i+1
        //for+ctrl+Space
        for (int i = 0; i <= 10; i++) {
            System.out.println(n1 + " x " + i + " = " + (n1*i));
            //para exibir System.out.print
        }
    }
}

        
      
 
