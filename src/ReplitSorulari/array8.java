package ReplitSorulari;

import java.util.Arrays;

public class array8 {
    public static void main(String[] args) {
        //Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
        //
        //Array: [1232,2345,5467,678,3454,2312,3451]
        int [] arr= {1232,2345,5467,678,3454,2312,3451};
        Arrays.sort(arr);

        System.out.println(arr[5]);
    }
}
