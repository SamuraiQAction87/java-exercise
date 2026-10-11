package abstracao;

public class ControleRemoto {
    // Referência da TV à qual serão delegadas às ações:
    private final TV tv;

    // Construtor: O controle remoto recebe a TV que controlará:
    public ControleRemoto(TV tv) {
        this.tv = tv;
    }

    // Botões do controle remoto (Expondo apenas a abstração da ação):
    public  void botaoPower() {
        tv.ligarDesligar();
    }

    public void botaoMaisVolume() {
        tv.aumentarVolume();
    }

    public void botaoMenosVolume() {
        tv.diminuirVolume();
    }

    public void digitarCanal(int canal) {
        tv.trocarCanal(369);
    }
}
