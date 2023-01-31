package dev.leehis.userinterface;

import java.util.HashMap;

import dev.leehis.problemdomain.Coordinates;
import dev.leehis.problemdomain.SudokuGame;
import dev.leehis.userinterface.IUserInterfaceContract.EventListener;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class UserInterfaceImpl implements IUserInterfaceContract.View, EventHandler<KeyEvent> {

    private final Stage stage;
    private final Group root;

    // how do we keep track of 81 different text fields?
    private HashMap<Coordinates, SudokuTextField> textFieldCoordinates;
    

    @Override
    public void handle(KeyEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setListener(EventListener listener) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateSquare(int x, int y, int input) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateBoard(SudokuGame game) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void showDialog(String message) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void showError(String message) {
        // TODO Auto-generated method stub
        
    }
    
}
