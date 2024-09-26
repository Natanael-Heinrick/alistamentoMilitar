import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        System.out.println("BEM VINDO AO ALISTAMENTO MILITAR!");

        //
        Scanner alistamento = new Scanner(System.in);

        // COLETANDO O NOME DO USUÁRIO
        System.out.println("Informe seu nome: ");
        String nome = alistamento.nextLine();

        // COLETANDO O ANO DE NASCIMENTO DO USUÁRIO
        System.out.println("Informe seu ano de nascimento: ");
        int ano = alistamento.nextInt();

        //CALCULANDO A IDADE

        int idade = (2024 - ano);

        if (idade >= 18){
            int tempoFaltando = idade - 18;
            System.out.println("Você já pode se alistar " + nome + ", pois você já tem: " + idade + " e já se passaram: " + tempoFaltando + " anos para se alistar");
        } else{
            int tempoFaltando = 18 - idade;
            System.out.println("Você não pode se alistar " + nome + ", pois ainda falta: " + tempoFaltando + " anos para se alistar");
        }
    }
}