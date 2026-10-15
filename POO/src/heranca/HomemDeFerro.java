package heranca;

public class HomemDeFerro extends SuperHeroi {
    // Chamada do construtor da super classe:
    public HomemDeFerro(String traje, String[] superPoderes) {
        super(traje, superPoderes);
    }

    // Metodo da classe pai sobrescrito:
    public void usarSuperPoderes(int index) {
        System.out.println("Falar com a Jarvis (IA Assistente)!" );
        super.usarSuperPoderes(index);
    }
}
