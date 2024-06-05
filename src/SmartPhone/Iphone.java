package SmartPhone;

import Apps.ApareloTelefonico;
import Apps.NavegadorInternet;
import Apps.ReprodutorMusical;

public class Iphone implements ApareloTelefonico,NavegadorInternet,ReprodutorMusical {
	
	  @Override
	    public void ligar(String numero) {

	        System.out.println("Ligando para: " + numero);

	    }

	    @Override
	    public void atender() {
	        System.out.println("Atendendo a chamada.");
	    }

	    @Override
	    public void iniciarCorreioVoz() {
	        System.out.println("Iniciando correio de voz.");
	    }

	    @Override
	    public void exibirPagina(){
	        System.out.println("Exibindo página: ");
	    }

	    @Override
	    public void novaPagina() {
	        System.out.println("Adicionando nova aba.");
	    }

	    @Override
	    public void atualizarPagina() {
	        System.out.println("Atualizando página.");
	    }

	    @Override
	    public void tocar() {
	        System.out.println("Reproduzindo música.");
	    }

	    @Override
	    public void pausar() {
	        System.out.println("Pausando música.");

	    }

	    @Override
	    public void mudarMusica(){
	        System.out.println("Música Selecionada: ");

} 
}
