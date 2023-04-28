package models;

import java.io.IOException;

public interface IStorage {
    void updateGateData(SudokuGame game) throws IOException;
    SudokuGame getGameData() throws IOException;
}
