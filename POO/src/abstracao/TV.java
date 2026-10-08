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
                // If ternário que retorna conforme o estado do atributo 'ligada':
                "A TV está " + (ligada ? "ligada" : "desligada")
        );
    }

}


































