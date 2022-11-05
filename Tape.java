public class Tape {
  public static final int NORMAL = 0;
  public static final int LANCAMENTO = 1;
  public static final int INFANTIL = 2;

  private String titulo;

  public Tape(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return titulo;
  }
}

