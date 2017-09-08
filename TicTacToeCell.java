import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class TicTacToeCell extends JPanel{

    public int x, y;

    public TicTacToeCell(int x, int y){
        this.x = x;
        this.y = y;
        setBorder(new LineBorder(Color.BLUE, 1));
        setBackground(Color.WHITE);
        addMouseListener(new InputHandler(this));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(GameValues.getInst().getCellValue(x, y )== 'X'){
            g.drawLine(10, 10, getWidth()-10, getHeight()-10);
            g.drawLine(10, getHeight()-10, getWidth()-10, 10);
        }else if(GameValues.getInst().getCellValue(x, y) == 'O'){
            g.drawOval(10, 10, getWidth()-20, getHeight()-20);
        }
    }
}
