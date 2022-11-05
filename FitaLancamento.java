public class FitaLancamento extends Fita {
  public FitaLancamento(String titulo) {
    super(titulo);
  }

  @Override
  public double getValorAluguel(int diasAlugada) {
    return diasAlugada * 3;
  }
}

