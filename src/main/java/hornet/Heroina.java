package hornet;

public class Heroina {
  private static final int VIDA_MINIMA_PADRAO = 0;
  private static final int VIDA_MAXIMA_PADRAO = 5;
  private static final int VIDA_PADRAO = 5;
  private static final int SEDA_MINIMA_PADRAO = 0;
  private static final int SEDA_MAXIMA_PADRAO = 9;
  private static final int SEDA_PADRAO = 0;

  private String nome;
  private int vida;
  private int seda;

  public String getNome() {
    return nome;
  }
  
  public int getVida() {
    return vida;
  }

  public int getSeda() {
    return seda;
  }

  public Heroina(String nome) {
    this.nome = nome;
    this.vida = VIDA_MAXIMA_PADRAO;
    this.seda = SEDA_MINIMA_PADRAO;
  }

    Heroina(int vida, int seda) {
    if (vida >= VIDA_MINIMA_PADRAO && vida <= VIDA_MAXIMA_PADRAO)
      this.vida = vida;
    else
      this.vida = VIDA_PADRAO;

    if (seda >= SEDA_MINIMA_PADRAO && seda <= SEDA_MAXIMA_PADRAO)
      this.seda = seda;
    else
      this.seda = SEDA_PADRAO;
  }

  @Override
  public String toString() {
    return String.format("%s | Mascaras: %d/%d | Seda: %d/%d",
      nome, vida, VIDA_MAXIMA_PADRAO, seda, SEDA_MAXIMA_PADRAO);
  }
}