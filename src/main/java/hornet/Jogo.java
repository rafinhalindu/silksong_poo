package hornet;

import java.util.Scanner;

public class Jogo {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("=================================");
    System.out.println("HOLLOW KNIGHT: SILKSONG");
    System.out.println("edicao POO em Java");
    System.out.println("=================================\n");

    System.out.println("Carregando save...\n");

    Heroina hornet = new Heroina("Hornet");
    System.out.println(hornet);

    Inimigo mossMother = new Inimigo("Moss Mother", 12, 1);

    Scanner scanner = new Scanner(System.in);
    int turno = 1;
    boolean fugiu = false;

    do {
      System.out.println("========== Turno " + turno + " ==========");
      System.out.println(hornet);
      System.out.println(mossMother);

      System.out.println("1-Atacar 2-Curar 0-Fugir");
      System.out.print("Escolha: ");
      int opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          hornet.atacar();
          mossMother.receberGolpe();
          break;
        case 2:
          hornet.curar();
          break;
        case 0:
          System.out.println("fugiu da batalha");
          fugiu = true;
          break;
        default:
          System.out.println("Opcao invalida");
      }

      if (turno % 3 == 0 && !mossMother.estaDerrotado() && !fugiu) {
        System.out.println(mossMother.getNome() + " ataca!");
        hornet.receberDano(mossMother.getDano());
      }

      Thread.sleep(1000);
      turno++;
    } while (!fugiu && !mossMother.estaDerrotado() && !hornet.estaDerrotada());

    if (mossMother.estaDerrotado()) {
      System.out.println("Vitoria sobre " + mossMother.getNome() + "!");
    } else if (hornet.estaDerrotada()) {
      System.out.println("Fim de jogo.");
    }

    System.out.println(hornet);
    scanner.close();
  }
}