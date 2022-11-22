package Porquinho;

import java.util.*;
public class Solver{
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Pig pig = new Pig(0);

      while(true) {
          String line = scanner.nextLine();
          String ui[] = line.split(" ");
          System.out.println("$" + line);

          if(ui[0].equals("init")) {
              pig = new Pig( Integer.parseInt( ui[1]) );
          } else if(ui[0].equals("end")) {
              break;
          } else if(ui[0].equals("addCoin")) {
              if( ui[1].equals("10") ){
                  pig.addCoin(Coin.M10);
              }else if( ui[1].equals("25") ){
                  pig.addCoin(Coin.M25);             
              }else if( ui[1].equals("50") ){
                  pig.addCoin(Coin.M50);             
              }else if( ui[1].equals("100") ){
                  pig.addCoin(Coin.M100);             
              } 
          } else if(ui[0].equals("addItem")) {
              pig.addItem(new Item(ui[1], Integer.parseInt(ui[2])));
          } else if(ui[0].equals("getItens")) {
              System.out.println( pig.getItens() );
          } else if (ui[0].equals("getCoins")) {//km
              System.out.println( pig.getCoins() );
          } else if (ui[0].equals("show")) {//gas
              System.out.println(pig);
          } else if (ui[0].equals("breakPig")) {//gas
              pig.breakPig();
          }else{
              System.out.println("fail: comando invalido");
          }
      }
      scanner.close();
  }
}
