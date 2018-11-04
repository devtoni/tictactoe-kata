package com.katas.tictactoe;

import java.util.Arrays;
import java.util.Vector;

public class Board {
    private final Vector<Players> board;

    public Board() {
        this.board = new Vector<>(Arrays.asList(
                Players.EMPTY, Players.EMPTY, Players.EMPTY,
                Players.EMPTY, Players.EMPTY, Players.EMPTY,
                Players.EMPTY, Players.EMPTY, Players.EMPTY)
        );
    }

    public void place(Players player, Row row, Column column) {
        if (getPlayer(row, column) == player.EMPTY) {
            board.set(row.getIndex() * 3 + column.getIndex(), player);
        } else {
            throw new PlayerCanNotChooseAPlayedPositionException();
        }
    }

    public Players getPlayer(Row row, Column column) {
        return board.get((row.getIndex() * 3 + column.getIndex()));
    }
}
