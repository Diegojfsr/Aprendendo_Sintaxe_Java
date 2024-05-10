
Tipos e Variaveis - 3

Tipos de Dados
No java existem algumas palavras reservadas para a representacao do tipo de dados basicos.
Esses tipos sao conecidos como tipos primitivos(Primitive Types)

Os oito tipos primitivos sao:
Int, byte, short, long, float, double, boolean e char.
Esses tipos representam objetos e portanto representam valores brutos.
Eles sao armazenados diretamente na pilha de memoria(Memory Stack)

Tabela de tipos primitivos e seus valores
Tipo 	Memoria 	ValorMinimo 			ValorMaximo
byte	1byte		-128				127
short	2bytes		-32.768				32.768
int	4bytes		-2.147.483.648			2.147.483.648
long	8bytes		-9.223.372.036.854.775.808	9.223.372.036.854.775.808


Os tipos primitivos podem conter partes fracionarias e sao representados por dois tipos.
Tipo 	Memoria 	ValorMinimo 	ValorMaximo
float	4bytes		-3,4028E + 38	3,4028E + 38
double	8bytes		-1,7976E + 308	1,7976E + 308

O tipo float e menos utilizado pois sofre uma limitacao que compromete seu uso.
Ele mantem uma precisao decimal somente entre 6 e 7 digitos.

Atualmente os computadores modernos tornou desnecessario o usu dos typos
short e byte pois nao precisamos nos preocupar tanto com espaco de memoria.

Dificilmente utilizaremos o tipo long, pois nao e comum trabalhar com valores tao grandes.

Para reprentar numeros na maioria das vezes utilizamos o tipo int para numeros inteiros e 
o tipo double para representar numeros fracionados.


O ponto mais relevante para compreender a definicao dos tipos de dados e o momento da definicao do tipo para uma variavel.
Qual tipo de dados eu utilizaria para determinar a idade de uma pessoa ou o salario de um funcionario.



Declaracao de Variaveis
Variavel e uma identificacao de um espaco em memoria utilizado pelo nosso programa. 
Seguindo as convencoes em linguagem de programacao, toda a variavel e composta por:
tipo de dados + identificacao + valor atribuido.

A estrutura padrao para se declarar uma variavel sempre e:
<tipo> <nomeVariavel> <atribuicaoDeValorOpcional>

Exemplos abaixo:
int idade; //Tipo "int", nome "idade", com nenhum valor atribuido.
int anoFabricacao = 2021; //Tipo "int", nome "anoFabricacao",valor atribuido "2021"
double salarioMinimo = 2.500; (dois virgula cinco)//Tipo "double", nome "salarioMinimo",valor atribuido "2.500"
double salarioMinimo2 = 2500;(dois mil e quinhentos)
double salarioMinimo3 = 2500.35;(dois mil e quinhentos virgula trintae cinco)

Atencao: Existem particularidade ao trabalhar com alguns tipos em especifico.
Observe o exemplo abaixo:

public class TipoDados {
	public static void main(String[]args){
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se comecar com 0, talvez tenha que ser outro tipo(String)
		long cpf = 98765432109L; // se comecar com 0, talvez tenha que ser outro tipo(String)
		float pi = 3.14F; // tipos float tem que terminar com F
		double salario = 1275.33;
	}
}

Observe sempre, o tipo long precisa termiar com L e o tipo float precisa termiar com F, 
alguns senarios do dia a dia podem estimular um alteracao de tipo de dados.

Muitas vezes criamos uma variavel, definimos um valor correspondente, manipulamos essa variavel e 
temos a consciencia de seu valor na aplicacao, mas cuidado.
O Java e fortemente tipado.

Veja o cenario abaixo:

// TipoEVariaveis.java
short numeroCurto = 1;
int numeroNormal = numeroCurto;
shor numeroCurto2 = numeroNormal;(seria necessario uso do casting)


