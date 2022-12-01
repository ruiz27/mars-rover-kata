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
    void givenStartPointAndCommandForwardWhenMoveThenReturnMovedPosition() {
        // given
        Integer[] startingPoint = new Integer[]{0, 0};
        Integer[] direction = new Integer[]{1,0,0,0};
        marsRover = new MarsRover(startingPoint, direction);
        String[] commands = new String[]{"f"};

        //when
        Integer[] finalPosition = marsRover.move(commands);

        //then
        assertThat(finalPosition).isEqualTo(direction);
    }
    @Test
    void givenStartPointAndCommandLeftWhenMoveThenReturnMovedPosition() {
        // given
        Integer[] startingPoint = new Integer[]{0, 0};
        Integer[] direction = new Integer[]{0,0,-1,0};
        marsRover = new MarsRover(startingPoint, direction);
        String[] commands = new String[]{"l"};

        //when
        Integer[] finalPosition = marsRover.move(commands);

        //then
        assertThat(finalPosition).isEqualTo(direction);
    }
    @Test
    void givenStartPointAndCommandRightWhenMoveThenReturnMovedPosition() {
        // given
        Integer[] startingPoint = new Integer[]{0, 0};
        Integer[] direction = new Integer[]{0,0,0,1};
        marsRover = new MarsRover(startingPoint, direction);
        String[] commands = new String[]{"r"};

        //when
        Integer[] finalPosition = marsRover.move(commands);

        //then
        assertThat(finalPosition).isEqualTo(direction);
    }



}