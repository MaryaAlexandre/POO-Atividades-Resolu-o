import java.util.ArrayList;
import java.util.List;

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