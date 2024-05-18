
Operadores - 6

Operadores Relacionais 
Os operadores relacionais avaliam a relacao entre duas variaveis ou
expressoes. Neste caso, mais precisamente definem se o operando a 
esquerda e igual, diferente, menor, menor ou igual, maior, maior ou igual 
ao da direita, retornando um valor booleano como resultado.

== Quando desejamos verificar se uma variavel e IGUAL A outra.
!= Quando desejamos verificar se uma variavel e DIFERENTE da outra.
> Quando desejamos verificar se uma variavel e MAIOR QUE a outra.
>= Quando desejamos verificar se uma variavel e MAIOR OU IGUAL a outra.
< Quando desejamos verificar se uma variavel e MENOR QUE outra.
<= Quando desejamos verificar se uma variavel e MENOR OU IGUAL a outra.


Veja o exemplo abaixo.

public class Operadores{
	public static void main(String[]args){
	    int numero1 = 1;
        int numero2 = 2;
        
        boolean sinNao = numero1 == numero2;
        System.out.print("numeroUm e igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;
        System.out.print("numeroUm e diferente a numeroDois?" + simNao);

        simNao = numero1 != numero2;
        System.out.print("numeroUm e diferente a numeroDois?" + simNao);

        simNao = numero1 > numero2;
        System.out.print("numeroUm e maior que o numeroDois?" + simNao);

        if(numero1 < numero2){
        System.out.print("A nossa condicao e verdadeira");
        }

        //Testando Strings
        String nomeUm = "Diego";
        String nomeDois = "Diego";
        System.out.print(nomeUm == nomeDois);

        //Testando Objetos
        String nomeUm = "Diego";
        String nomeDois = new String("Diego");
        System.out.print(nomeUm.equals(nomeDois));
    }
}




