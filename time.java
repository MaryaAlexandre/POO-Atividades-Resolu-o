import java.util.ArrayList;
import java.util.List;

public class time{
  private String nameTime;
  private List <jogador> jogadores;

  public time(String nameTime){
    this.nameTime = nameTime;
    this.jogadores = new ArrayList<>();
  }
  public void inserirJogador(jogador jogador){
    jogadores.add(jogador);
  }
  public void listarJogadores(){
    system.out.println("jogadores do time" + "nameTime" + ":");
    for(jogador jogador : jogadores){
      system.out.println( "jogador" + jogador.getNome() + "Camisa" + jogador.getCamisa() + "Gols" + gols.getGols() + ":");
      
    }  
  }
  public jogador Artilheiro {
    if(jogadores.isEmpty()){
      return null; 
    }
    jogador artilheiro = jogadores.get(0);
    for( jogador jogador : jogadores){
      if(jogador.getGols() > artilheiro.getGols()){
        artilheiro = jogador;
      }
    }
    return artilheiro;
  } 
  }  
  