package com.katas.tictactoe;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BoardShould {
    @Test(expected = PlayerCanNotChooseAPlayedPositionException.class)
    public void not_allow_players_to_choose_the_same_square(){
        Board board = new Board();
        board.place(Players.X, Row.TOP, Column.MIDDLE);
        board.place(Players.O, Row.TOP, Column.MIDDLE);
    }

    @Test
    public void be_full_when_all_positions_are_played(){
        Board board = new Board();

        board.place(Players.X, Row.TOP, Column.LEFT);
        board.place(Players.O, Row.TOP, Column.MIDDLE);
        board.place(Players.X, Row.TOP, Column.RIGHT);
        board.place(Players.O, Row.MIDDLE, Column.LEFT);
        board.place(Players.X, Row.MIDDLE, Column.MIDDLE);
        board.place(Players.O, Row.MIDDLE, Column.RIGHT);
        board.place(Players.X, Row.BOTTOM, Column.LEFT);
        board.place(Players.O, Row.BOTTOM, Column.MIDDLE);
        board.place(Players.X, Row.BOTTOM, Column.RIGHT);

        assertThat(board.isFull(), is(true));
    }

    @Test
    public void player_X_wins_with_a_row_horizontally(){

        Board board = new Board();

        board.place(Players.X, Row.TOP, Column.LEFT);
        board.place(Players.O, Row.MIDDLE, Column.MIDDLE);
        board.place(Players.X, Row.TOP, Column.RIGHT);
        board.place(Players.O, Row.MIDDLE, Column.RIGHT);
        board.place(Players.X, Row.TOP, Column.MIDDLE);

        assertThat(board.isThreeInARow(Players.X), is(true));
    }

    @Test
    public void player_X_wins_with_a_row_vertically(){
        Board board = new Board();

        board.place(Players.X, Row.TOP, Column.MIDDLE);
        board.place(Players.O, Row.TOP, Column.RIGHT);
        board.place(Players.X, Row.MIDDLE, Column.MIDDLE);
        board.place(Players.O, Row.BOTTOM, Column.RIGHT);
        board.place(Players.X, Row.BOTTOM, Column.MIDDLE);

        assertThat(board.isThreeInARow(Players.X), is(true));
    }

    @Test
    public void player_X_wins_with_a_row_diagonally(){
        Board board = new Board();

        board.place(Players.X, Row.TOP, Column.LEFT);
        board.place(Players.O, Row.MIDDLE, Column.LEFT);
        board.place(Players.X, Row.MIDDLE, Column.MIDDLE);
        board.place(Players.O, Row.MIDDLE, Column.RIGHT);
        board.place(Players.X, Row.BOTTOM, Column.RIGHT);

        assertThat(board.isThreeInARow(Players.X), is(true));
    }



}
