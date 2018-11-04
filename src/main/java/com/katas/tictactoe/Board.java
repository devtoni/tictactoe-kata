package com.katas.tictactoe;

import java.util.Arrays;
import java.util.Vector;

public class Board {
    private Vector<Players> board;

    public Board() {
        fillBoard();
    }

    private void fillBoard() {
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

    public boolean isFull() {
        return board.stream().allMatch(square -> square != Players.EMPTY);
    }

    public boolean isThreeInARow(Players player) {
        if(     getPlayer(Row.TOP, Column.LEFT) == player &&
                getPlayer(Row.MIDDLE, Column.LEFT) == player &&
                getPlayer(Row.BOTTOM, Column.LEFT) == player)
            return true;
        if(     getPlayer(Row.TOP, Column.MIDDLE) == player &&
                getPlayer(Row.MIDDLE, Column.MIDDLE) == player &&
                getPlayer(Row.BOTTOM, Column.MIDDLE) == player)
            return true;
        if(     getPlayer(Row.TOP, Column.RIGHT) == player &&
                getPlayer(Row.MIDDLE, Column.RIGHT) == player &&
                getPlayer(Row.BOTTOM, Column.RIGHT) == player)
            return true;
        if(     getPlayer(Row.TOP, Column.LEFT) == player &&
                getPlayer(Row.TOP, Column.MIDDLE) == player &&
                getPlayer(Row.TOP, Column.RIGHT) == player)
            return true;
        if(     getPlayer(Row.MIDDLE, Column.LEFT) == player &&
                getPlayer(Row.MIDDLE, Column.MIDDLE) == player &&
                getPlayer(Row.MIDDLE, Column.RIGHT) == player)
            return true;
        if(     getPlayer(Row.BOTTOM, Column.LEFT) == player &&
                getPlayer(Row.BOTTOM, Column.MIDDLE) == player &&
                getPlayer(Row.BOTTOM, Column.RIGHT) == player)
            return true;
        if(     getPlayer(Row.TOP, Column.LEFT) == player &&
                getPlayer(Row.MIDDLE, Column.MIDDLE) == player &&
                getPlayer(Row.BOTTOM, Column.RIGHT) == player)
            return true;
        return false;
    }
}
