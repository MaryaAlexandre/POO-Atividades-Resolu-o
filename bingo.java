import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bingo {
  private int numBolas;
  private List<Integer> numerosSorteados;
  private Random random;

  public Bingo() {
    this.bolasSorteados = new ArrayList<>();
    this.random;
  }

  public void iniciar(int numBolas) {
    this.numBolas = numBolas;
    this.numerosSorteados = new ArrayList<>();
    this.random = new Random();
  }

  public void iniciar(int numBolas)
  {
    this.numBolas = numBolas;
    bolasSorteados.clear(); // limpa lista de bolas sorteadas
  }

  public int proximo() {
    if ( bolasSorteados.size() == numBolas) {
      return -1; // Todas as bolas já foram sorteadas
    }
    int bolaSorteada;
    do {
      bolaSorteada = random.nextInt(numBolas) + 1;
      // vai gerar um número aleatório entre 1 e numBolas 
    }
      while (bolasSorteados.contains(bolaSorteada));
    //Garante que a bola não foi sorteada antes
    bolasSorteados.add(bolaSorteada);
    return bolaSorteada;    
  }
public int [] sorteados () {
  int [] bolasSorteadasArray = new int [bolasSorteadas.size()];
  for (int i = 0; i < bolasSorteadas.size(); i++) {
    bolasSorteadasArray[i] = bolasSorteadas.get(i);
  }
  return bolasSorteadasArray;
}
}