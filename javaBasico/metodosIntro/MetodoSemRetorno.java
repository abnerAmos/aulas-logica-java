package javaBasic.metodosIntro;

import java.util.Scanner;
public class MetodoSemRetorno {

    public static void main(String[] args) {

        cadastroCliente();
        System.out.println("Obrigado por se cadastrar!");
    }

    static void cadastroCliente() {                                 // Métodos VOID não tem retorno (return)
        Scanner input = new Scanner(System.in);

        System.out.println("Para se cadastrar informe seus dados");
        System.out.print("Nome: ");
        String nome = input.nextLine();                             // Dados de entrada (Parametros/argumentos)
        System.out.print("Ano Nascimento: ");
        int anoNasc = input.nextInt();                              // Dados de entrada (Parametros/argumentos)
        int anoAtual = 2022;

        int idadeAtual = anoAtual - anoNasc;
    }
}
