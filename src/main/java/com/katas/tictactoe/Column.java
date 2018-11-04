package com.katas.tictactoe;

public enum Column {
    LEFT(0), MIDDLE(1), RIGHT(2);

    private final int index;

    Column(int index) {
        this.index = index;
    }

    public int getIndex(){
        return index;
    }
}
