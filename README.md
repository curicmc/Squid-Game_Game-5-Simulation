# Squid-Game_Game-5-Simulation
**-- TV SHOW SPOILERS BELOW --**

A simulation of game 5, the Bridge Game, from the Squid Game TV show (2021).

It allows you to specify the **amount of players** and the **length of the bridge**.
You can either run
* single step-by-step simulation of a game with *BridgeGame.runBridge()*
* OR many games at once to find a breakdown and average amount of winners with *runBridgeAverage(int players, int bridgeLength, int loop)*

------------- 

**Game Summary:** The Glass Stone Bridge Game from the show, is a game where players have x (bridge length) amount of pairs of glass panels forming a bridge to the finish. Each pair of panels has a weak panel of ordinary glass and a strong panel of tempered glass. The ordinary glass will break immediately if a player steps on it. Tempered glass can hold 2 players at once.

Players must start crossing the bridge in their specified order. A regular player should have a 50% chance of falling and being eliminated after each step.

In the show, there were 16 players and a bridge length of 18. Only 3 players crossed to the finish. I wanted to find out statistically whether this was above or below average the amount of players that could have won and the breakdown after, *n*, number of games - if each player attempted to cross normally in their specified order with no roughhousing.

I also wanted to find out how the numbers of winners will change depending on the amount of players and length of the bridge.

------------- 

Test output for 16 players with a bridge length of 18, run 10,000 times:

```
Average players left (players: 16, bridge length: 18): 7.01
Statistics for 10000 game(s):
	| Players Remaining : Count : Probability |
	-------------------------------------------
	0	 : 5	 : 0.05%
	1	 : 33	 : 0.33%
	2	 : 113	 : 1.13%
	3	 : 306	 : 3.06%
	4	 : 725	 : 7.25%
	5	 : 1199	 : 11.99%
	6	 : 1719	 : 17.19%
	7	 : 1862	 : 18.62%
	8	 : 1620	 : 16.20%
	9	 : 1204	 : 12.04%
	10	 : 678	 : 6.78%
	11	 : 369	 : 3.69%
	12	 : 132	 : 1.32%
	13	 : 29	 : 0.29%
	14	 : 6	 : 0.06%
	15	 : 0	 : 0.00%
	16	 : 0	 : 0.00%
```

Test output of single game simulation for 16 players with a bridge length of 18:
```
--- SINGLE BRIDGE GAME SIMULATION START ---
Number of players: 16
Length of bridge: 18

Player 1 jumps on step 1 and survives.
-- 1 steps completed and 16 players left --
Player 1 jumps on step 2 and survives.
-- 2 steps completed and 16 players left --
Player 1 jumps on step 3 and survives.
-- 3 steps completed and 16 players left --
Player 1 jumps on step 4 and survives.
-- 4 steps completed and 16 players left --
Player 1 jumps on step 5 and survives.
-- 5 steps completed and 16 players left --
Player 1 jumps on step 6 and survives.
-- 6 steps completed and 16 players left --
Player 1 jumps on step 7 and survives.
-- 7 steps completed and 16 players left --
Player 1 jumps on step 8 and falls.
-- 8 steps completed and 15 players left --
Player 2 jumps on step 9 and falls.
-- 9 steps completed and 14 players left --
Player 3 jumps on step 10 and survives.
-- 10 steps completed and 14 players left --
Player 3 jumps on step 11 and falls.
-- 11 steps completed and 13 players left --
Player 4 jumps on step 12 and survives.
-- 12 steps completed and 13 players left --
Player 4 jumps on step 13 and falls.
-- 13 steps completed and 12 players left --
Player 5 jumps on step 14 and falls.
-- 14 steps completed and 11 players left --
Player 6 jumps on step 15 and falls.
-- 15 steps completed and 10 players left --
Player 7 jumps on step 16 and survives.
-- 16 steps completed and 10 players left --
Player 7 jumps on step 17 and survives.
-- 17 steps completed and 10 players left --
Player 7 jumps on step 18 and falls.
-- 18 steps completed and 9 players left --

--- BRIDGE GAME SIMULATION END, WINNERS: 9 ---

```
