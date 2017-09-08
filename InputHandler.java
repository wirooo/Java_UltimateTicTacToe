import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class InputHandler extends MouseAdapter{
    private TicTacToeCell cell;

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
        GameValues.getInst().setCellValue(cell.x + cell.xdisplace, cell.y + cell.ydisplace, GameValues.getInst().getTurn());
        cell.repaint();
        GameValues.getInst().switchTurn();


        /*System.out.println("board");
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(i + "," + j);
                if(GameValues.getInst().getBoard()[i][j]!='\u0000'){
                    System.out.print(GameValues.getInst().getBoard()[i][j]);
                }else{
                    System.out.print('-');
                }
            }
            System.out.println();
        }*/
    }
}
