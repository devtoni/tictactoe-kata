package com.katas.tictactoe;

public class TicTacToe {

    private Players player;

    public TicTacToe(){
        player = Players.X;
    }

    public String currentPlayer() {
        return player.getRepresentation();
    }

    public void nextTurn() {
        player = Players.of(player).equals("X") ? Players.O : Players.X;
    }

}


// nextTurn (Row 2: Col 2)
   // board.place(currnt, 2, 2)