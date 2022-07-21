package RobotBoundedInCircle;

public class RobotBounded {
    public boolean isRobotBounded(String instructions){
        int x = 0, y = 0;
        int dirX = 0, dirY = 1;

        for (char c:
             instructions.toCharArray()) {
            if (c == 'G'){
                x += dirX;
                y += dirY;
            }
            // counter clockwise perpendicular vector (x, y) -> (x=-y, y=x)
            else if (c == 'L'){
                int temp = dirX;
                dirX = -1*dirY;
                dirY = temp;
            }

            // clockwise perpendicular vector (x, y) -> (x=y, y=-x)
            else{
                int temp = dirX;
                dirX = dirY;
                dirY = -1*temp;
            }
        }

        if ((x==0 && y==0) || dirX != 0 || dirY != 1){
            return true;
        }

        else return false;
    }
}
