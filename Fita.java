public class Fita implements FitaIF {
  private String titulo;

  public Fita(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return titulo;
  }

  public double getValorAluguel(int diasAlugada) {
    return 0;
  }
}