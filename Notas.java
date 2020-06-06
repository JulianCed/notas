import java.util.Scanner;

public class Notas
{ 
  public static void main(String args[])
 {
    Scanner in = new Scanner(System.in);
    String nombre = "";
    String materia = "";
    int notas = 0;
    double n1 = 0.0;	
    double n2 = 0.0;
    double n3 = 0.0;
    double n4 = 0.0;
    double n5 = 0.0;
    double resultado = 0.0;

System.out.println("**************");
   System.out.println("NOMBRE");
   System.out.println("**************");
   System.out.println("");
    
   nombre = in.nextLine();
   System.out.println(""); 

 System.out.println("**********************");
   System.out.println("BIENVENIDO " + nombre);
   System.out.println("**********************");
   System.out.println("");
   System.out.println("");

 System.out.println("**********************");
   System.out.println("MATERIA");
   System.out.println("**********************");
   System.out.println("");
   System.out.println("");

   materia = in.nextLine();
   System.out.println(""); 
   
   System.out.println("N° DE NOTAS");
    notas = in.nextInt();
   System.out.println(""); 

 if(notas>=1&&notas<=5){

    System.out.println("N° 1");

   n1= in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 2");
   n2 = in.nextDouble();
   System.out.println(""); 

   System.out.println("N° 3");
   n3 = in.nextDouble();
   System.out.println(""); 
 
   System.out.println("N° 4");
   n4 = in.nextDouble();
   System.out.println(""); 

   System.out.println("N° 5");
   n5 = in.nextDouble();
   System.out.println(""); 

  resultado =(n1+n2+n3+n4+n5)/5;
// el valor de cada nota

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println("PASO "  + materia + " con: " + resultado);
}else{
System.out.println("PERDIO" + materia + " con: " + resultado);
}
    
  }
    
  }
}
