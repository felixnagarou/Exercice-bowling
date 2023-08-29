package org.example;

import org.example.bowling.Frame;
import org.example.bowling.Game;
import org.example.bowling.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FrameTest {

    @Mock
    private Player mockPlayer;
    private Frame mockFrame;
    Game game;


    @BeforeEach
    void setup(){
        game = new Game();

    }



    @Test
    public void numberOfThrowsShouldDecrementGivenNumberOfKeelHitNotStrike(){
        Mockito.when(mockPlayer.lancer()).thenReturn(9);
        Assertions.assertEquals(1, mockPlayer.getNumberOfThrowsLeft());
    }

    @Test
    public void numberOfThrowsLeftShouldBeZeroGivenNumberOfKeelHitIsStrike(){
        Mockito.when(mockPlayer.lancer()).thenReturn(10);

        Assertions.assertEquals(0, mockPlayer.getNumberOfThrowsLeft());

    }

    @Test
    public void scoreOfNextTwoThrowsShouldBeFactoredByTwoGivenStrike(){ //todo modifier liste en conséquence
        Mockito.when(mockPlayer.lancer()).thenReturn(10);


    }

    @Test
    public void scoreOfNextThrowShouldBeFactoredByTwoGivenSpare(){ //todo différencier spare de hole
        Mockito.when(mockPlayer.lancer()).thenReturn();
    }


    @Test
    public void frameNumberShouldIncrementWhenNumberOfThrowsIsSetToZero(){
        Mockito.when(mockFrame.getFrameNumber()).thenReturn(2);
        Mockito.when(mockPlayer.getNumberOfThrowsLeft()).thenReturn(0);

        Assertions.assertEquals( 3, mockFrame.getFrameNumber());

    }

    @Test
    public void numberOfThrowsShouldBeAddedOneWhenNumberOfKeelHitIsStrikeDuringLastFrame(){
        Mockito.when(mockFrame.getFrameNumber()).thenReturn(2);
        Mockito.when(mockPlayer.getNumberOfKeelHit()).thenReturn(10);

        Assertions.assertEquals(1, mockPlayer.getNumberOfThrowsLeft());
    }
}
