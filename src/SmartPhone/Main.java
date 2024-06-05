package SmartPhone;

public class Main {

	public static void main (String[] args){
		
		Iphone Iphone = new Iphone();


	        System.out.println("tocando");
	        Iphone.tocar();
	        Iphone.pausar();
	        Iphone.mudarMusica();

	        System.out.println("ligando");
	        Iphone.ligar("73183193-33");
	        Iphone.atender();
	        Iphone.iniciarCorreioVoz();

	        System.out.println("usando o Navegador");
	        Iphone.exibirPagina();
	        Iphone.novaPagina();
	        Iphone.atualizarPagina();
	}

}
