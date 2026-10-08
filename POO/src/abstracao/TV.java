package abstracao;

public class TV {
    // Atributos:
    private boolean ligada;
    private int volume;
    private int canal;

    // Metodo para Ligar ou Desligar a TV:
    public void ligarDesligar() {
        // O atributo da classe recebe sua negação (Se está 1, ficará 0 e vice-versa):
        this.ligada = !this.ligada;
        System.out.println(
                // If Ternário que retorna conforme o estado atual do atributo 'ligada':
                "A TV está " + (ligada ? "ligada" : "desligada")
        );
    }

    // Metodo para incrementar volume:
    public void aumentarVolume() {
        this.volume++;
        System.out.println("Volume aumentado para: " + this.volume);
    }
    // Metodo para decrementar volume:
    public void diminuirVolume() {
        this.volume--;
        System.out.println("Volume diminuído para: " + this.volume);
    }
    // Metodo com passagem de parâmetro para trocar de canal:
    public void trocarCanal(int novoCanal) {
        this.canal = novoCanal;
        System.out.println("Canal alterado para: " + this.canal);
    }

}


































