package com.company;

public class Main {

    public static void main(String[] args) {

        //Returns the statistics of a bridge game run 1000 times with 16 players and a bridge length of 18
        runBridgeAverage(16, 18, 1000);

        //Runs a step-by-step simulation of a single game with 16 players and a bridge length of 18
        BridgeGame originalGame = new BridgeGame(16, 18);   // creates bridge game
        originalGame.runBridge();   // runs bridge game
        originalGame.reset();   // resets game

    }

    /** Runs the bridge game x (loop) number of times with specified parameters and provides average
     * number of players that win, as well as a breakdown of the amount of winners of each game
     * @param players
     * @param bridgeLength
     * @param loop; number of games to play
     * @return average amount of players won
     */
    public static double runBridgeAverage(int players, int bridgeLength, int loop){
        if(loop < 1){
            return -1.0;
        }

        float averageLeft = 0;
        BridgeGame game = new BridgeGame(players, bridgeLength);
        int[] playersLeftCount = new int[players+1]; //counts how many players left for each game

        for(int i = 1; i <= loop; i++){
            game.runBridgeQuiet();
            playersLeftCount[game.getRemaining()]++;
            averageLeft += game.getRemaining();
            game.reset();
        }

        averageLeft = averageLeft / loop;
        System.out.println("\nAverage players left (players: " + players + ", bridge length: " + bridgeLength + "): " + averageLeft);

        System.out.println("Statistics for " + loop + " game(s):");
        System.out.println("\t| Players Remaining : Count |");
        System.out.println("\t------------------------------");
        for(int i = 0; i <= players; i++){
            System.out.println("\t" + i + "\t : " + playersLeftCount[i]);

        }
        return averageLeft;
    }
}
