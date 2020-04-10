import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MySort{
    void luckySort(ArrayList<String> strings, Comparator<String> comp){
        ArrayList<String> s=new ArrayList<>(strings);
        s.sort(comp);
        boolean flag=false;
        while(!s.equals(strings)) {
            flag=true;
            Collections.shuffle(strings);
            System.out.println(strings);
        }
        if(!flag){
            System.out.println("Result: "+strings);
        }
    }
}
