package abstracao;

public class Main {
    public static void main(String[] args) {
        // Instanciando o objeto 'minhaTV':
        TV minhaTV = new TV();
        // Instanciando o objeto controle e passando
        // o obj acima como argumento:
        ControleRemoto controle = new ControleRemoto(minhaTV);

        // Chamada dos metodos da classe de Referência TV
        // por meio de sua instância:
        minhaTV.ligarDesligar();
        minhaTV.aumentarVolume();
        minhaTV.diminuirVolume();
        minhaTV.trocarCanal(9);
    }
}
