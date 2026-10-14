package encapsulamento;

public class Main {
    public static void main(String[] args) {
        // Instanciando o objeto carro:
        Carro carro = new Carro();
        // Acessando os métodos a partir do objeto carro:
        carro.ligarCarro();
        carro.acelerar();
        carro.frear();

        // Acessando e modificando DIRETAMENTE o atributo 'volante'(VIOLA o ENCAPSULAMENTO):
        //carro.volante = "dado modificado";

        // Acesso mediante um 'Setter', seguindo boas práticas do encapsulamento:
        carro.setVolante("dado modificado");

        // Acessando os atributos por meio dos metodos Getters:
        System.out.println(carro.getMotor());
        System.out.println(carro.getVolante());
        System.out.println(carro.getAirbag());
    }
}