
Metodos 2

Todas as acoes da aplicacao sao consideradas metodos.
Uma classe e definida por atributo e metodos.
Atributos sao em sua grande maioria, variaveis de diferentes tipos e valores.
Os metodos correspondem a funcoes ou sub-rotinas disponiveis dentro de nossas classes.

Criterios de nomeacao de metodos
Esses criterios nao sao obrigatorios, mas e recomendavel que sejam seguidos,
pois essas convencoes facilitam a vida dos programadores ao trabalharem em 
codigos de forma colaborativa. Ao seguir essas convencoes, tornamos o codigo
mais legivel para nos e tambem para outras pessoas.

Para metodos os criterios sao:
- Deve ser nomeado como verbo.
- Seguir o padrao camelCase(Todas as letras minusculas com execao da primeira letra da segunda palavra)


Exemplos sugeridos para nomeclatura de metodos:
    somar(int n1, int n2){}
    abrirConexao(){}
    concluirProcessamento(){}
    findById(int id){} //Esse e um metodo muito comum, veremos muito ele.
    calcularImprir(){} //Metodo com conflito de finalidade, o nome deve ser referente ao que o metodo faz.

Atencao:
Nao exite em Java o cenceito de metodos globais.
Todos os metodos devem sempre ser definidos dentro de uma classe.


Criterios de definicao de metodos
Como sabemos a melhor forma de definir os metodos das nossas classes?
Para chegar a conclusao somos auxiliados por uma convencao estrutural para todos os metodos.

Essa convencao e determinada pelos aspectos abaixo:

1. Qual a proposta principal do metodo?
Voce deve se perguntar constantemente ate compreender a real finalidade do mesmo.

2. Qual o tipo de retorno esperado apos executar o metodo?
Voce deve analisar se o metodo sera responsavel por retornar algum valor ou nao.

Caso o metodo nao retorne nenhum valor, ele sera representado pela palavra-chave void.


Mais alguns aspectos:

1. Quais os parametros serao necessarios para execulsao do metodo?
Os metodos as vezes precisao de argumentos como criterios para execucao.

2. O metodo possui o risco de apresentar alguma excecao?
Ececoes sao comuns na execucao de metodos, as vezes e necessario prever
e tratar a possivel existencia de uma execao.

3. Qual a visibilidade do metodo?
Sera necessario que o metodo seja visivel a toda aplicacao, somente em pacotes
atraves de heranca ou somente a nivel a propria classe.



