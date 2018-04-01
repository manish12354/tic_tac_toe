package com.thoughtworks.tic_tac_toe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class PlayerTest {
    private Player player;

    @Before
    public void setUp(){
        player = new Player ( "manish" , "*" );
    }
    @Test
    public void shouldTakePlayerCurrentMove() throws MoveAlreadyMadeException, InvalidMoveException {
        assertTrue(player.addMove(1));
    }


    @Test
    public void shouldStoreAllPlayerMoves() throws MoveAlreadyMadeException, InvalidMoveException {
        player.addMove ( 1 );
        player.addMove ( 2 );
        assertThat ( player.getMoves().size() ,is(2));
    }

  @Test(expected = MoveAlreadyMadeException.class)
  public void shouldThrowExceptionIfMoveAlreadyMade() throws MoveAlreadyMadeException, InvalidMoveException {
    player.addMove ( 1 );
    player.addMove ( 2 );
    player.addMove ( 2 );
  }

  @Test(expected = InvalidMoveException.class)
  public void shouldThrowInvalidMoveExceptionForInvalidMove() throws MoveAlreadyMadeException, InvalidMoveException {
    player.addMove ( 0 );
    player.addMove ( 2 );
    player.addMove ( 10 );
  }
}
