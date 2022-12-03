package katas;



public class MarsRover {


    public String moves(String position, String commands) {
        char[] listCommands = commands.toCharArray();

        int x = Integer.parseInt(position.split(",")[0]);
        int y = Integer.parseInt(position.split(",")[1]);
        String dir = position.split(",")[2];
        for (int i = 0; i < listCommands.length; i++) {
            if(listCommands[i]=='f'){
                y = y + 1;
            }
            if(listCommands[i]=='b'){
                y = y - 1;
            }
        }
        return x+","+y+","+dir;
    }
}
