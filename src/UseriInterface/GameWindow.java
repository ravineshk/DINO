package UseriInterface;

import javax.swing.*;
import java.io.IOException;

public class GameWindow extends JFrame {
    public GameWindow(){
        setResizable(false);
        setTitle("DINO GAME");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1000,500);
        Board board = new Board();
        add(board);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        GameWindow obj = new GameWindow();
    }
}
