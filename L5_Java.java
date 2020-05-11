public class L5_Java {

    public static void demo(){
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
    }
    public static void demo2(){
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while  (i<=10);
    }
    public static int saving(float deposit,float rate,float targetamount){
        int year=1;
        float balance = deposit*(1+rate);
        while (balance<=targetamount){
            balance=balance*(1+rate);
            year++;
        }
        System.out.println(year);
        return year;
    }

    public static void main(String[]args){
        int n=saving(100.0f,.05f,150.0f);
        System.out.println(n);
    }

}
