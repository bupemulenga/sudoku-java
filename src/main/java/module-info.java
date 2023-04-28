module com.sudoku.javadesktopsudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sudoku.javadesktopsudoku to javafx.fxml;
    exports com.sudoku.javadesktopsudoku;
}