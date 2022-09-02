package com.co.madrigal.ink;

import com.co.madrigal.ink.controller.Aventur;
import com.co.madrigal.ink.controller.BuscaMinas;

import java.util.Scanner;

public class ApplicationMain {

    public static void main(String... args){
        System.out.println("Seleccione el juego 1 para Aventura y 2 para Busca minas");
        Scanner sc = new Scanner(System.in);
        if (sc.nextInt() == 1){
            Aventur aventur = new Aventur();
            aventur.startGame();
        }else {
            System.out.println("Bienvenido a Busca minas");
            BuscaMinas minas = new BuscaMinas();
            minas.startGame();
        }
    }
}
