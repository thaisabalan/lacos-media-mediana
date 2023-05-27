/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.atividade2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class atividade2 {
    public static void main(String args[]){  
   
        Scanner teclado = new Scanner(System.in);   
        
        int quantidade;
        double soma = 0, media, mediana;
        double maior = 0;
        double menor = 999999999;
        
        System.out.printf("Por favor insira a quantidade de repeticoes: \n");
        
        quantidade = teclado.nextInt();
        
        Double[] numeros = new Double[quantidade];
        
        for(int i = 0; i < quantidade; i++){
             numeros[i] = teclado.nextDouble();
             soma += numeros [i];
             
             if(numeros[i] > maior){
                 maior = numeros[i];
             }
             
             if(numeros[i] < menor){
                 menor = numeros[i];
             }
        }
             media = soma / quantidade;
             
             Arrays.sort(numeros);
             int tam = numeros.length;
             if(tam % 2 == 0){
                 mediana = (numeros[tam - 1] + numeros[tam]) / 2.0;
             }else{
                 tam = (tam + 1) / 2;
                 mediana = numeros[tam - 1];
             }
        
             System.out.println("Seu amior valor e: " + maior);
             System.out.println("Seu menor valor e: " + menor);
             System.out.println("Sua media e: " + media);
             System.out.println("Sua meiana e: " + mediana);
             
             
    	System.exit(0);	 
	}
}
