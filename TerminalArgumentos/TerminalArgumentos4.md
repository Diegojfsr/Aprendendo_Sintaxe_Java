

Terminal e Argumentos 4

Passando valores aos argumentos pelo VsCode:


> Barra de menus do VsCode
> Executar
> Adicionar Configuracao
> Dentro de configuracoes podemos alterar os valores dos Argumentos

{
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "request": "launch",
            "mainClass": "AboutMe",
            "args": ["Diego", "Jefferson", "25", "1.80"]
        }
    ]
}


Executando o programa agora no terminal:

cd C:\estudos\dio-trilha-java-basico\java-terminal
cd bin

java AboutMe Diego Jefferson 25 1.80
