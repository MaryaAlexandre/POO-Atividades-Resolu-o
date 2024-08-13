
public class timejogador{
    private String name;
    private string estado;
    private string gols;

  public timejogador(String name, String estado, String gols){
    this.name = name;
    this.estado = estado;
    this.gols = gols;
  }
  public String getName(){
    return name;
  }
  public String getEstado(){
    return estado;
  }
  public String getGols(){
    return gols;
  }
  public void setName(String name){
  this.name = name;  
  }
  public void setEstado(String estado){
    this.estado = estado;
  }
  public void setGols(String gols){
    this.gols = gols;
  }
    

}