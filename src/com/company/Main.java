package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	// write your code here
        pilas p = new pilas();
        int opcion;
      do {
          System.out.println(" ");
          System.out.println("Elija una opción");
          System.out.println("( 1 ) --> Insertar");
          System.out.println("( 2 ) --> Mostrar");
          System.out.println("( 3 ) --> borrar");
          System.out.println("( 4 ) --> listar");
          System.out.println("( 5 ) --> terminar");
          opcion = sc.nextInt();

          switch (opcion){

              case 1:
                  System.out.println(" inserte numero");
                  int num = sc.nextInt();
                  p.push(num);
                  break;

              case 2:
                  System.out.println("Datos");
                  p.peek();
                  break;

              case 3:
                  System.out.println(" Borrar dato ");
                  p.pop();
                  break;
              case 4:
                p.getTamaño();
                break;

              case 5:
                  System.out.println("salio");
                  break;
          }


      }while(opcion != 5);



      //  p.peek(); //muestr
       // p.cima(); //muestra la cima
        //p.pop(); //borra
       // p.peek();
       // p.pop();
        //p.cima();


    }
}
