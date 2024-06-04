package JavaDoc.src;

// Tipos de comentários

public class Comentarios {
    public static void main(String[] args) {
        // (One Line )Olá, eu sou um comentário em uma única linha


        //(Mult Line)
        /* Olá,
        * Eu sou um comentario
        * que posso ser mais detalhadod
        * quando necessário
        */
        
    }

         //(Documentation)
        /** 
         * Estas duas estrelinhas acima
         * é para identificar que você
         * pretende elaborar um comentário
         * a nível de documentação.
         * Que incrível !!!
         */
        public void metodod(){}



        /*         
        * Este método foi elaborado as pressas
        * por isso eu abrevei o nome das variáveis
        * mas olha, ele tem a finalidade de somar ou  multiplicar
        * dois números
        */
        public int somaMultiplica (int n, int x, String m){
            int r = 0; // r é igual ao resultado
            if (m == "M"){ // M= multiplicação
                r= n * x;
            }else{
                // se não soma mesmo
                r = n + x;
            }
            return r;
        }
}
