import java.util.*;

public class Cliente {
  public String nome;
  public Collection alugueis = new Vector();

  public Cliente(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public Collection getAlugueis() {
    return alugueis;
  }

  public void adicionaAluguel(Aluguel aluguel) {
    alugueis.add(aluguel);
  }
}

