package hornet;

public class TesteInimigo {
  public static void main(String[] args) {
    Inimigo mossMother = new Inimigo("Moss Mother", 12, 1);
    Inimigo besouro = new Inimigo("Besouro Peregrino");
    Inimigo bugado = new Inimigo("Inimigo Bugado", 50, 7);

    System.out.println(mossMother);
    System.out.println(besouro);
    System.out.println(bugado);

    while (!besouro.estaDerrotado()) {
      besouro.receberGolpe();
    }

    System.out.println(besouro);
    System.out.println("Derrotado? " + besouro.estaDerrotado());
  }
}