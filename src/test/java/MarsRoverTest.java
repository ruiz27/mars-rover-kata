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




}