package ReplitSorulari;

public class for_while3 {
    public static void main(String[] args) {
        //Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        //Input :
        //String str=“Javaisalsoeasy”
        //Output: a s
        String str="Javaisalsoeasy";
        String bakilacak="";
        String output="";
           for (int i = 0; i <str.length() ; i++) {
            bakilacak=str.substring(i,i+1);
            for (int j = i+1; j <str.length() ; j++) {
                if ((bakilacak.equals(str.substring(j,j+1)))&&!output.contains(bakilacak)){
                    output+=bakilacak+" ";
                }
            }

        }
        System.out.println(output);

    }
}
