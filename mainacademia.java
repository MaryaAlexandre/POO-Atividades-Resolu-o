public class Main {
    public static void main(String[] args) {
       
        Academia academia = new Academia("Academia Fitness");

      
        Esporte esporte1 = new Esporte("Musculação", new String[]{"10:00-12:00", "16:00-18:00"}, 100.0);
        Esporte esporte2 = new Esporte("Yoga", new String[]{"08:00-09:00", "19:00-20:00"}, 80.0);
        Esporte esporte3 = new Esporte("Zumba", new String[]{"14:00-15:00"}, 70.0);

      academia.inserirEsporte(esporte1);
        academia.inserirEsporte(esporte2);
        academia.inserirEsporte(esporte3);

        
        academia.listarEsportes();

        double mediaMensalidade = academia.mediaMensalidade();
        System.out.println("Média da Mensalidade: R$" + mediaMensalidade);
    }
}