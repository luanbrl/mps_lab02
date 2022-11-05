import java.util.*;

public class Client {
  private String nome;
  private Collection alugueis = new Vector();

  public Client(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void adicionaAluguel(Aluguel aluguel) {
    alugueis.add(aluguel);
  }
}

