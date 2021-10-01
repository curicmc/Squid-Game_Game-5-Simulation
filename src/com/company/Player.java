/*
A class that simulates a player and whether or not they are eliminated.
 */
package com.company;
public class Player {

    String name;
    boolean isEliminated;

    Player(String name){
        this.name = name;
        isEliminated = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEliminated() {
        return isEliminated;
    }

    public void setEliminated(boolean eliminated) {
        isEliminated = eliminated;
    }
}
