package com.katas.tictactoe;

public enum Players {
    X("X"), O("O"), EMPTY("");

    private final String representation;

    Players(String representation) {
        this.representation = representation;
    }

    public static String of(Players player) {
        return player.representation;
    }

    public String getRepresentation(){
        return representation;
    }

}
