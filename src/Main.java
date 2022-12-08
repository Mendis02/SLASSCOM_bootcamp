import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the roman number : ");
        String rNum = input.nextLine();

        Main ob = new Main();
        System.out.println(ob.romanToInt(rNum));
    }
    public int romanToInt(String s) {
        HashMap<Character, Integer> pp= new HashMap<Character, Integer>();
        String x= "IVXLCDM";
        pp.put(x.charAt(0),1);
        pp.put(x.charAt(1),5);
        pp.put(x.charAt(2),10);
        pp.put(x.charAt(3),50);
        pp.put(x.charAt(4),100);
        pp.put(x.charAt(5),500);
        pp.put(x.charAt(6),1000);

        int j=s.length();
        int sum =pp.get(s.charAt(j-1));
        j--;
        while (j > 0) {
            if (pp.get(s.charAt(j)) <= pp.get(s.charAt(j - 1))) {
                sum = pp.get(s.charAt(j - 1)) + sum;

            } else {
                sum = sum - pp.get(s.charAt(j - 1));
            }
            j--;
        }
        return sum;
    }
}