public class Tape implements TapeIF {
  private String titulo;

  public Tape(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return titulo;
  }

  public double getValorAluguel(int diasAlugada) {
    return 0;
  }
}