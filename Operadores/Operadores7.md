
Operadores - 7

Operadores Logicos

Os operadores logicos representam o recurso que nos permite criar
expressoes logicas maiores a partir da juncao de duas ou mais expressoes.

&& Operador Logico "E"
|| Operador Logico "OU"


Veja o exemplo abaixo.

public class Operadores{
    public static void main(String[]args){
        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && condicao2){
        System.out.println("As duas condicoes sao verdadeiras");
        }

        if(condicao1 || condicao2){
        System.out.println("Uma das condicoes e verdadeira.");
        }

        System.out.println("Fim")
    }
}

