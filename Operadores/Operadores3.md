
Operadores - 3

Operadores Unarios
Esses operadores sao aplicados juntamente com outros operadores aritmeticos.
Eles realizam alguns trabalhos basicos como, incrementar, decrementar e 
inverter valores numericos e booleanos

(+) Operador unario de valor positivo
Numeros sao positivos sem esse operador explicitamente.

(-) Operador unario de valor negativo
nega um numero ou expressao aritmetica.

(++) Operador unario de incremento de valor
Incrementa o valor em uma unidade.

(--) Operador unario de decremento de valor
Decrementa o valor em uma unidade.

(!) Operador unario logico de negacao
Nega o valor de uma expressao booleana.


Veja o exemplo abaixo.

public class Teste {
    public static void main(String[] args) {

        int numero = -5;

        numero = - numero;
        
        System.out.println(numero);

        numero = - numero;
        System.out.println(numero);

        numero = - numero;
        System.out.println(numero);
    }
}

