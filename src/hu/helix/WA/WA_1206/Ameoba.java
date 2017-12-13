package hu.helix.WA.WA_1206;

/**
 * Created by java1 on 2017.12.13..
 */
public class Ameoba {
    char [][] board = new char[3][3];

    public Ameoba() {
       init();
    }

    public void init (){
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                board[i][j]= '_';
            }

        }
    }

    public void drawBoard(){
        //aktuális állapota a táblának

        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public void play(){
        //két játékos játéka
    }



    public boolean isCharacterWinner(char symbol){


        //itt meghívja az alatta lévő négy metódust és elég csak ezt meghívni h megtudjuk melyik nyert
        return checkColumn(symbol) || checkRow(symbol) || checkDiagonalLeftToRight(symbol) || checkDiagonalRightToLeft(symbol);
    }



    private boolean checkRow(char symbol){

        for (int i = 0; i <board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if  (board[i][j]==board[i][j+1]){

                }

            }

        }

        return false;
    }



    private boolean checkColumn(char symbol){
        //symbol vagy kör vagy kereszt ezt kell megnézni külön meghívni mind a két fajtára
return false;
    }
    private boolean checkDiagonalLeftToRight(char symbol){
return false;
    }
    private boolean checkDiagonalRightToLeft(char symbol){
return false;
    }
}
