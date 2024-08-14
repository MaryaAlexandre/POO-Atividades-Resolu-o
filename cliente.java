import java.util.ArrayList;
import java.util.List;

class cliente {
  private String  cliente;
  private String cpf;
  private double limite;
  private Cliente Socio;

  public cliente(String Cliente, String Cpf, double Limite){
    this.cliente = Cliente;
    this.cpf = Cpf;
    this.limite = Limite;
    this.socio = null;
  }

  public Cliente(String Cliente, String Cpf, double Limite, Cliente Socio){
    this.cliente = cliente;
    this.cpf = cpf;
    this.limite = limite;
    this.socio = socio;
    if (socio != null){
      socio.setSocio(this);
    }  
  }
  public void setSocio(Cliente c){
    this.socio = c;
  }
  public double getLimite(){
    if (socio != null){
      return this.limite + socio.getLimite();
    }
      return this.limite; 
    }
  }
 public String ToString(){
   return "Cliente: " + this.cliente + " Cpf: " + this.cpf + "Limite:" + getlimite() + "Socio:" + (socio != null ? socio.getCliente() : "Não tem")"
   
 }  
}

class Empresa {
  private List<Cliente> cliente;
  
  public Empresa() {
    this.cliente = new ArrayList<>();
  }

  public void Inserir(Cliente cliente){
    this.cliente.add(cliente); 
  }
  
  public List<Cliente> listar() {
    return clientes;
  }
}