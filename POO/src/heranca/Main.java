package heranca;

public class Main {
    public static void main(String[] args) {
        // Instanciando as classes de super-heróis:
        HomemAranha homemAranha = new HomemAranha();
        HomemDeFerro homemDeFerro = new HomemDeFerro();
        Tempestade tempestade = new Tempestade();
        ViuvaNegra viuvaNegra = new ViuvaNegra();

        // Invocando os métodos recebendo os heróis como argumento:
        userSuperPoderes(homemDeFerro);
        userSuperPoderes(homemAranha);
    }
    // Sem herança, os métodos seriam criados individualmente:
    static void userSuperPoderes(HomemDeFerro homemDeFerro) {

    }

    static void userSuperPoderes(HomemAranha homemAranha) {

    }
}


















