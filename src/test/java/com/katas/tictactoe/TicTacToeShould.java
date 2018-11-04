package com.katas.tictactoe;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TicTacToeShould {
    @Test
    public void always_allow_to_play_X_first() {
        TicTacToe ticTacToe = new TicTacToe();
        assertThat(ticTacToe.currentPlayer(), is("X"));
    }
}
