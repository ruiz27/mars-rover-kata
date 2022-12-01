import katas.Direction;
import katas.MarsRover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class MarsRoverTest {

    private final MarsRover marsRover = new MarsRover();

    @BeforeEach
    void setUp() {

    }

    @Test
    void givenStartPointAndDirectionWhenMoveThenReturnSamePosition(){
        MarsRover marsRover = this.marsRover;

        Integer[] startingPoint = new Integer[]{0,0};
        Direction direction = new Direction(0,0,0,0);
        String[] commands = new String[]{""};

        Integer[] finalPosition = marsRover.move(startingPoint, direction, commands);

        assertThat(finalPosition).isEqualTo(new Integer[]{0,0,0,0});
    }











}