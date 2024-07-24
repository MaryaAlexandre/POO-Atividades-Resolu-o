public class Racional {
    // Atributos da classe Racional: numerador e denominador
    private int numerador;
    private int denominador;

    // Construtor da classe Racional para inicializar os atributos
    public Racional(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("O denominador não pode ser zero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar(); // Simplifica a fração no momento da criação
    }

    // Método para simplificar a fração
    private void simplificar() {
        int mdc = mdc(numerador, denominador);
        numerador /= mdc;
        denominador /= mdc;
    }

    // Método para calcular o máximo divisor comum (mdc) entre dois números
    private int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Método para somar dois números racionais
    public Racional somar(Racional outro) {
        int novoNumerador = this.numerador * outro.denominador + outro.numerador * this.denominador;
        int novoDenominador = this.denominador * outro.denominador;
        return new Racional(novoNumerador, novoDenominador);
    }

    // Método para subtrair dois números racionais
    public Racional subtrair(Racional outro) {
        int novoNumerador = this.numerador * outro.denominador - outro.numerador * this.denominador;
        int novoDenominador = this.denominador * outro.denominador;
        return new Racional(novoNumerador, novoDenominador);
    }

    // Método para multiplicar dois números racionais
    public Racional multiplicar(Racional outro) {
        int novoNumerador = this.numerador * outro.numerador;
        int novoDenominador = this.denominador * outro.denominador;
        return new Racional(novoNumerador, novoDenominador);
    }

    // Método para dividir dois números racionais
    public Racional dividir(Racional outro) {
        if (outro.numerador == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        int novoNumerador = this.numerador * outro.denominador;
        int novoDenominador = this.denominador * outro.numerador;
        return new Racional(novoNumerador, novoDenominador);
    }

    // Método para obter o valor real do número racional
    public double valorReal() {
        return (double) numerador / denominador;
    }

    // Método para verificar se dois números racionais são iguais
    public boolean igual_a(Racional outro) {
        return this.numerador == outro.numerador && this.denominador == outro.denominador;
    }

    // Método para verificar se um número racional é menor que outro
    public boolean menor_que(Racional outro) {
        return this.numerador * outro.denominador < outro.numerador * this.denominador;
    }

    // Método para representar o número racional como string
    public String toString() {
        return numerador + "/" + denominador;
    }

    // Método main para testar a classe Racional
    public static void main(String[] args) {
        Racional r1 = new Racional(1, 2); // Cria um número racional 1/2
        Racional r2 = new Racional(3, 4); // Cria um número racional 3/4

        // Testa os métodos implementados e exibe os resultados
        System.out.println("r1: " + r1); // Exibe 1/2
        System.out.println("r2: " + r2); // Exibe 3/4

        Racional soma = r1.somar(r2);
        Racional subtracao = r1.subtrair(r2);
        Racional multiplicacao = r1.multiplicar(r2);
        Racional divisao = r1.dividir(r2);

        System.out.println("Soma: " + soma); // Exibe 5/4
        System.out.println("Subtração: " + subtracao); // Exibe -1/4
        System.out.println("Multiplicação: " + multiplicacao); // Exibe 3/8
        System.out.println("Divisão: " + divisao); // Exibe 2/3

        System.out.println("Valor real de r1: " + r1.valorReal()); // Exibe 0.5
        System.out.println("r1 igual a r2? " + r1.igual_a(r2)); // Exibe false
        System.out.println("r1 menor que r2? " + r1.menor_que(r2)); // Exibe true
    }
}
