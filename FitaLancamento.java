public class FitaLancamento extends Fita {
  public FitaLancamento(String _titulo) {
    super(_titulo);
  }

  @Override
  public double getValorAluguel(int diasAlugada) {
    return diasAlugada * 3;
  }
}

