
Palavras Reservadas 2

Palavras reservadas sao identificadores de uma liguagem que ja possuem
uma finalidade especifica, portanto nao podem ser utilizados para nomear
variaveis, classes, metodos ou atributos.

A linguagem Java possui 52 palavras reservadas.
Essas palavras sao classificadas em grupos e escritas com letra minuscula, 
sendo identificadas com uma cor especial pela maioria das IDEs.
Abaixo temos uma lista de palavras agrupadas por sua finalidades.


Palavras reservadas em Java
abstract  continue  goto  packge  synchronized
assert  default  if  private  this
boolean  do  implements  protected  throw
break  double  import  public  throws
byte  else  instanceof  return  transient
case  extends  int  short  try
catch  final  interface  static  void
char  finally  long  strictfp  volatile
class  float  native  super  while
const  for  new  switch


Controle de pacotes
- import, importa pacotes ou classes para dentro do codigo
- package, especifica a que pacote todas as classes de um arquivo pertencem

Modificadores de acesso
- public, acesso de qualquer classe
- private, acesso apenas dentro da classe
- protected, acesso por classes no mesmo pacote e subclasses

Primitivos
- boolean, um valor indicando verdadeiro ou falso
- byte, um inteiro de 8 bits(signed)
- char, um character unicode(16-bit unsigned)
- double, um nomero de ponto flutuante de 64 bits(signed)
- float, um numero de ponto flutuante de 32 bits(signed)
- int, um inteiro de 32 bits(signed)
- long, um inteiro de 64 bits(signed)
- short, um inteiro de 32 bits(signed)
- void, indica que o metodo nao tem retorno de valor



Modificadores de classes
- abstract, classe que nao ppode ser instanciada ou metodo que precisa ser 
implementado por uma subclasse nao abstrata
- class, especifica uma classe
- extends, indica a superclasse que a subclasse esta estendendo
- final, impossibilita que uma classe seja estendida, que um metodo
seja sobrescrito ou que uma variavel seja reiniciada
- implements, indica as interfaces que uma classe ira implementar
- interface, especifica uma interface
- native, indica que um metodo esta escrito em uma linguagem dependente
de plataforma, como o C
- new, instancia um novo objeto, chamando seu construtor
- static, faz um metodo ou variavel pertencer a classe ao inves de 
as instancias
- strictfp, usado em frente a um metodo ou classe para indicar que os
numeros de ponto flutuante seguirao as regras de ponto flutuante
em todas as expressoes
- synchronized, indica que um metodo so pode ser acessado por uma 
thread de cada vez
- transient, impede a serialização de campos
- volate, idica que uma variavel pode ser alterada durante o uso de threads


Controle de fluxo dentro de um bloco de codigo
- break, sai do bloco de codigo em que ele esta
- case, executa um bloco de codigo dependendo do teste do switch
- continue, pula a execucao do codigo que viria apos essa linha e
vai para a proxima passagem do loop
- default, executa esse bloco de código caso nenhum dos teste de switch-case seja verdadeiro
- do, executa um bloco de código uma vez, e então realiza um teste em conjunto com o while 
para determinar se o bloco deverá ser executado novamente;
- else, executa um bloco de código alternativo caso o teste "if" seja falso
- for, usado para realizar um loop condicional de um bloco de código
- if, usado para realizar um teste lógico de verdadeiro ou falso
- instanceof, determina se um objeto é uma instância de determinada 
classe, superclasse ou interface
- return, retorna um método sem executar qualquer código, que venha depois 
desta linha (também pode retornar uma variável)
- switch, indica a variável a ser comparada nas expressões case
- while, executa um bloco de código repetidamente enquanto a condição for verdadeira














