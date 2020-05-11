public class L3_Java {
//    public static String stromType(int speed){
//        String stromname="";
//        if (speed<63){
//            stromname="Depression";
//        }else if (speed>=63&&speed<118){
//            stromname="Tropical storm";
//        }else{
//            stromname="Typhoon";
//        }
//        return stromname;
//    }
    public static String zodiac(int year){
        int z = year%12;
        String s = "";
        switch (z){
            case 0:
                s="มะเส็ง";
                break;
            case 11:
                s="มะโรง";
                break;
        }
        return s;
    }

    public static String testSwitch(String s){
        String result="";
        switch(s){
            case "one":
                result="หนึ่ง";
                break;
            case "two":
                result="สอง";
                break;
            default:
                result="อื่นๆ";

        }
        return result;
    }

    public static void main(String[]args){
        System.out.println(testSwitch("one"));

    }
}
