package katas;

import java.util.Arrays;

public class MarsRover {

    private Integer[] startingPoint;
    private Integer[] direction;

    public MarsRover(Integer[] startingPoint, Integer[] direction) {
        this.startingPoint = startingPoint;
        this.direction = direction;
    }

    public Integer[] move(String[] commands) {

        Integer[] finalPosition = {startingPoint[0],startingPoint[1],0,0};
        Arrays.stream(commands).forEach(u->{
            if(u.equals("f")){
                finalPosition[0] = finalPosition[0] + 1;
            }
            if(u.equals("b")){
                finalPosition[1] = finalPosition[1] - 1;
            }
            if(u.equals("l")){
                finalPosition[2] = finalPosition[2] - 1;
            }
            if(u.equals("r")){
                finalPosition[3] = finalPosition[3] + 1;
            }
        });

        return finalPosition;
    }
}
