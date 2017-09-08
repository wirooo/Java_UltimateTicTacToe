import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class TicTacToeCell extends JPanel{

    public int x, y, xdisplace, ydisplace;

    public TicTacToeCell(int x, int y, int q){
        this.x = x;
        this.y = y;
        switch (q){
            case 0:
                xdisplace = 0;
                ydisplace = 0;
                break;
            case 1:
                xdisplace = 3;
                ydisplace = 0;
                break;
            case 2:
                xdisplace = 6;
                ydisplace = 0;
                break;
            case 3:
                xdisplace = 0;
                ydisplace = 3;
                break;
            case 4:
                xdisplace = 3;
                ydisplace = 3;
                break;
            case 5:
                xdisplace = 6;
                ydisplace = 3;
                break;
            case 6:
                xdisplace = 0;
                ydisplace = 6;
                break;
            case 7:
                xdisplace = 3;
                ydisplace = 6;
                break;
            case 8:
                xdisplace = 6;
                ydisplace = 6;
                break;

        }
        setBorder(new LineBorder(Color.BLUE, 1));
        setBackground(Color.WHITE);
        addMouseListener(new InputHandler(this));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(GameValues.getInst().getCellValue(x + xdisplace, y + ydisplace)== 'X'){
            g.drawLine(10, 10, getWidth()-10, getHeight()-10);
            g.drawLine(10, getHeight()-10, getWidth()-10, 10);
        }else if(GameValues.getInst().getCellValue(x + xdisplace, y + ydisplace) == 'O'){
            g.drawOval(10, 10, getWidth()-20, getHeight()-20);
        }
    }
}
