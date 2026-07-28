package smartTv;

public class usuario {

    public static void main(String [] Args) throws Exception{

        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada?" + " " + smartTv.ligada);
        System.out.println("O volume atual da Tv é:" + " " + smartTv.volume);
        System.out.println("O canal atual da Tv é:" + " " + smartTv.canal);
        System.out.println(" ");

        smartTv.LigarTv ();
        smartTv.DesligarTv();
        smartTv.LigarTv ();

        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.DiminuirVolume();

        smartTv.ProximoCanal();
        smartTv.CanalAnterior();
        smartTv.mudarCanal(15);
    }
}