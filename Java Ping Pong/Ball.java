import java.awt.*;
import java.util.*;

public class Ball extends Rectangle {

    Random random;
    int xVelocity; // how fast ball moves on x axis
    int yVelocity; // how fast ball moves on y axis
    int initialSpeed = 2;

    Ball(int x, int y, int width, int height) {
        super(x,y,width,height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if(randomXDirection == 0)
            randomXDirection--;
        setXDirection(randomXDirection*initialSpeed);
        
        int randomYDirection = random.nextInt(2);
        if(randomYDirection == 0)
            randomYDirection--;
        setYDirection(randomYDirection*initialSpeed);
    }

    public void setXDirection(int randowmXDirection) { // created this because ball will go in random direction on x axis
        xVelocity = randowmXDirection;
    }
    public void setYDirection(int randowmYDirection) { // created this because ball will go in random direction on y axis
        yVelocity = randowmYDirection;
    }
    public void move() {
        x += xVelocity;
        y += yVelocity;
    }
    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, height, width);
    }
    
}
