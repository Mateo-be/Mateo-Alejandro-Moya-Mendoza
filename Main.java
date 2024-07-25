/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby,
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main{
   public static void main ( String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("ingresa el valor de radio");
       double radio = scanner.nextDouble();
       
       System.out.print("ingresa el valor del angulo en grado");
       double angulogrado = scanner.nextDouble();  
       
       
       double anguloRadianes = Math.toRadians(angulogrado);
       
       double x = radio * Math.cos(anguloRadianes);
       double y = radio * Math.sin(anguloRadianes);
       
       System.out.print("Las coordenadas son: x= "+x+ " y= "+y);
       scanner.close();
   }
}
