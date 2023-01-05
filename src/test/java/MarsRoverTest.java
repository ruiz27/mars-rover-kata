import katas.MarsRover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class MarsRoverTest {

    private MarsRover marsRover;

    @BeforeEach
    void setUp() {
        marsRover = new MarsRover("55");
    }

    @Test
    void movesForward(){
        //given
        String position = "0,0,N";
        String commands = "f";

        //when
        String finalPosition = marsRover.moves(position, commands);

        //then
        assertThat(finalPosition).isEqualTo("0,1,N");
    }
    @Test
    void movesBackward(){
        //given
        String position = "0,0,N";
        String commands = "b";

        //when
        String finalPosition = marsRover.moves(position, commands);

        //then
        assertThat(finalPosition).isEqualTo("0,-1,N");
    }
    @Test
    void movesLeft(){
        //given
        String position = "0,0,N";
        String commands = "l";

        //when
        String finalPosition = marsRover.moves(position, commands);

        //then
        assertThat(finalPosition).isEqualTo("0,0,W");
    }
    @Test
    void movesRight(){
        //given
        String position = "0,0,N";
        String commands = "r";

        //when
        String finalPosition = marsRover.moves(position, commands);

        //then
        assertThat(finalPosition).isEqualTo("0,0,E");
    }
    @Test
    void movesLeftAndForward(){
        //given
        String position = "1,2,N";
        String commands = "lf";

        //when
        String finalPosition = marsRover.moves(position, commands);

        //then
        assertThat(finalPosition).isEqualTo("0,2,W");
    }
    @Test
    void movesLeftAndLeft(){
        //given
        String position = "0,0,N";
        String commands = "ll";

        //when
        String finalPosition = marsRover.moves(position, commands);

        //then
        assertThat(finalPosition).isEqualTo("0,0,S");
    }
    @Test
    void givenInitializeMapWhenMoveLeftThenResultEastDirection(){
        //given
        String position = "0,0,N";
        String commands = "ll";

        //when
        String finalPosition = marsRover.moves(position, commands);

        //then
        assertThat(finalPosition).isEqualTo("0,0,S");
    }







}