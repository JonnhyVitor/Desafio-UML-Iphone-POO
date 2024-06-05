classDiagram
     class  ReprodutorMusical {
             <<interface>>
        + void tocar()
        + void mudarMusica(String musicas)
        + void pausar()
    }

    class AparelhoTelefonico {
              <<interface>>
        +void ligar(String numero)
        +void atender()
        +void iniciarCorreioVoz()
    }

    class NavegadorInternet {
              <<interface>>
        +void exibirPagina(String URL)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    
 
    class iPhone {
    }

    iPhone "1.*" -->  ReprodutorMusical
    iPhone "1.0"--> AparelhoTelefonico
    iPhone "1.0" --> NavegadorInternet
![alt text](image-1.png)
