import com.sun.deploy.util.ArrayUtil;

import javax.xml.stream.events.Characters;
import java.util.*;

/**
 * Demo1
 *
 * @author Hekang Xu
 * @since data
 **/
public class Demo1 {
    public static void main(String[] args){
        Scanner sc=new  Scanner(System.in);
        String[] array="acdf".split("");
        List<String> a= Arrays.asList(array);
        Collections.sort(a);
        System.out.print(a.toString());
        new ArrayList<>().sort(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        int n=sc.nextInt();
        String name = sc.nextLine();
        sc.close();
        char[] test="hahaha s".toCharArray();
        System.out.print("hello world");
    }
}
