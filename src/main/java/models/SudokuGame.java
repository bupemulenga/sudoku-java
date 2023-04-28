package models;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    // Enum to represent the different states of the game
    private final GameState gameState;

    // Two-dimensional array to represent the puzzle itself
    private final int[][] gridState;

    // Constant
    public static final int GRID_BOUNDARY = 9;

    // Constructor
    public SudokuGame(GameState gameState, int[][] gridState){
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    // Immutable getter so that our SudokuGame object does not get altered
    public int[][] getCopyOfGridState() {
        return SudokuUtilities.coptToNewArray(gridState);
    }
}
