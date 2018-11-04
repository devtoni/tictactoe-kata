package com.katas.tictactoe;

public enum Row {
    TOP(0), MIDDLE(1), BOTTOM(2);

    private final int index;

    Row(int index) {
        this.index = index;
    }

    public int getIndex(){
        return index;
    }
}
