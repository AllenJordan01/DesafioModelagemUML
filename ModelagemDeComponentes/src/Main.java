public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        //Usando o reprodutor musical
        iPhone.selecionarMusica("Angra - Carry On");
        iPhone.tocar();
        iPhone.pausar();

        //Usando o aparelho telefônico
        iPhone.ligar("99912345678");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        //Usando o navegador de internet
        iPhone.exibirPagina("www.dio.me");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

    }
}