package org.example;
import java.util.ArrayList;

public class SeMonsterGame {
    ArrayList<Player> players = new ArrayList<>();

    public void addPlayer(String name) {
        this.players.add(new Player(name));
    }

    public void draw(String playerName){
        for(Player player : players){
            if(player.name==playerName){
                player.drawMonsters();
            }
        }
    }

    public boolean isExist(String playerName){
        for(Player player : players){
            if(player.name==playerName){
                return true;
            }
        }
        return false;
    }
}

