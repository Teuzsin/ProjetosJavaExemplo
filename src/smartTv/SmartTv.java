package smartTv;

public class SmartTv {

    boolean ligada = false;                 // definição de variáveis
    int volume = 25;
    int canal = 6;

    //Métodos para definir estado da TV

    public void LigarTv(){
        System.out.println("A televisão agora está ligada: " + " " + !ligada);
    }
    public void DesligarTv(){
        System.out.println("A televisão agora está Desligada: " + " " + ligada);
    }
    //Métodos para definir o volume da Tv

    public void AumentarVolume(){
        volume++;
        System.out.println("O volume atual é: " + " " + volume);
    }
    public void DiminuirVolume(){
        volume--;
        System.out.println("O volume atual é: " + " " + volume);
    }
    //Métodos para definir o canal da Tv

    public void ProximoCanal(){
        canal++;
        System.out.println("O canal atual é: " + " " + canal);
    }
    public void CanalAnterior() {
        canal--;
        System.out.println("O canal atual é: " + " " + canal);
    }
    public void mudarCanal ( int novoCanal){
        canal = novoCanal;
        System.out.println("O novo canal é:" + " " + canal);
    }
}
