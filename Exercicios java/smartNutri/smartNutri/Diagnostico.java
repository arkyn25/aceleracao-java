package smartNutri;
import java.util.Scanner;

public class Diagnostico {

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Qual o seu peso?: ");
    String peso = scan.next();
    
    System.out.println("Qual o sua altura?: ");
    String altura = scan.next();
    
    double inputPeso = Double.parseDouble(peso);
    double inputAltura = Double.parseDouble(altura);
    Avaliacao avaliacao = new Avaliacao();
    avaliacao.calculaIMC(inputPeso, inputAltura);
    
    scan.close();

  }

}
