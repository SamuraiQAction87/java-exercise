package abstracao;

public class Main {
    public static void main(String[] args) {
        // Instanciando o objeto 'minhaTV':
        TV minhaTV = new TV();
        // Chamada dos metodos da classe de Referência TV
        // por meio de sua instância:
        minhaTV.ligarDesligar();
        minhaTV.aumentarVolume();
        minhaTV.diminuirVolume();
        minhaTV.trocarCanal(9);
    }
}
