package AnatomiaDeClasses.src;

public class MinhaClasse {
    public static void main(String[] args) {
        //ANCI
        System.out.println("Hello World!");

        //ANCII
        int ano = 2021;
        //ano = 2022; // variavel nao pode ter o valor modificado

        final String BR = "Brasil";
        //BR = "Brazil"; // variavel nao pode ter o valor modificado

        //ANCIII
        //Declarando Variaveis
        String meuNome = "Diego";
        int anoFabricacao = 2022;
        boolean verdadeira = true;
        //anoFrabricacao = 2018; // variavel recebe um novo valor

        
        // Declarando Metodos
        String primeiroNome = "Diego";
        String segundoNome = "Jefferson";
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    // Declarando Metodos
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do Metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }





}
