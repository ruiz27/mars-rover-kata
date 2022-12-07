import katas.MarsRover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class MarsRoverTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void test_movesForward(){
        //given
        String position = "0,0,N";
        String commands = "f";

        //when
        MarsRover marsRover = new MarsRover();
        String finalPosition = marsRover.moves(position, commands);

        //then
        assertThat(finalPosition).isEqualTo("0,1,N");
    }
    @Test
    void test_movesBackward(){
        //given
        String position = "0,0,N";
        String commands = "b";

        //when
        MarsRover marsRover = new MarsRover();
        String finalPosition = marsRover.moves(position, commands);

        //then
        assertThat(finalPosition).isEqualTo("0,-1,N");
    }
    @Test
    void test_movesLeft(){
        //given
        String position = "0,0,N";
        String commands = "l";

        //when
        MarsRover marsRover = new MarsRover();
        String finalPosition = marsRover.moves(position, commands);

        //then
        assertThat(finalPosition).isEqualTo("0,0,W");
    }
    @Test
    void test_movesRight(){
        //given
        String position = "0,0,N";
        String commands = "r";

        //when
        MarsRover marsRover = new MarsRover();
        String finalPosition = marsRover.moves(position, commands);

        //then
        assertThat(finalPosition).isEqualTo("0,0,E");
    }
    @Test
    void test_movesLeftAndForward(){
        //given
        String position = "1,2,N";
        String commands = "lf";

        //when
        MarsRover marsRover = new MarsRover();
        String finalPosition = marsRover.moves(position, commands);

        //then
        assertThat(finalPosition).isEqualTo("0,2,W");
    }
    @Test
    void test_movesLeftAndLeft(){
        //given
        String position = "0,0,N";
        String commands = "ll";

        //when
        MarsRover marsRover = new MarsRover();
        String finalPosition = marsRover.moves(position, commands);

        //then
        assertThat(finalPosition).isEqualTo("0,0,S");
    }






}