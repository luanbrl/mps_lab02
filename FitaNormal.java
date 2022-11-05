public class FitaNormal extends Fita {
  public FitaNormal(String titulo) {
    super(titulo);
  }
    
  @Override
  public double getValorAluguel(int diasAlugada) {
    double valorCorrente = 2;
    if(diasAlugada > 2) {
      valorCorrente += (diasAlugada - 2) * 1.5;
    }
    return valorCorrente;
  }
}

