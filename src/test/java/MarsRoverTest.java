import katas.Direction;
import katas.MarsRover;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MarsRoverTest {

    private final MarsRover marsRover = new MarsRover();

    @BeforeEach
    void setUp() {

    }

    @Test
    void givenStartPointAndDirectionWhenTranslateThenReturnTrue(){
        MarsRover marsRover = this.marsRover;

        Integer[] startingPoint = new Integer[]{0,0};
        Direction direction = new Direction(0,0,0,0);

        boolean isMove = marsRover.move(startingPoint, direction);

        assertThat(isMove).isTrue();
    }











}