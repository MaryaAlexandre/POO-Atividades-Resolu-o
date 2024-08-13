public class Esporte {
    private String nome;
    private String[] horarios; 
    private double valorMensalidade;

   
    public Esporte(String nome, String[] horarios, double valorMensalidade) {
        this.nome = nome;
        this.horarios = horarios;
        this.valorMensalidade = valorMensalidade;
    }

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getHorarios() {
        return horarios;
    }

    public void setHorarios(String[] horarios) {
        this.horarios = horarios;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }
}