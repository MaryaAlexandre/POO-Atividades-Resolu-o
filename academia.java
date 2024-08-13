import java.util.ArrayList;
import java.util.List;

public class Academia {
    private String nomeAcademia;
    private List<Esporte> esportes;

   
    public Academia(String nomeAcademia) {
        this.nomeAcademia = nomeAcademia;
        this.esportes = new ArrayList<>();
    }

   
    public void inserirEsporte(Esporte esporte) {
        esportes.add(esporte);
    }

   
    public void listarEsportes() {
        System.out.println("Esportes da academia " + nomeAcademia + ":");
        for (Esporte esporte : esportes) {
            System.out.println("Nome: " + esporte.getNome());
            System.out.println("Horários: " + String.join(", ", esporte.getHorarios())); System.out.println("Valor da Mensalidade: R$" + esporte.getValorMensalidade());
            System.out.println("--------------------");
        }
    }

    
    public double mediaMensalidade() {
        if (esportes.isEmpty()) {
            return 0;
        }
        double somaMensalidades = 0;
        for (Esporte esporte : esportes) {
            somaMensalidades += esporte.getValorMensalidade();
        }
        return somaMensalidades / esportes.size();
    }
}