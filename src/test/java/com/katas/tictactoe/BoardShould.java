package com.katas.tictactoe;

import org.junit.Test;

public class BoardShould {
    @Test(expected = PlayerCanNotChooseAPlayedPositionException.class)
    public void not_allow_players_to_choose_the_same_square(){
        Board board = new Board();
        board.place(Players.X, Row.TOP, Column.MIDDLE);
        board.place(Players.O, Row.TOP, Column.MIDDLE);
    }

    @Test

}
