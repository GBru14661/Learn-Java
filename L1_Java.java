import java.util.Scanner;

public class L1_Java {

    public static int rectangle(int width,int height){
        return width*height;
    }
    public static float square(int width){
//        return width*width;
        return rectangle(width,width);
    }
    public static double triangle(double width,double height){
        return 0.5*width*height;
    }
    public static void main(String[] args) {
        System.out.println(triangle(3,4));

        float vatRate=0.07f;
        double d1=1.0/3.0;
        float f1=1.0f/3.0f;
        System.out.println(d1);
        System.out.println(f1);
        /*System.out.println(3*5);
        System.out.println("area"+"="+3*5);

        int width;
        int height;
        int area;
//        width=3;
//        height=5;
//        area=width*height;
//        System.out.println("area = "+area);
        Scanner in=new Scanner(System.in);
        System.out.print("enter width : ");
        width=in.nextInt();
   //     System.out.println("print width ="+width);
        System.out.print("Enter height : ");
        height=in.nextInt();
//        area=width*height;
        area=rectangle(width,height);
        System.out.println("area ("+width+"x"+height+")="+area);
        System.out.println(square(5));*/
    }
}