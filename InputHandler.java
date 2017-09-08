import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class InputHandler extends MouseAdapter{
    private TicTacToeCell cell;
    Random r = new Random();

    public InputHandler(TicTacToeCell cell){
        this.cell = cell;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        cell.setBackground(Color.GRAY);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        cell.setBackground(Color.WHITE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        GameValues.getInst().setCellValue(cell.x, cell.y, GameValues.getInst().getTurn());
        cell.repaint();
        GameValues.getInst().switchTurn();
    }
}
