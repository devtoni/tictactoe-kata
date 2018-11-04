package com.katas.tictactoe;

import junitparams.JUnitParamsRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class TicTacToeShould {

    private Board board;
    private TicTacToe ticTacToe;
    @Before
    public void setUp() {
        board = new Board();
        ticTacToe = new TicTacToe(board);
    }

    @After
    public void nullify_game(){
        board = null;
        ticTacToe = null;
    }

    @Test
    public void always_allow_to_play_X_first() {
        assertThat(ticTacToe.currentPlayer(Players.X), is(true));
    }

    @Test
    public void alternate_turn_with_every_player(){
        ticTacToe.play(Row.BOTTOM, Column.MIDDLE);

        assertThat(ticTacToe.currentPlayer(Players.O), is(true));

        ticTacToe.play(Row.TOP, Column.MIDDLE);

        assertThat(ticTacToe.currentPlayer(Players.X), is(true));
    }

    @Test
    public void determine_as_winner_player_X_if_does_a_three_in_a_row(){
        ticTacToe.play(Row.TOP, Column.MIDDLE);
        ticTacToe.play(Row.TOP, Column.RIGHT);
        ticTacToe.play(Row.MIDDLE, Column.MIDDLE);
        ticTacToe.play(Row.BOTTOM, Column.RIGHT);
        ticTacToe.play(Row.BOTTOM, Column.MIDDLE);

        assertThat(ticTacToe.isWinner(Players.X), is(true));
    }

    @Test
    public void determine_as_winner_player_O_if_does_a_three_in_a_row(){
        ticTacToe.play(Row.TOP, Column.RIGHT);
        ticTacToe.play(Row.TOP, Column.MIDDLE);
        ticTacToe.play(Row.BOTTOM, Column.RIGHT);
        ticTacToe.play(Row.MIDDLE, Column.MIDDLE);
        ticTacToe.play(Row.BOTTOM, Column.LEFT);
        ticTacToe.play(Row.BOTTOM, Column.MIDDLE);

        assertThat(ticTacToe.isWinner(Players.O), is(true));
    }

    @Test
    public void determine_draw_when_board_is_full_and_none_of_the_players_has_won(){
        ticTacToe.play(Row.TOP, Column.LEFT);
        ticTacToe.play(Row.TOP, Column.MIDDLE);
        ticTacToe.play(Row.TOP, Column.RIGHT);
        ticTacToe.play(Row.MIDDLE, Column.LEFT);
        ticTacToe.play(Row.MIDDLE, Column.MIDDLE);
        ticTacToe.play(Row.MIDDLE, Column.RIGHT);
        ticTacToe.play(Row.BOTTOM, Column.LEFT);
        ticTacToe.play(Row.BOTTOM, Column.MIDDLE);
        ticTacToe.play(Row.BOTTOM, Column.RIGHT);

        assertThat(ticTacToe.isDraw(), is(true));
    }

}
