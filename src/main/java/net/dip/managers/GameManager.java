package net.dip.managers;

import net.dip.enums.GameState;

public class GameManager {

    private static GameState gameState;

    public static void setGameState(GameState state){
        gameState = state;
    }

    public static GameState getGameState(){
        return gameState;
    }
}