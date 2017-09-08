import javax.swing.*;

public class GameValues {
    private static GameValues gameValues;
    private char[][] board;
    private JLabel jlblstatus;
    private char turn;

    private GameValues(int rows, int cols){
        board = new char[rows][cols];
        jlblstatus = new JLabel("X's turn");
        turn = 'X';
    }

    public static GameValues getInst(int rows, int cols){
        if(gameValues == null){
            gameValues = new GameValues(rows, cols);
        }
        return gameValues;
    }
    public static GameValues getInst(){
        return gameValues;
    }

    public void setCellValue(int x, int y, char c){
        board[x][y] = c;
    }

    public char getCellValue(int x, int y){
        return board[x][y];
    }

    public void setJlblstatus(String s){
        jlblstatus.setText(s);
    }

    public char getTurn(){
        return turn;
    }

    public void setTurn(char c){
        turn = c;
    }

    public void switchTurn(){
        turn = (turn=='X')?'O':'X';
        jlblstatus.setText(turn + "'s turn");
    }


}
