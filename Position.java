
/**
 * A class representing a two dimensional position
 */
public class Position
{
    /** The x-position of this position class **/
    double xPos;

    /** The y-position of this position class **/
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
