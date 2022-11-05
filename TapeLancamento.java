public class TapeLancamento extends Tape {
  public TapeLancamento(String _titulo) {
    super(_titulo);
  }

  @Override
  public double getValorAluguel(int diasAlugada) {
    return diasAlugada * 3;
  }
}

