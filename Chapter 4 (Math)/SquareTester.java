public class SquareTester 
{
    public static void main (String[] args)
    {
        Square s1 = new Square();
        System.out.println(s1);

        Square s2 = new Square(4.0);
        System.out.println(s2);

        System.out.println(s2.squareArea());
        System.out.println(s2.squarePerimeter());
        System.out.println(s2.squareDiagonal());
    }
}