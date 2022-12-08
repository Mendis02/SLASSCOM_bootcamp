//import java.util.HashMap;
//import java.util.Scanner;
//public class Main1 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the roman number : ");
//        String rNum = input.nextLine();
//
//        Main1 ob = new Main1();
//        ob.romanToInt(rNum);
//    }
//
//    //     IV=4     IX=9
////     XL=40    XC=90
////     CD=400   CM=900
////    MCMXCIV
//
//    public int romanToInt(String s) {
//        HashMap<String, Integer> pp= new HashMap<String, Integer>();
//        pp.put("I",1);
//        pp.put("V",5);
//        pp.put("X",10);
//        pp.put("L",50);
//        pp.put("C",100);
//        pp.put("D",500);
//        pp.put("M",1000);
//
//        int j=s.length();
//        int sum =pp.get(s.charAt(j-1));
//        j--;
//        while (j > 0) {
//            if (pp.get(s.charAt(j)) <= pp.get(s.charAt(j - 1))) {
//                sum = pp.get(s.charAt(j - 1)) + sum;
//
//            } else {
//                sum = sum - pp.get(s.charAt(j - 1));
//            }
//            j--;
//        }
//
//        return sum;
//    }
//}
