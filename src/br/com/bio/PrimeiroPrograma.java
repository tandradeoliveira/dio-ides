package br.com.bio;

import br.com.bio.model.Gato;

import java.util.Scanner;

public class PrimeiroPrograma extends Gato {

    public static void main(String[] args) {
        Gato gato = new Gato("Mimo", "Preto", 3);
        System.out.println(gato);
        Gato gato1 = new Gato();
        gato1.setNome("Negão");
        System.out.println(gato1.getNome());


        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int a = leitor.nextInt();
        System.out.println("Informe o segundo número: ");
        int b = leitor.nextInt();

        System.out.println("Hello World " + (a + b));
    }

}
