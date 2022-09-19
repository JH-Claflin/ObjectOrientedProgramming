import java.util.Scanner;

class Fahrenheit {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a degree in Celcius to be converted to Fahrenheit: ");
    double celcius = scan.nextDouble();
    double fahrenheit = (1.8 * celcius) + 32;
    System.out.println(fahrenheit + " Fahrenheit");
 }
}  