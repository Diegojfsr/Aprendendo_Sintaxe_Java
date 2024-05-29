
Escopo 2


O escopo pode ser entendido como o ambiene onde uma variavel pode ser acessada.
Em Java o escopo de variaveis vai de acordo com o bloco onde foi declarada.

A variavel e criada no primeiro acesso a ela, se tornando inacessivel apos o 
interpretador sair do bloco de execucao ao qual ela pertence.
Portanto esta variavel nao pode ser lida ou manipulada por rotinas e codigos 
que estao fora do seu bloco de declaracao, ou seja, fora do escopo da variavel.

Em uma classe podemos visualizar a diferenca de escopos.
Os atributos(variaveis) sao declarados no corpo principal
da classe, sendo portanto acessivel por todos os metodos.

Caso voce declare uma variavel dentro de um metodo, o escopo desssa
variavel esta limitado ampenas ao corpo de metodo, ou seja,
dentro das chaves que limitam o metodo.

Uma parte fundamental na elaboracao de algoritmos simples ou complexos e 
determinar a localizacao do codigo em questao.
Sem um dominio sobre escopo de codigos seu projeto tende a conter falhas
estruturais e comprometer a proposta principal da aplicacao.

Veja o exemplo abaixo.

public class Conta{

    //variavel da classe conta
    double saldo = 10.0;

    public void sacar(Double valor){
        //variavel local de metodo
        double novoSaldo = saldo-valor;
    }

    public void imprimirSaldo(){
        //disponivel em toda a classe
        System.out.println(saldo);
        //somente o metodo sacar conhece esta variavel
        System.out.println(novoSaldo);
    }


    public double calcularDividaExponencial(){
        //variavel local de metodo
        double valorParcela = 50.0;
        double valorMontante = 0.0;

        for(int x=1; x<=5; x++){    //x variavel de escopo de fluxo
            //esta variavel sera reiniciada a cada execusao
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;'
        }
    }
    //escopo de fluxo
    //x e valorCalculado nunca estarao disponiveis fora do bloco
    return valorMontante;
}
