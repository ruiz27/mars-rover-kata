import katas.Direction;
import katas.MarsRover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class MarsRoverTest {

    private MarsRover marsRover;

    @BeforeEach
    void setUp() {

    }

    @Test
    void givenStartPointAndDirectionWhenMoveThenReturnSamePosition() {
        //given
        Integer[] startingPoint = new Integer[]{0, 0};
        Integer[] direction = new Integer[]{0,0,0,0};
        marsRover = new MarsRover(startingPoint, direction);
        String[] commands = new String[]{""};

        //when
        Integer[] finalPosition = marsRover.move(commands);

        //then
        assertThat(finalPosition).isEqualTo(direction);
    }
    @Test
    void givenStartPointAndCommandNorthWhenMoveThenReturnMovedPosition() {
        // given
        Integer[] startingPoint = new Integer[]{0, 0};
        Integer[] direction = new Integer[]{1,0,0,0};
        marsRover = new MarsRover(startingPoint, direction);
        String[] commands = new String[]{"n"};

        //when
        Integer[] finalPosition = marsRover.move(commands);

        //then
        assertThat(finalPosition).isEqualTo(direction);
    }


}