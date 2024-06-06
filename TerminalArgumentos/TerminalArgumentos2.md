
Terminal e Argumentos 2

Terminal e Argumentos

Nem sempre executamos nosso programa Java pela IDE.
Coma JVM devidamente configurada, nos podemos, criar um 
executavel do nosso programa e disponibilizar o instalador 
para qualquer sistema operacional.

Iremos aprender como executar um programa Java via terminal
como MS-DOS ou terminal do VScode.


Vamos criar uma classe chamada MinhaClasse.java com o código abaixo:

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Oi, fui executado pelo Terminal");
    }
}

Observe que nosso projeto Java criado por uma IDE, 
terá uma pasta chamada bin. É nesta pasta que ficarão 
os arquivos .class, o nosso bytecode.


Mesmo usando uma IDE, nós sempre precisaremos identificar 
aonde se encontram as classes do nosso projeto, no meu 
caso está em: 
C:\estudos\dio-trilha-java-basico\java-terminal.


Terminal

Vamos ilustrar como executar uma classe, depois de compilada, sem precisar usar a IDE.
Abra o MS-DOS ou Power Shell;

Localize o diretório do seu projeto: 
cd C:\estudos\dio-trilha-java-basico\java-terminal;
Acesse a pasta **** bin: ** cd bin**;
Agora digite o comando:**java MinhaClasse ** (nome da sua classe sem a extensão .class).
