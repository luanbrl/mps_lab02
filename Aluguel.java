public class Aluguel {
  private Fita fita;
  private int diasAlugada;

  public Aluguel(Fita fita, int diasAlugada) {
    this.fita = fita;
    this.diasAlugada = diasAlugada;
  }

  public Fita getTape() {
    return fita;
  }

  public int getDiasAlugada() {
    return diasAlugada;
  }

  public double getValorAluguel() {
    return fita.getValorAluguel(diasAlugada);
  }
}

