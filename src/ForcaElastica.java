import java.util.Scanner;

public class ForcaElastica {
	private double constMola;
  private double defMola;

  public void setValues() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Calculando a for�a el�stica\n");
    System.out.print("Digite a constante el�stica do corpo: ");
    this.constMola = sc.nextDouble();
    System.out.print("Digite a deforma��o percebida no corpo: ");
    this.defMola = sc.nextDouble();
  }

  public void getResult() {
    double result = this.constMola * this.defMola;
    System.out.printf("O resultado �: %f\n", result);
  }
}
