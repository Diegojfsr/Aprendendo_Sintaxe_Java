
Operadores - 5

Operador ternario

O operador de condicao ternaria e uma forma resumida para definir uma condicao
e escolher por um dentre dois valores.
Voce deve pensar numa condicao ternaria como se fosse uma condicao IF normal,
porem de uma forma em que toda a sua estrutura estara ecrita numa unica linha.

O operador ternario e representado pelos simbolos ? : utilizados na seguinte estrutura de sintaxe.

<Expressao Condicional> ? <Caso condicao seja true> : <Caso condicao seja false>


Veja o exemplo abaixo.

// classe Operadores.java
public class Operadores{
    public static void main(String[]args){
        int a, b;
        a = 5;
        b = 6;
        String resultado = "";

        // Exemplo de condicional utilizando estrutura If/Else
        if(a==b)
        resultado = "Verdadeiro";
        else
        resultado = "Falso";
        System.out.println(resultado);

        // Mesma condicional, mas dessa vez utilizando o operador ternario.
        String resultado = (a==b) ? "Verdadeiro" : "False";
        System.out.println(resultado);
    }
}

