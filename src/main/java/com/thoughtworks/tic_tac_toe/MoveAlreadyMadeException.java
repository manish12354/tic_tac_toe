package com.thoughtworks.tic_tac_toe;

public class MoveAlreadyMadeException extends Throwable {
  public MoveAlreadyMadeException() {
    super ( "move already made!" );
  }
}
