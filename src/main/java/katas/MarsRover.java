package katas;



public class MarsRover {


    public String moves(String position, String commands) {
        char[] listCommands = commands.toCharArray();

        int x = Integer.parseInt(position.split(",")[0]);
        int y = Integer.parseInt(position.split(",")[1]);
        String dir = position.split(",")[2];
        Point point = new Point(x,y);
        for (char listCommand : listCommands) {
            if (listCommand == 'f') {
                point = this.moveForward(dir, x, y);
            }
            if (listCommand == 'b') {
                point = this.moveBackward(dir, x, y);
            }
            if (listCommand == 'l') {
                dir = "W";
            }
            if (listCommand == 'r') {
                dir = "E";
            }
        }

        return point.getX()+","+ point.getY()+","+dir;
    }

    private Point moveForward(String dir, int x, int y){
        if(dir.equals("N")){
            y = y + 1;
        }
        if(dir.equals("S")){
            y = y - 1;
        }
        if(dir.equals("W")){
            x = x - 1;
        }
        if(dir.equals("E")){
            x = x + 1;
        }
        return new Point(x,y);
    }
    private Point moveBackward(String dir, int x, int y){
        if(dir.equals("N")){
            y = y - 1;
        }
        if(dir.equals("S")){
            y = y + 1;
        }
        if(dir.equals("W")){
            x = x - 1;
        }
        if(dir.equals("E")){
            x = x + 1;
        }
        return new Point(x,y);
    }

}
