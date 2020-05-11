public class L2_Java {

    public static boolean testscore(int scoreA,int scoreB){
        boolean result;
        if (scoreA>70||scoreB>50){
            result=true;
        }else{
            result=false;
        }
        return result;
    }

    public static void main(String[]args){
        System.out.println(testscore(75,0));
    }
//        //int score=50;
//        int score;
//        score=47;
//        if (score>=50){
//            System.out.println("Pass");
//        }else{
//            System.out.println("Not Pass");
//        }
//    }
}
