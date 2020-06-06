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
    double n6 = 0.0;
    double n7 = 0.0;
    double n8 = 0.0;
    double n9 = 0.0;
    double n10 = 0.0;
    double n11 = 0.0;
    double n12 = 0.0;
    double n13 = 0.0;
    double n14 = 0.0;
    double n15 = 0.0;
    double n16 = 0.0;
    double n17 = 0.0;
    double n18 = 0.0;
    double n19 = 0.0;
    double n20 = 0.0;
    double n21 = 0.0;
    double n22 = 0.0;
    double n23 = 0.0;
    double n24 = 0.0;
    double n25 = 0.0;
    double n26 = 0.0;
    double n27 = 0.0;
    double n28 = 0.0;
    double n29 = 0.0;
    double n30 = 0.0;
    
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
 
if(notas>=1&&notas<=2){

    System.out.println("N° 1");

   n1= in.nextDouble();
   System.out.println(""); 

   System.out.println("N° 2");
   
   n2 = in.nextDouble();
   System.out.println(""); 

  resultado =(n1+n2)/2;
// el valor de cada nota

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
} 
  
 

 } else if(notas>=1&&notas<=3){

    System.out.println("N° 1");

   n1= in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 2");
   
   n2 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 3");
   
   n3 = in.nextDouble();
   System.out.println(""); 


  resultado =(n1+n2+n3)/3;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }
    


} else if(notas>=1&&notas<=4) {

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

resultado =(n1+n2+n3 + n4)/4;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }

  

   } else if(notas>=1&&notas<=5){

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

    n5= in.nextDouble();
    System.out.println(""); 

resultado =(n1+n2+n3 + n4 + n5)/5;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=6){

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

    n5= in.nextDouble();
    System.out.println(""); 

System.out.println("N° 6");

    n6= in.nextDouble();
    System.out.println(""); 

resultado =(n1+n2+n3 + n4 + n5 + n6)/6;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=7){

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

    n5= in.nextDouble();
    System.out.println(""); 

System.out.println("N° 6");

    n6= in.nextDouble();
    System.out.println(""); 

System.out.println("N° 7");

    n7= in.nextDouble();
    System.out.println(""); 

resultado =(n1+n2+n3 + n4 + n5 + n6 + n7)/7;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=8){

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

    n5= in.nextDouble();
    System.out.println(""); 

  System.out.println("N° 6");
   
   n6 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println("");

System.out.println("N° 8");

    n8= in.nextDouble();
    System.out.println(""); 

resultado =(n1+n2+n3 + n4 + n5 + n6 + n7 + n8)/8;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=9){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");


resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9)/9;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=10){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 


resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10)/10;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=11){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 


resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11)/11;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=12){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 


resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12)/12;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=13){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  

resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13)/13;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=14){

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

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

    n5= in.nextDouble();
    System.out.println(""); 

resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14)/14;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=15){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

System.out.println("N° 15");

    n15 = in.nextDouble();
    System.out.println(""); 


resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14 + n15)/15;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=16){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

System.out.println("N° 15");

    n15 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 16");

   n16 = in.nextDouble();
   System.out.println(""); 


resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14 + n15 + n16)/16;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=17){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

System.out.println("N° 15");

    n15 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 16");

   n16 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 17");
   
   n17 = in.nextDouble();
   System.out.println(""); 


resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14 + n15 + n16 + n17)/17;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=18){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

System.out.println("N° 15");

    n15 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 16");

   n16 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 17");
   
   n17 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 18");
   
   n18 = in.nextDouble();
   System.out.println(""); 
  

resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14 + n15 + n16 + n17 + n18)/18;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=19){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

System.out.println("N° 15");

    n15 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 16");

   n16 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 17");
   
   n17 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 18");
   
   n18 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 19");
   
   n19 = in.nextDouble();
   System.out.println("");


resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14 + n15 + n16 + n17 + n18 + n19)/19;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=20){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

System.out.println("N° 15");

    n15 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 16");

   n16 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 17");
   
   n17 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 18");
   
   n18 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 19");
   
   n19 = in.nextDouble();
   System.out.println("");

System.out.println("N° 20");

    n20 = in.nextDouble();
    System.out.println(""); 


resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14 + n15 + n16 + n17 + n18 + n19 + n20)/20;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=21){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

System.out.println("N° 15");

    n15 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 16");

   n16 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 17");
   
   n17 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 18");
   
   n18 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 19");
   
   n19 = in.nextDouble();
   System.out.println("");

System.out.println("N° 20");

    n20 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 21");

   n21= in.nextDouble();
   System.out.println(""); 


resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14 + n15 + n16 + n17 + n18 + n19 + n20 + n21)/21;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=22){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

System.out.println("N° 15");

    n15 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 16");

   n16 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 17");
   
   n17 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 18");
   
   n18 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 19");
   
   n19 = in.nextDouble();
   System.out.println("");

System.out.println("N° 20");

    n20 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 21");

   n21= in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 22");
   
   n22 = in.nextDouble();
   System.out.println(""); 


resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14 + n15 + n16 + n17 + n18 + n19 + n20 + n21 + n22 )/22;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=23){

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

    n5= in.nextDouble();
    System.out.println("");

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

System.out.println("N° 15");

    n15 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 16");

   n16 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 17");
   
   n17 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 18");
   
   n18 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 19");
   
   n19 = in.nextDouble();
   System.out.println("");

System.out.println("N° 20");

    n20 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 21");

   n21= in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 22");
   
   n22 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 23");
   
   n23 = in.nextDouble();
   System.out.println(""); 
  

resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14 + n15 + n16 + n17 + n18 + n19 + n20 + n21 + n22 + n23 )/23;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=24){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

System.out.println("N° 15");

    n15 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 16");

   n16 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 17");
   
   n17 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 18");
   
   n18 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 19");
   
   n19 = in.nextDouble();
   System.out.println("");

System.out.println("N° 20");

    n20 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 21");

   n21= in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 22");
   
   n22 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 23");
   
   n23 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 24");
   
   n24 = in.nextDouble();
   System.out.println("");


resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14 + n15 + n16 + n17 + n18 + n19 + n20 + n21 + n22 + n23 + n24)/24;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=25){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

System.out.println("N° 15");

    n15 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 16");

   n16 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 17");
   
   n17 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 18");
   
   n18 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 19");
   
   n19 = in.nextDouble();
   System.out.println("");

System.out.println("N° 20");

    n20 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 21");

   n21= in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 22");
   
   n22 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 23");
   
   n23 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 24");
   
   n24 = in.nextDouble();
   System.out.println("");

System.out.println("N° 25");

    n25 = in.nextDouble();
    System.out.println(""); 


resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14 + n15 + n16 + n17 + n18 + n19 + n20 + n21 + n22 + n23 + n24 + n25)/25;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=26){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

System.out.println("N° 15");

    n15 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 16");

   n16 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 17");
   
   n17 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 18");
   
   n18 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 19");
   
   n19 = in.nextDouble();
   System.out.println("");

System.out.println("N° 20");

    n20 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 21");

   n21= in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 22");
   
   n22 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 23");
   
   n23 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 24");
   
   n24 = in.nextDouble();
   System.out.println("");

System.out.println("N° 25");

    n25 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 26");

   n26 = in.nextDouble();
   System.out.println(""); 


resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14 + n15 + n16 + n17 + n18 + n19 + n20 + n21 + n22 + n23 + n24 + n25 + n26)/26;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=27){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

System.out.println("N° 15");

    n15 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 16");

   n16 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 17");
   
   n17 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 18");
   
   n18 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 19");
   
   n19 = in.nextDouble();
   System.out.println("");

System.out.println("N° 20");

    n20 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 21");

   n21= in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 22");
   
   n22 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 23");
   
   n23 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 24");
   
   n24 = in.nextDouble();
   System.out.println("");

System.out.println("N° 25");

    n25 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 26");

   n26 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 27");
   
   n27 = in.nextDouble();
   System.out.println(""); 


resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14 + n15 + n16 + n17 + n18 + n19 + n20 + n21 + n22 + n23 + n24 + n25 + n26 +n27)/27;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=28){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

System.out.println("N° 15");

    n15 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 16");

   n16 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 17");
   
   n17 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 18");
   
   n18 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 19");
   
   n19 = in.nextDouble();
   System.out.println("");

System.out.println("N° 20");

    n20 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 21");

   n21= in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 22");
   
   n22 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 23");
   
   n23 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 24");
   
   n24 = in.nextDouble();
   System.out.println("");

System.out.println("N° 25");

    n25 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 26");

   n26 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 27");
   
   n27 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 28");
   
   n28 = in.nextDouble();
   System.out.println(""); 

resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14 + n15 + n16 + n17 + n18 + n19 + n20 + n21 + n22 + n23 + n24 + n25 + n26 +n27 + n28)/28;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=29){

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

    n5= in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

System.out.println("N° 15");

    n15 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 16");

   n16 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 17");
   
   n17 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 18");
   
   n18 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 19");
   
   n19 = in.nextDouble();
   System.out.println("");

System.out.println("N° 20");

    n20 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 21");

   n21= in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 22");
   
   n22 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 23");
   
   n23 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 24");
   
   n24 = in.nextDouble();
   System.out.println("");

System.out.println("N° 25");

    n25 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 26");

   n26 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 27");
   
   n27 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 28");
   
   n28 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 29");
   
   n29 = in.nextDouble();
   System.out.println("");

resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14 + n15 + n16 + n17 + n18 + n19 + n20 + n21 + n22 + n23 + n24 + n25 + n26 +n27 + n28 + n29)/29;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }


    } else if(notas>=1&&notas<=30){

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

    System.out.println("N° 6");

   n6 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 7");
   
   n7 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 8");
   
   n8 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 9");
   
   n9 = in.nextDouble();
   System.out.println("");

System.out.println("N° 10");

    n10 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 11");

   n11 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 12");
   
   n12 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 13");
   
   n13 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 14");
   
   n14 = in.nextDouble();
   System.out.println("");

System.out.println("N° 15");

    n15 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 16");

   n16 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 17");
   
   n17 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 18");
   
   n18 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 19");
   
   n19 = in.nextDouble();
   System.out.println("");

System.out.println("N° 20");

    n20 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 21");

   n21= in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 22");
   
   n22 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 23");
   
   n23 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 24");
   
   n24 = in.nextDouble();
   System.out.println("");

System.out.println("N° 25");

    n25 = in.nextDouble();
    System.out.println(""); 

    System.out.println("N° 26");

   n26 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 27");
   
   n27 = in.nextDouble();
   System.out.println(""); 

  System.out.println("N° 28");
   
   n28 = in.nextDouble();
   System.out.println(""); 
  
System.out.println("N° 29");
   
   n29 = in.nextDouble();
   System.out.println("");

System.out.println("N° 30");

    n30 = in.nextDouble();
    System.out.println(""); 

resultado =(n1+ n2 + n3 + n4 + n5 + n6+n7 + n8 + n9 + n10 + n11 + n12 +n13 + n14 + n15 + n16 + n17 + n18 + n19 + n20 + n21 + n22 + n23 + n24 + n25 + n26 +n27 + n28 + n29 + n30)/30;

System.out.println("BAJO: 2");
System.out.println("BASICO:3.5");
System.out.println("ALTO:4");
System.out.println("SUPERIOS:4.5");
System.out.println("");
System.out.println("");
System.out.println("");

  if(resultado >= 3.5){ 
System.out.println(nombre + " PASO " + materia + " con: " + resultado);
}else{
System.out.println(nombre + " PERDIO " + materia + " con: " + resultado);
      }

    }
    
  }
}
