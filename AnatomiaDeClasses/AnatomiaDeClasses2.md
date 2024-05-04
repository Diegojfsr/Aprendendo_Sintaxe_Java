
Anatomia de classes II

Padrao de Nomenclatura

Segue abaixo alguns padroes e algumas convencoes de escrita.

- Todo arquivo .java, deve comecar com a letra maiuscula.
- Se a palavra for composta, a segunda letra tambem deve ser maiuscula.
- Nome da classe no arquivo.
- Toda variavel deve ser escrita com letra minuscula, porem se a palavra 
for composta, a segunda letra deve ser mauiscula.(camelCase)
- Existe uma regra adicional para variaveis quando queremos identificar
que ela nao sofrera alteracao de valor.


Segue exemplos abaixo:

String BR = "Brasil"
double PI = 3.14
int ESTADOS_BRASILEIRO = 27
int ANO_2000 = 2000


Recomendacao:
Podemos declarar uma variavel com caracteres, numeros e simbolos.
Porem devemos seguir algumas regras.

- Deve conter apenas letras, _(underline), $ ou numeros de 0-9.
- Deve iniciar por letras, _(underline), $. Nunca numeros.
- Deve iniciar com letra minuscula.
- Nao pode conter espacos.
- Nao pode usar palavra chave da linguagem.
- O nome deve ser unico dentro do escopo.


Declaracao invalida de variaveis

int numero&um = 1;  //Os unicos simbolos permitidos sao _ e $
int 1numero = 1;  //Uma variavel nao pode comecar com numeros
int numero um = 1;  //Nao pode ter espaco no mome da variavel
int long = 1;  //long faz parte das palavras reservadas pela linguagem


Declaracao valida de variaveis

int numero$um = 1;
int numero1 = 1;
int numeroum = 1;
int longo = 1;
