import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Game {
    private JFrame frame;

    public static void main(String[] args) throws Exception{
        new Game().run();
    }

    private void run() throws Exception{
        frame = new JFrame(ConfigHandler.getInst().getPropertyValue("title"));

        JPanel bigPanel = new JPanel(new GridLayout(3, 3));
        for(int i=0; i<9; i++){
            JPanel smallPanel = new JPanel(new GridLayout(3, 3));
            smallPanel.setBorder(new LineBorder(Color.BLACK, 3));
            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){
                    smallPanel.add(new TicTacToeCell(j, k, i));
                }
            }
            bigPanel.add(smallPanel);

        }
        GameValues.getInst(9, 9);
        frame.setSize(Integer.parseInt(ConfigHandler.getInst().getPropertyValue("windowWidth")), Integer.parseInt(ConfigHandler.getInst().getPropertyValue("windowHeight")));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(bigPanel);
        frame.setVisible(true);
    }

}
