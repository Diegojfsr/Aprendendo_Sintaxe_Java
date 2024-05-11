
Tipos e Variaveis - 4

Variaveis e Constantes

Variaveis
- Uma variavel e uma area de memoria associada a um nome.
- Pode armazenar valores de um determinado tipo.
- Um tipo de dado define um conjunto de valores e de operacoes.
- Java e uma linguagem com rigidez de tipos.
- E obrigatorio declarar o tipo de uma variavel.


Constantes
- Constantes sao valores armazenados em memoria.
- Nao podem ser modificadas depois de declaradas.
- Em Java esses valores sao representados pela
palavra reservada final, seguida do tipo.
- Por convencao Constantes sao sempre escritas em CAIXA ALTA.


Abaixo temos um exemplo explicativo de variaveis e contantes.

    public class ExemploVariavel{
        public static void main(String[]args){

            /*
            *esta linha e considerada como declaracao de variavel
            *variavel numero com valor 5 regra: tipo + nome + valor
            */
            int numero = 5;

            /*
            *na linha abaixo iremos alterar o valor da variavel
            *nao e mais necessario, alterar o tipo, pois ele ja foi declarado
            */
            numero = 10;
            System.out.print(numero);

            /*
            *ao usar a palavra reservada final, voce determina uma constante,
            *ou seja essa variavel nao podera receber outro valor,
            *logo essa linha dara um erro de compilacao.
            *isso e considerado uma CONSTANTE na linguagem Java.
            */

            final double VALOR_DE_PI = 3.14;
            VALOR_DE_PI = 3.15; //esta linha dara um erro de compilacao
        }
    }

Obs:
Compreendemos que para declarar uma variavel como uma constante,
utilizamos a palavra final, mas por convensao esta variavel deve
ser escrita toda em caixa alta.



