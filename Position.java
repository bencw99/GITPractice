
/**
 * A class representing a two dimensional position
 */
public class Position
{
    double xPos;
    double yPos;

    public Position(double xPos, double yPos)
    {
	this.xPos = xPos;
	this,yPos = yPos;
    }

    public void setX(double xPos)
    {
	this.xPos = xPos;
    }

    public void setY(double yPos)
    {
	this.yPos = yPos;
    }

    public double getX()
    {
	return xPos;
    }

    public double getY()
    {
	return yPos;
    }
}
