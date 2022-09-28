package ReplitSorulari;

public class for_while4 {
    public static void main(String[] args) {
        //Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
        //Input : 6
        //Output: 6!=65432*1=720
        int input=6;
        int output=1;
        for (int i = input; i >=1 ; i--) {
            output*=i;

        }

        System.out.println("6!=6*5*4*3*2*1="+output);
    }
}
