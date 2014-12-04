// A Line object represents a line defined by a pair of Points.
// A Line object represents a line defined by a pair of Points.
public class Line
{
  private Point start;
  private Point end;
  public Line()
  {
    start.setX(0);
    start.setY(0);
    end.setX(0);
    end.setY(0);
  }
  public Line(Point startPoint,Point endPoint)
  {
    start=startPoint;
    end=endPoint;
  }
  public double length()
  {
    return start.distance(end);
  }
  public double slope()
  {
    if(start.getX()==end.getX())
    {
      return 0.0;
    }
    return (start.getY()-end.getY())/(start.getX()-end.getX());
  }
  public String toString()
  {
    String points="[("+start.getX()+","+start.getY()+"),("+end.getX()+","+end.getY()+")]";
    return points;
  }
  public void translate(int dx,int dy)
  {
    start.translate(dx,dy);
    end.translate(dx,dy);
  }
}

