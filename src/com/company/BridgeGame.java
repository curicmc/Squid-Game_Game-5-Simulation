/*
A class that simulates the bridge game (game 5) from Squid Game.
Takes the number of players playing the game, and how many pairs of steps there are
in the bridge.
 */

package com.company;
import java.util.ArrayList;


public class BridgeGame {
    ArrayList<Player> players = new ArrayList<Player>();
    int numOfPlayers;
    int bridgeLength;
    int stepsCompleted = 0;

    BridgeGame(int numOfPlayers, int bridgeLength){
        this.numOfPlayers = numOfPlayers;
        this.bridgeLength = bridgeLength;

        for(int i = 1; i <= numOfPlayers; i++){
            Player newPlayer = new Player(String.valueOf(i));
            players.add(newPlayer);
        }
    }

    /**
     * Gets the number of non-eliminated players in the game
     * @return number of players
     */
    public int getRemaining(){
        int remainingPlayers = 0;

        for(Player player : players){
            if(!player.isEliminated()){
                remainingPlayers++;
            }
        }
        return remainingPlayers;
    }

    /**
     * Eliminates a particular player
     * @param playerNum
     */
    public void eliminate(int playerNum){
        players.get(playerNum-1).setEliminated(true);
    }

    /**
     * Gets the next player in order to step on the bridge
     * @return Player
     */
    public Player getNextPlayer(){
        for(Player player : players){
            if(!player.isEliminated()){
                return player;
            }
        }
        return null;
    }

    /**
     * Runs a step-by-step simulation of the game
     */
    public void runBridge(){
        System.out.println("\n--- SINGLE BRIDGE GAME SIMULATION START ---");
        System.out.println("Number of players: " + numOfPlayers);
        System.out.println("Length of bridge: " + bridgeLength + "\n");
        while(stepsCompleted < bridgeLength && (getNextPlayer() != null)){
            Player currentPlayer = getNextPlayer();
            if(Math.random() < 0.5){
                //do nothing, player survives step
                System.out.println("Player " + currentPlayer.getName() + " jumps on step " + (stepsCompleted+1) + " and survives.");
            } else {
                //player breaks step
                currentPlayer.setEliminated(true);
                System.out.println("Player " + currentPlayer.getName() + " jumps on step " + (stepsCompleted+1) + " and falls.");
            }
            stepsCompleted++;
            System.out.println("-- " + stepsCompleted + " steps completed and " + getRemaining() + " players left --");
        }

        System.out.println("\n--- BRIDGE GAME SIMULATION END, WINNERS: " + getRemaining() + " ---");
    }

    /**
     * Runs a simulation of the game with no comments
     */
    public void runBridgeQuiet(){
        while(stepsCompleted < bridgeLength && (getNextPlayer() != null)){
            Player currentPlayer = getNextPlayer();
            if(Math.random() < 0.5){
                //do nothing, player survives step
            } else {
                //player breaks step
                currentPlayer.setEliminated(true);
            }
            stepsCompleted++;
        }
    }

    /**
     * Resets the game
     */
    public void reset(){
        for(Player player : players){
            player.setEliminated(false);
        }
        stepsCompleted = 0;
    }


}
