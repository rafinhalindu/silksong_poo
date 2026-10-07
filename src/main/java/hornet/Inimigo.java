package hornet;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Inimigo {
  private static final int VIDA_MINIMA_PADRAO = 1;
  private static final int VIDA_MAXIMA_PADRAO = 20;
  private static final int VIDA_PADRAO = 10;
  private static final int DANO_MINIMO_PADRAO = 1;
  private static final int DANO_MAXIMO_PADRAO = 2;
  private static final int DANO_PADRAO = 1;

  private String nome;
  private int vida;
  private int dano;

  public Inimigo(String nome, int vida, int dano) {
    this.nome = nome;

    if (vida >= VIDA_MINIMA_PADRAO && vida <= VIDA_MAXIMA_PADRAO)
      this.vida = vida;
    else
      this.vida = VIDA_PADRAO;

    if (dano >= DANO_MINIMO_PADRAO && dano <= DANO_MAXIMO_PADRAO)
      this.dano = dano;
    else
      this.dano = DANO_PADRAO;
  }

  public Inimigo(String nome) {
    this(nome, VIDA_PADRAO, DANO_PADRAO);
  }

  public void receberGolpe() {
    vida = Math.max(0, vida - 1);
    System.out.println(nome + " recebeu 1 de dano");
  }

  public boolean estaDerrotado() {
    return vida == 0;
  }
}