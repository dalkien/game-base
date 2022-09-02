package com.co.madrigal.ink.controller;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscaMinas {

  public void startGame(){

    System.out.println("ingrese la longitud del tablero \n para el ancho ");
    Scanner sc = new Scanner(System.in);
    int ancho = sc.nextInt();
    System.out.println("para el alto ");
    int alto = sc.nextInt();
    String[][] tablero = new String[alto][ancho];
    String[][] mascara = new String[alto][ancho];


    int totMinas = alto;
    for (int fila = 0; fila < alto ; fila++ ){
      for (int columna = 0; columna < ancho; columna ++){
        Random rnd = new Random();
        // cuando sea uno en rnd = 0 + 1 -> el valor seria vacion
        // cuando sea dos en rnd = 1+1 -> el valor seria mina y maxinmo el alto como total de minas
        int base =  rnd.nextInt(2) + 1 ;
        // % -> residuo -> x / 2 = 0 -> la operacion es verdadera de lo contrario es falso
        //     x = 1 -> 1/2 = 1;
        //     x = 2 -> 2/2 = 0;
        //tablero[fila][columna] = base % 2 ==0 && totMinas != 0 ? "M" : "X" ;
        if (base % 2 ==0 && totMinas != 0){
          tablero[fila][columna] = "M";
          //totMinas = totMinas -1;
          totMinas -= 1;
          //totMinas--;
        }else {
          tablero[fila][columna] = "X";
        }
        mascara [fila][columna] = "*";
      }
    }

/*    for (String[] tab : mascara) {
      System.out.println(Arrays.toString(tab));
    }*/

    boolean gameOver = false;
    int score = 0;
    while (!gameOver){
      for (String[] tab : mascara) {
        System.out.println(Arrays.toString(tab));
      }
      System.out.println("seleccione la posicion de 1 a " + alto +" para la fila" +
          " y de 1 a "+ ancho + " para la columna separado por coma" );
      String seleccion = sc.next();
      int altFil = Integer.valueOf(seleccion.split(",")[0]) - 1 ;
      int ancCol = Integer.valueOf(seleccion.split(",")[1]) - 1 ;
      if (tablero[altFil][ancCol] == "M" ){
        System.out.println(" estallado!!! fin del juego ");
        System.out.println("tu puntaje fue de -> " + score);
        gameOver = true;
      }else {
        System.out.println("cual es su siguiente seleccion ");
        mascara[altFil][ancCol] = tablero[altFil][ancCol];
        //score = score +100;
        score +=100;
      }
    }

  }
}
