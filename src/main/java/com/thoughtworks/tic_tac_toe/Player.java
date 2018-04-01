package com.thoughtworks.tic_tac_toe;

import java.util.HashSet;

public class Player {
    private final String name;
    private final String symbol;
    protected HashSet <Integer> moves;

    public Player(String name , String symbol) {
        this.name = name;
        this.symbol = symbol;
        this.moves = new HashSet<> ( );
    }

    public boolean addMove(int move) throws MoveAlreadyMadeException, InvalidMoveException {
        validateMove (move);
        return this.moves.add(move);
    }

    private void validateMove(int move) throws MoveAlreadyMadeException, InvalidMoveException {
        if (moveAlreadyMade(move))
            throw new MoveAlreadyMadeException ();
        if (invalid(move))
            throw new InvalidMoveException ();
    }

    private boolean invalid(int move) {
        return move<1||move>9;
    }

    private boolean moveAlreadyMade(int move) {
        return moves.contains ( move );
    }

    public HashSet <Integer> getMoves() {
        return moves;
    }
}
