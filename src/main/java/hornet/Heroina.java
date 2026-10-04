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

    public void atacar() {
    System.out.println(nome + " ataca com a agulha!");
    seda = Math.min(SEDA_MAXIMA_PADRAO, seda + 1);
  }

  public void atacar(int vezes) {
    for (int i = 0; i < vezes; i++) {
      atacar();
    }
  }

  public void receberDano(int dano) {
    vida = Math.max(VIDA_MINIMA_PADRAO, vida - dano);
    System.out.println(nome + " recebeu " + dano + " de dano");
  }

  public void curar() {
    if (seda == SEDA_MAXIMA_PADRAO) {
      vida = Math.min(VIDA_MAXIMA_PADRAO, vida + 3);
      seda = SEDA_MINIMA_PADRAO;
      System.out.println(nome + " se amarrou com seda e recuperou 3 mascaras");
    } else {
      System.out.println(nome + " nao tem seda suficiente para se curar");
    }
  }

  public boolean estaDerrotada() {
    return vida == VIDA_MINIMA_PADRAO;
  }
}