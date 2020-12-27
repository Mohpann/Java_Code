public class Square
{

    private double squareLength;

    public Square()
    {
        squareLength = 0;
    }

    public Square (double sLength)
    {
        squareLength = sLength;
    }

    public double squareArea()
    {
        return squareLength * squareLength;
    }

    public double squarePerimeter()
    {
        return squareLength + squareLength + squareLength + squareLength;
    }

    public double squareDiagonal()
    {
        return squareLength * Math.sqrt(2);
    }

    public String toString()
    {
        return "squareLength = " + squareLength;
    }
}