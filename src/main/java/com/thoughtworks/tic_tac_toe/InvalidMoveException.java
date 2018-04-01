package com.thoughtworks.tic_tac_toe;

public class InvalidMoveException extends Throwable {
  public InvalidMoveException() {
    super("Invalid move!");
  }
}
