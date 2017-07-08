package movement;
 
import processing.core.PApplet;
import processing.core.PImage;
 
 
public class Movement extends PApplet 
{
    public float speed = 10;
     
    public float x = 400;
    public float y = 350;
     
    public boolean moveForward = false;
     
    public boolean moving = false;
 
    public void setup() 
    {
        size(800, 700);
    }
 
    public void draw() 
    {        
        background(255, 255, 255);
         
        //Move and control the rocket ship.
        move();
        translate(x, y);
        drawRocketShip();
    }
     
    //Set up and draw the rocket ship.
    public int rocketX = 0;
    public int rocketY = 0;
     
    public void drawRocketShip()
    {
        //Body color.
        stroke(0, 149, 185);
        fill(0, 149, 185);
        //Body
        rect(rocketX, rocketY, 75, 50);
        //front
        triangle(rocketX + 75, rocketY + 1, 100, rocketY + 25, rocketX + 75, rocketY + 49);
        //window color
        fill(255, 255, 255);
        //window
        ellipse(rocketX + 60, rocketY + 25, 30, 15);
        //wings
        stroke(0, 149, 185);
        strokeWeight(3);
        fill(255, 255, 255);
        triangle(rocketX + 25, rocketY, rocketX - 15, rocketY - 25, rocketX, rocketY);
        triangle(rocketX + 25, rocketY + 50, rocketX - 15, rocketY + 75, rocketX, rocketY + 50);
         
        if(moving)
        {
            //Fire trail
            fill(255, 0, 0);
            noStroke();
            triangle(rocketX - 10, rocketY + 10, rocketX - 30, rocketY + 25, rocketX - 10, rocketY + 40);
        }
    }
     
    public void keyPressed() 
    {
        if(key == 'w') 
        {
            moveForward = true;
            moving = true;
        } 
    }
     
    public void keyReleased()
    {
        if(key == 'w') 
        {
            moveForward = false;
            moving = false;
        } 
    }
     
    public void move()
    {
        if(moveForward)
        {
            x += speed;
        }
    }
}