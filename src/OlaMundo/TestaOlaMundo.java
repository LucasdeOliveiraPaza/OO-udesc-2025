package OlaMundo;

import java.util.Scanner;

public class TestaOlaMundo {
    public static void main(String[] args) {
        OlaMundo mundo = new OlaMundo();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        mundo.imprimir(nome, idade);
    }
}
