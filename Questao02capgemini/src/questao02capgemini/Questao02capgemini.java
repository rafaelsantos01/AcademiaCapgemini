package questao02capgemini;
/* Classe para main, responsavel pela execução do programa
* @author Rafael P. Santos
* @version 1.00
*/

import java.awt.BorderLayout;
import java.util.Scanner;

/* Algoritimo responver por verificar se a senha digitana no console possui 6 digitos, caso não tenha
 *o programa informa quantos digitos devem ser acrescentados */

public class Questao02capgemini {
    
    public static String verificaSenha(String senha){
        Scanner entrada = new Scanner(System.in);      
        String passou = "Sua senha passou no teste";
        
        do{ // laço de repeitição tem a função de repetir o codigo ate que o usuario digite uma senha valida
        
        System.out.println("Verificando...");
        
        if(verificaSenhaForte(senha)){// .length usado para contar quantas letras tem a String
            int i = senha.length();
            int j = 6 - i;
            System.out.println("Sua senha possui menos de 6 digitos aconselhamos adicionar mais "+ j +" Caracteres");
            System.out.println("Aconcelhamos o uso dos caracteres especiais !@#$%¨&*()+-");
            System.out.println("Digite a sua senha:");
            senha = entrada.nextLine();
            verificaSenha(senha);
        }else{
            System.out.println("Sua senha é uma senha forte!");
        }
        }while(senha.length()< 6);//o laço so se encerra caso o usuario digite uma senha com 6 digitos.
        return passou;
        
    }
    
    public static boolean verificaSenhaForte(String senha){
        if(senha.length()< 6) return true;
        else return false;
    }
    
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String senha = "";
        
        System.out.println("Digite a sua senha:");
        senha = entrada.nextLine();
        
        System.out.println(verificaSenha(senha));
        
    }
}
