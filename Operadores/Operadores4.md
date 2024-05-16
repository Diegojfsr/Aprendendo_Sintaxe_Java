
Operadores - 4

Operadores de incremento ou decremento

Operador de incremento. 
Incrementa um valor em um. 
Suponhamos que temos uma variável x do tipo int, se temos x++ é como se fosse x = x + 1.

Operador de decremento. 
Decrementa um valor em um. 
Suponhamos que temos uma variável x do tipo int, se temos x-- é como se fosse x = x - 1.

Veja o exemplo abaixo.

public class Operadores{
    public static void main(String[]args){
        int numero = 5;
        System.out.println(numero ++);
        System.out.println(numero);
        System.out.println(numero --);
        System.out.println(numero);
    }
}

Tambem utilizamos o operador 
negacao (!) para inverter 
variaveis booleanas.

Veja o exemplo abaixo.

public class Operadores{
    public static void main(String[]args){
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);
    }
}
