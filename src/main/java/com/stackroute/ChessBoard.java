package com.stackroute;

public class ChessBoard {
    public String[] generateChessBoard()
    {
        String[] board = new String[8];
        for(int i=0;i<8;i++)
        {
            if(i%2==0)
                board[i]="WW|BB|WW|BB|WW|BB|WW|BB|";
            else
                board[i]="BB|WW|BB|WW|BB|WW|BB|WW|";
        }
        return board;
    }
}
