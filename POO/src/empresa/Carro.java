package empresa;

public class Carro {
    private Motor motor;
    private String volante;
    private String   pedais;
    private String airbag;

    // Por boa prática, criei o construtor inicializando os atributos que acessados por outras classes:
    public Carro() {
        this.motor = new Motor();
        this.volante = "Volante";
        this.pedais = "Pedais";
    }

    // Métodos comuns:
    public void ligarCarro() {
        System.out.println("Ligando o carro...");
    }

    public void acelerar() {
        System.out.println("Acelerar...");
    }

    public void frear() {
        System.out.println("Frear...");
    }

    public void ativarAirbags() {
        System.out.println("Ativando airbags...");
    }

    // Getters & Setters:
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getVolante() {
        return volante;
    }

    public void setVolante(String volante) {
        this.volante = volante;
    }

    public String getPedais() {
        return pedais;
    }

    public void setPedais(String pedais) {
        this.pedais = pedais;
    }

    public String getAirbag() {
        return airbag;
    }

    public void setAirbag(String airbag) {
        this.airbag = airbag;
    }
}






















