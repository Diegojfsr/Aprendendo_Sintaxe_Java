
Terminal e Argumentos 5

Scanner

Nos exemplos anteriores percebemos que podemmos receber dados digitados
pelo usuario do nosso sistema, porem tudo precisa estar em uma linha e 
tambem e necessario informar os valores nas posicoes correspondentes.
Esta abordagem pode deixar margens de execucao com erro do nosso programa.
Para isso com a finalidade de deixar as nossas entradas de dados mais 
seguras, agora vamos receber estes dados via Scanner.

A classe Scanner permite que o usuario tenha uma interacao mais acertiva
com o nosso programa, veja como vamos mudar o nosso programa AboutMe
para deixar mais intuitivo aos usuarios.

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        
    }
}





