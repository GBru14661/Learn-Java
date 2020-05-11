import java.util.Scanner;

public class L7_Java {

    public static void main(String[]args){
        int unit,midtermsc,finalsc,total;
        Scanner in = new Scanner(System.in);
        System.out.print("Input Unit Score /50: ");
        unit=in.nextInt();
        System.out.print("Input Midterm Score /20: ");
        midtermsc=in.nextInt();
        System.out.print("Input Final Score /30: ");
        finalsc=in.nextInt();
        total=unit+midtermsc+finalsc;
        if (total>=80){
            System.out.println("Grade 4");
        }else if (total>=75){
            System.out.println("Grade 3.5");
        }else if (total>=70){
            System.out.println("Grade 3");
        }else if (total>=65){
            System.out.println("Grade 2.5");
        }else if (total>=60){
            System.out.println("Grade 2");
        }else if (total>=55){
            System.out.println("Grade 1.5");
        }else if (total>=50){
            System.out.println("Grade 1");
        }else{
            System.out.println("Grade 0");
        }
    }
}
