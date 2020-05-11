import java.util.Scanner;

public class L4_Java {

    public static void countnum(){
        for (int i=1; i<=5; i=i+1){
            System.out.println(i);
        }
    }
    public static void evennum(){
        for (int i=10;i>=1;i=i=i-1){
            System.out.println(i);
        }
    }
    public static void sum1(){
        int result=0;
        for (int i=1;i<=10;i++){
            result=result+i;
        }
        System.out.println(result);
    }
    public static int sum(int fromnumber,int tonumber){
        int result=0;
        for (int i=fromnumber;i<=tonumber;i++){
            result+=i;

        }
        return result;
    }
    public static void multiplicationTable(int n){
        for (int i = 1; i <=12 ; i++) {
            System.out.printf("%d x %d = %d\n",n,i,n*i);

        }
    }
    public static void printchar(){
        for (int c = 1;c <= 100;c++){
            System.out.printf("%c",(char)c);
        }
    }
    public static void main(String[]args){
        printchar();



    }

}
