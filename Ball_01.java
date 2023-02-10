import java.util.*;

public class Ball_01{
  public static void main(String[] args){
    Ball ball1 = new Ball();
    ball1.setX(2);
    ball1.setY((float)2.5);
    ball1.setXDelta(-1);
    ball1.setYDelta(3);
    ball1.setRadius(5);
    System.out.println(ball1.toString());
    ball1.reflectVertical();
    System.out.println(ball1.toString());
  }
} 

class Ball{
  private float x;
  private float y;
  private float xDelta;
  private float yDelta;
  private int radius;

  Ball(float x, float y, float xDelta, float yDelta, int radius){}
  Ball(){};
  public float getX(){
    return this.x;    
  }
  public void setX(float x){
    this.x = x;
  }
  public float getY(){
    return this.y;    
  }
  public void setY(float y){
    this.y = y;
  }
  public float getRadius(){
    return this.radius;    
  }
  public void setRadius(int radius){
    this.radius = radius;
  }
  public float getXDelta(){
    return this.xDelta;    
  }
  public void setXDelta(float xDelta){
    this.xDelta = xDelta;
  }
  public float getYDelta(){
    return this.yDelta;    
  }
  public void setYDelta(float yDelta){
    this.yDelta = yDelta;
  }
  public void move(){
    this.x += this.xDelta;
    this.y += this.yDelta;
  }
  public void reflectHorizontal(){
    this.xDelta = this.xDelta * (-1);
  }
  public void reflectVertical(){
    this.yDelta = this.yDelta * (-1);
  }
  @Override
  public String toString(){
    return "Ball[(" + this.x +", " + this.y + "), speed = (" + this.xDelta + ", " + this.yDelta+")]";
  }
}
