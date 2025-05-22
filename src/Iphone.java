public class Iphone implements FazerChamada,TocarMusica, NavegarNaInternet  {
    public static void main(String[] args) {
        Iphone newIphone = new Iphone();

        newIphone.pesquisar();
    }

    @Override
    public void pesquisar() {
        System.out.println("Pesquisar no navegador");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Nova pagina");
    }

    @Override
    public void chamar() {
        System.out.println("Chamando");

    }

    @Override
    public void atender() {
        System.out.println("Atender ligação");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar musica");
    }

    @Override
    public void passarMusica() {
        System.out.println("Passar musica");
    }
}