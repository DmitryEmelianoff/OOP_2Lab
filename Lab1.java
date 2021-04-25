package lab2zadanie1;
import java.util.Scanner;
public class Lab1
{
    public static void main(String[]args)
    {
        double x,y,z;
        Scanner inn=new Scanner(System.in);
        x=inn.nextDouble();
        y=inn.nextDouble();
        z=inn.nextDouble();
        Point3d a=new Point3d(x,y,z);
        x=inn.nextDouble();
        y=inn.nextDouble();
        z=inn.nextDouble();
        Point3d b=new Point3d(x,y,z);
        x=inn.nextDouble();
        y=inn.nextDouble();
        z=inn.nextDouble();
        Point3d c=new Point3d(x,y,z);
        if(a.equals(b)||b.equals(c)||a.equals(c))
        {
            System.out.println("Incorrect points");
            return;
        }
        System.out.println(computeArea(a,b,c));
    }
    public static double computeArea(Point3d a,Point3d b,Point3d c)
    {
        double a1=a.distanceTo(b);
        double b1=a.distanceTo(c);
        double c1=b.distanceTo(c);
        double p=(a1+b1+c1)/2;
        double s=Math.sqrt(p*(p-a1)*(p-b1)*(p-c1));
        return s;
    }
}