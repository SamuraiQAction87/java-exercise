package heranca;

public class Main {
    public static void main(String[] args) {
        SuperHeroi[] superHerois = {
                new HomemDeFerro("Roupa Vermelha com Teias.", new String[] {"Lançar Teia."}),
                new HomemAranha("Roupa Vermelha resistente.", new String[] {"habilidades de guerra."}),
                new Tempestade("Roupa branca.", new String[] {"Controlar o tempo."}),
                new ViuvaNegra("Roupa Vermelha com Teias.", new String[] {"Lançar Teia."})
        };
        // ForEach para imprimir os personagens com traje e super poder:
        for (SuperHeroi superHeroi : superHerois) {
            System.out.println(superHeroi.getTraje());
            superHeroi.usarSuperPoderes(0);

        }
    }
}


















