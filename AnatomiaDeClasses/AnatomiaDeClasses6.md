
Anatomia de classes IV

Java Beans
Iniciativa conceitual da comunidade.
A linguagem Java sugere, atraves de convencoes, formas de escrita universal 
para as classes, atributos, metodos e pacotes.



Variaveis
Sugestoes de nomeclaturas.
- Uma variavel deve ser clara, sem abreviacoes ou definicoes sem sentido.
- Uma variavel e sempre no singular, exceto quando se referir a um array ou colecao.
- Defina um idioma unico para suas variaveis. Se declarar uma variavel em ingles, defina todas em ingles.

Nao recomendado
double salMedio = 1500.23 // varivel abreviada
String emails = "aluno@escola.com" // variavel no plural
String myName = " JOSEPH"  // manter o mesmo idioma

Recomendado
double salarioMedio = 1500.23;
String email = "aluno@escola.com";
String[] emails = {"aluno@escola.com", "professor@escola.com"};
String meuNome = "JOSEPH";



Metodos
Metodos sao nomeados como verbos, utilizando letras minusculas, com execao da primeira
letra de cada palavra composta, apartir da segunda palavra.

Exemplos sugeridos:
somar(int n1, int n2){}
abrirConexao(){}
concluirProcessamento(){}

// Existem metodos que ja estao programados pela linguagem(metodos em ingles)
findById(int id){}

// Agora neste metodo existe algo de errado, o nome nao esta d eacordo, 
// pois ele e dubio, traz dificuldade de interpretacao.

calcuarImprimir(){}
