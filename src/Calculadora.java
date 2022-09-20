import java.sql.SQLOutput;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Ingrese los numeros de la operacion");
       int primernumero = scan.nextInt();
       System.out.print("que operacion desea realizar ?(+, -, *, /,:): ");
       char operacion = scan.next().charAt(0);
       System.out.printf("ingrese el segundo numero");
       int segundonumero = scan.nextInt();
       int result;
       switch (operacion) {
          case '+':
             result = primernumero + segundonumero;
             break;
          case '-':
             result = primernumero - segundonumero;
             break;
          case '*':
             result = primernumero * segundonumero;
             break;
          case ':':
             result = primernumero / segundonumero;
             break;
          case '/':
             result = primernumero / segundonumero;
             break;
          default:
             System.out.println("Error! operacion no valida");
             return;
       }
       System.out.println("(" + primernumero + ") " + operacion + " (" + segundonumero + ")" + " = " + result);
    }}




