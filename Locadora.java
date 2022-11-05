import java.util.*;

public class Locadora {
  public static void main(String[] args) {
    Cliente c1 = new Cliente("Juliana");

    c1.adicionaAluguel(new Aluguel(new FitaNormal("O Exorcista"), 3));
    c1.adicionaAluguel(new Aluguel(new FitaNormal("Men in Black"), 2));
    c1.adicionaAluguel(new Aluguel(new FitaLancamento("Jurassic Park III"), 3));
    c1.adicionaAluguel(new Aluguel(new FitaLancamento("Planeta dos Macacos"), 4));
    c1.adicionaAluguel(new Aluguel(new FitaInfantil("Pateta no Planeta dos Macacos"), 10));
    c1.adicionaAluguel(new Aluguel(new FitaInfantil("O Rei Leao"), 30));

    exibirExtratoCliente(c1);
  }

  public static void exibirExtratoCliente(Cliente cliente) {
    System.out.println("Registro de Alugueis de " + cliente.getNome());
    double valorTotal = 0.0;
    int pontosDeAlugadorFrequente = 0;
    Iterator alugueis = cliente.getAlugueis().iterator();
    while(alugueis.hasNext()) {
      Aluguel aluguel = (Aluguel)alugueis.next();
      valorTotal += aluguel.getValorAluguel();
      pontosDeAlugadorFrequente++;

      if(aluguel.getFita() instanceof FitaLancamento && aluguel.getDiasAlugada() > 1) {
         pontosDeAlugadorFrequente++;
      }

      System.out.println("\t" + aluguel.getFita().getTitulo() + "\t" + aluguel.getValorAluguel());
    } 
    System.out.println("Valor total devido: " + valorTotal);
    System.out.println("Voce acumulou " + pontosDeAlugadorFrequente + " pontos de alugador frequente");
  }
  
}
