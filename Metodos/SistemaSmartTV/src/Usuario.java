

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        //Chama o metodo tv ligada ou desligada
        System.out.println("TV Ligada?" + smartTv.ligada);
        //Chama o metodo ligar tv
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada?" + smartTv.ligada);

        //chama o metodo aumentar e diminuir volume
        System.out.println("Volume Atual:" + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        //chama o metodo mudar canal
        System.out.println("Canal Atual:" + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Mudando o canal para o canal: " + smartTv.canal);

        //Chama o metodo ligar tv
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada?" + smartTv.ligada);

        //Chama o metodo desligar tv
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada?" + smartTv.ligada);
    }
}
