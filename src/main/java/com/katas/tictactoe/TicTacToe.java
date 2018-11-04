package com.katas.tictactoe;

public class TicTacToe {

    private Players player;

    public TicTacToe(){
        player = Players.X;
    }

    public String currentPlayer() {
        return player.representation;
    }

    public void nextTurn() {
        player = Players.of(player).equals("X") ? Players.O : Players.X;
    }

    private enum Players {
        X("X"), O("O");

        private final String representation;

        Players(String representation) {
            this.representation = representation;
        }

        public static String of(Players player) {
            return player.representation;
        }
    }
}


// nextTurn (Row 2: Col 2)
   // board.place(currnt, 2, 2)