
Java Doc - 2

Documentacao 
Uma das maiores caracteristicas da linguagem Java e que desde suas
primeiras versoes tinhamos em nossas maos uma documentacao rica e
detalhada dos recursos da linguagem.

Conforme site oficial, podemos compeender e explorar todos os recursos
organzados por pacotes e classes bem especificas sem nem mesmo
escrever uma linha de codigo.

Hoje costuma-se afirmar que para se tornar um desenvolvedor nivel avancado
e um requisito imprescindivel adquirir a habilidade de compreender a 
documentacao oficial da linguagem e dos frameworks que sao 
incorporados aos projetos atuais.


Tags 
Mas e quais as informacoes que obtemos atraves de classes documentadas na linguagem?
Java Documentation e consposto por tags que representam dados
relevantes para a compreensao da proposta de uma classe e os conjuntos de seus metodos 
a atributos conforme tabela abaixo.


Tag         Descricao  
@autor      Autor/Criador  
@version    Versao do recurso disponibilizado  
@since      Versao/Data de inicio da disponibilizacao do   recurso  
@param      Descricao dos parametros dos metodos criados  
@return     Definicao do tipo de retorno um metodo  
@throws     Se o metodo lanca alguma execao  


Javadoc
E um gerador de documentacao criado pela Sun Microsystems para
documentar a API dos programas em JAVA a partir do codigo-fonte.
O resultado e expresso em HTML.
E cosntituido basicamente por algumas
marcacoes muito simples inseridas nos comentarios do programa.

Este sistema, é o padrão de documentação de classes em Java, 
onde muitas das IDEs desta linguagem irão automaticamente 
gerar um Javadoc em HTML.

Criando nossa documentação no formato html, para disponibilizar via web.

// No terminal execute o comando abaixo
javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
