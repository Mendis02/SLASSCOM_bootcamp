import java.util.Arrays;


public class Challenge3 {
    public static void main(String[] args) {
        int [] array = {47, 84, 75, 21, 14, 14, 79};
        int l = array.length;
        int median;

        //sort the array
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                int temporary = 0;
                if (array[i] > array[j]) {
                    temporary = array[i];   //84
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        //find the median
        if (l%2 ==0){
            median = (array[l/2] + array[(l+1)/2])/2;
        }else{
            int x = Math.round(l/2);
            median = array[x];
        }
        System.out.println(median);

        //finding the highest number
        int highest = 0;
        for(int i = 0; i < l; i++){
            if (highest<array[i]){
                highest = array[i];
            }
        }
        System.out.println(highest);



    }
}
