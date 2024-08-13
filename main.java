public class Main{
  public static void main(String[] args)
 Time = new time ("Flamengo");
  jogador jogador1 = new jogador ("Gabriel", "10", "9");
  jogador jogador2 = new jogador ("Pedro", "9", "8");
  jogador jogador3 = new jogador ("David luiz", "23", "5");
  
  time.inserirJogador(jogador1);
  time.inserirJogador(jogador2);
  time.inserirJogador(jogador3);

  time.listarJogadores();

  jogador artilheiro = time.artilheiro();
  if ( artilheiro != null){
    System.out.println("O artilheiro do time é:" + artilheiro.getName() + "número de gols" + artilheiro.getGols());  
  }
else{
  System.out.println(" Não há jogadores cadastrados");
}   
}
}