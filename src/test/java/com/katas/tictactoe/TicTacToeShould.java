package com.katas.tictactoe;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class TicTacToeShould {
    @Test
    public void always_allow_to_play_X_first() {
        TicTacToe ticTacToe = new TicTacToe();
        assertThat(ticTacToe.currentPlayer(), is("X"));
    }

    @Test
    public void alternate_turn_with_every_player(){
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.nextTurn();

        assertThat(ticTacToe.currentPlayer(), is("O"));

        ticTacToe.nextTurn();

        assertThat(ticTacToe.currentPlayer(), is("X"));
    }

}
