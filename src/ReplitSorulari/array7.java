package ReplitSorulari;

import java.util.ArrayList;

public class array7 {
//Array i ARRAYLIST e çeviren Java Kodunu yazınız.
//
//Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
public static void main(String[] args) {
    String[] arr={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
    ArrayList<String> list=new ArrayList<String>();
    for (String each:arr) {
              list.add(each);
    }
    System.out.println(list);
}
}
