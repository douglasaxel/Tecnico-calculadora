import java.util.Scanner;

public class MRU {
	private double posInicial;
  private double posFinal;
  private double tempo;

  public void setValues() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Calculando o Movimento Retil�neo Uniformemente\n");
    System.out.print("Digite a posi��o inicial: ");
    this.posInicial = sc.nextDouble();
    System.out.print("Digite a posi��o final: ");
    this.posFinal = sc.nextDouble();
    System.out.print("Digite o tempo percorrido: ");
    this.tempo = sc.nextDouble();
  }

  public void getResult() {
    double result = (this.posFinal - this.posInicial) / this.tempo;
    System.out.printf("O resultado �: %f\n", result);
  }
}
