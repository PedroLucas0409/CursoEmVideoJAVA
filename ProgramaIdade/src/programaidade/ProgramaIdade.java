/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;
/**
 *
 * @author LU
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  t = new Scanner (System.in);
        System.out.println("Digite o Ano do seu Nascimento");
        int nasc = t.nextInt();
        int d = 2023 - nasc;
        System.out.println("Sua idade é " + d);
        if (d> 18){
            System.out.println("Você é maior de Idade");
        }
        else{
            System.out.println("Você é menor de Idade");
        }
        
    }
    
}
