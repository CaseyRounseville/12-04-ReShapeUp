// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
import java.lang.Math;
public class Rectangle
{
  private Point origin;
  private int width;
  private int height;
  public Rectangle()
  {
    origin.setX(0);
    origin.setY(0);
    width=0;
    height=0;
  }
  public Rectangle(Point bottomLeft,Point topRight)
  {
    origin=bottomLeft;
    width=Math.abs(origin.getX()-topRight.getX());
    height=Math.abs(origin.getY()-topRight.getY());
  }
  public Rectangle(Point bottomLeft,int vertical,int horizontal)
  {
    origin=bottomLeft;
    width=horizontal;
    height=vertical;
  }
  public Point getBottomLeft()
  {
    return origin;
  }
  public Point getTopRight()
  {
    Point topRight=new Point(width+origin.getX(),height+origin.getY());
    return topRight;
  }
  public int getHeight()
  {
    return height;
  }
  public int getWidth()
  {
    return width;
  }
  public double area()
  {
    double area=width*height;
    return area;
  }
  public double diagonal()
  {
    double diag=Math.sqrt((height*height)+(width*width));
    return diag;
  }
  public int perimeter()
  {
    int p=height+height+width+width;
    return p;
  }
  public boolean isSquare()
  {
    if(height==width)
    {
      return true;
    }
    return false;
  }
  public String toString()
  {
    String rectangle="[("+origin.getX()+","+origin.getY()+"),("+getTopRight().getX()+","+getTopRight().getY()+")]";
    return rectangle;
  }
  public void translate(int num1,int num2)
  {
    origin.setX(origin.getX()+num1);
    origin.setY(origin.getY()+num2);
  }
  public void scale(int dx,int dy)
  {
    width+=dx;
    height+=dy;
  }
}

