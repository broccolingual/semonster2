package org.example;
import java.util.ArrayList;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  ArrayList<Monster> deck = new ArrayList<>();
  String name;
  int hp;

  Player() {
    this.hp=100;
  }

  Player(String name) {
    this.name = name;
    this.hp=100;
  }

  Player(String name, int hp){
    this.name = name;
    this.hp = hp;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void drawMonsters() {
    for (int i = 0; i < 5; i++) {
      this.deck.add(new Monster());
    }
  }

  public void drawMonsters(int monsterlist[],int rarelist[]) {
    for (int i = 0; i < monsterlist.length; i++) {
      this.deck.add(new Monster(monsterlist[i],rarelist[i]));
    }
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("hp: ").append(this.hp).append("\n");
    sb.append("Deck: ").append(this.name).append("\n");
    for (Monster m : this.deck) {
        sb.append(m).append("\n");
    }
    return sb.toString();
}

  public void showDeck() {
    System.out.println("Deck:"+this.name);
    for (Monster m : this.deck) {
      System.out.println(m);
    }
  }

}