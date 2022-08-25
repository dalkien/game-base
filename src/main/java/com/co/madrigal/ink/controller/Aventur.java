package com.co.madrigal.ink.controller;

import com.co.madrigal.ink.entity.Enemy;
import com.co.madrigal.ink.entity.Gamer;
import com.co.madrigal.ink.entity.Item;
import com.co.madrigal.ink.entity.StageGame;

import java.util.Scanner;

public class Aventur {

  // dificultad
  private int dificult;
  // modo de juego
  private int kindGame;
  // personaje
  private Gamer gamer;
  // enemigos
  private Enemy enemy;
  // Boss
  private Enemy boss;
  // items
  private Item[] items;
  // escenario o nivel
  private StageGame stageGame;

  public void startGame(){
    System.out.println("Seleccione la dificultad: \n 1 -> facil \n 2 -> medio \n 3 -> para dificil");
    Scanner sc = new Scanner(System.in);
    dificult = sc.nextInt();
    System.out.println("Ingrese el nick del personaje: ");
    Scanner sc1 = new Scanner(System.in);
    gamer = new Gamer(sc1.next(), 100,10,20,1,100);
    stageGame = new StageGame(10,"First kill", "earth", 2,5,15,1);
    enemy = new Enemy("Goblin basic",40,4,0, 3);
    boss = new Enemy("Hogoblin basic", 120,10,10, 7);
    Item possion = new Item("Health","possion", 15, "active" );
    Item armor = new Item("Armor","jacket", 10, "active" );
    Item weapon = new Item("Weapon","gun", 15, "active" );
    Item defense = new Item("Defense","Shield", 5, "active");
    items= new Item[]{possion, armor, weapon, defense};
    boolean endGame = false;
    boolean readyGo = true;

    while (!endGame){
      switch (stageGame.getTypeEnviroment()){
        case "earth":
          enemy.setAreaBonus(1);
          boss.setAreaBonus(1);
        case "mart":
          enemy.setAreaBonus(4);
          boss.setAreaBonus(4);
        case "jupiter":
          enemy.setAreaBonus(8);
          boss.setAreaBonus(8);
        case "venus":
          enemy.setAreaBonus(-2);
          boss.setAreaBonus(-2);
        default:
          enemy.setAreaBonus(0);
          boss.setAreaBonus(0);
      }
      int countador = 1;
      while (readyGo){
        boolean action = true;
        while (action){
          System.out.println("Ha encontrado al enemigo # "+ countador + " que desea hacer... \n 1-> atacar \n 2-> usar item \n 3-> usar hechizo " );
          Scanner options = new Scanner(System.in);
          int select = options.nextInt();
          if (options.nextInt() ==1){
            enemy.setTotalDamange(enemy.getTotalDamange() + (gamer.getStamina() + gamer.getBonusSP() ));
            System.out.println( "quedan " +  (enemy.getLifePoints() - enemy.getTotalDamange())  + " puntos de vida al enemigo" );
          }else if (options.nextInt() == 2){
            gamer.setBonusLP(items[0].getAmount());
            System.out.println(gamer.getName() + " te quedan " + ((gamer.getBonusLP()+ gamer.getLifePoints()) - gamer.getTotalDamange()) + " de puntos de vida");
          }else {
            enemy.setTotalDamange(enemy.getTotalDamange() + (gamer.getManaPoints() + gamer.getBonusMP() ));
          }

          System.out.println("el enemigo ha hecho ha atacado ");
          gamer.setTotalDamange(gamer.getTotalDamange() + enemy.getStamina());
          System.out.println(gamer.getName() + " te quedan " + ((gamer.getBonusLP()+ gamer.getLifePoints()) - gamer.getTotalDamange()) + " de puntos de vida");

          if (enemy.getTotalDamange() >= enemy.getLifePoints()){
            action = false;
          }else if (gamer.getTotalDamange() >= (gamer.getBonusLP()+ gamer.getLifePoints()) ){
            action = false;
          }
        }

        stageGame.setTotalEnemis(stageGame.getTotalEnemis()-1);
        countador +=1;
        readyGo = stageGame.getTotalEnemis() > 0;

        if (gamer.getTotalDamange() > (gamer.getBonusLP()+ gamer.getLifePoints()) ){
          readyGo = false;
          endGame = true;
        }
      }
    }

    if (endGame){
      System.out.println("Su juego ha finalizado ");
    }
  }

}
