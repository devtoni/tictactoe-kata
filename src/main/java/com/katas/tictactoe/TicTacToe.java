package com.katas.tictactoe;

public class TicTacToe {

    private final Board board;
    private Players currentPlayer;

    public TicTacToe(Board board){
        this.currentPlayer = Players.X;
        this.board = board;
    }

    public boolean currentPlayer(Players player) {
        return currentPlayer == player;
    }

    public void play(Row row, Column column) {
        board.place(currentPlayer, row, column);
        alternatePlayer();
    }

    private void alternatePlayer() {
        currentPlayer = Players.of(currentPlayer).equals("X") ? Players.O : Players.X;
    }

    public boolean isWinner(Players player) {
        return board.isThreeInARow(player);
    }

    public boolean isDraw(){
        return board.isFull() && !board.isThreeInARow(Players.X) || !board.isThreeInARow(Players.O);
    }
}
