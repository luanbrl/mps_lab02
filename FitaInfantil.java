public class FitaInfantil extends Fita {
  public FitaInfantil(String titulo) {
    super(titulo);
  }
    
  @Override
  public double getValorAluguel(int diasAlugados) {
    double valorCorrente = 1.5;
    if(diasAlugados > 3) {
      valorCorrente += (diasAlugados - 3) * 1.5;
    }
    return valorCorrente;
  }
}

