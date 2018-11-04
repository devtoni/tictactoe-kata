package com.katas.tictactoe;

public class TicTacToe {

    private String player;

    public TicTacToe(){
        player = "X";
    }

    public String currentPlayer() {
        return player;
    }

    public void nextTurn() {
        player = player.equals("X") ? "O" : "X";
    }
}
