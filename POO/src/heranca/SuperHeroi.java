package heranca;

public class SuperHeroi {
    // Atributos:
    private String traje;
    private String[] superPoderes;

    public SuperHeroi(String traje, String[] superPoderes) {
        this.traje = traje;
        this.superPoderes = superPoderes;
    }


    public void usarSuperPoderes(int index) {
        System.out.println("Usar super poder " + superPoderes[index]);
    }
}
