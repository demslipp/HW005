import javax.imageio.stream.ImageOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Optional.ofNullable;

public class Main{


    public static void main(String[] args){
        Employee employee1=new Employee(40000, "Ivan");
        Employee employee2=new Employee(50000, "Fedor");
        Employee employee3=new Employee(120000, "Artyom");
        Employee employee4=new Employee(45000, "Petya");
        Employee employee5=new Employee(65000, "Borus");

        Employee[] array=new Employee[]{employee1, employee2, employee3, employee4, employee5};
        AverageSalaryCounter averageSalaryCounter=new AverageSalaryCounter();

        System.out.println(averageSalaryCounter.average(array));
        System.out.println(ofNullable(averageSalaryCounter.largest(array)).map(e -> ((Employee) (e)).getName()).orElse("Empty"));

        SuperClasses superClasses=new SuperClasses();
        superClasses.FindSuperClasses(String.class);
        superClasses.FindSuperClasses(Scanner.class);
        superClasses.FindSuperClasses(ImageOutputStream.class);

        IntSequence.of(1, 2, 3, 4, 8, 56, 45, 3, 43);
        //IntSequence.constant().accept(1);

        MySort mySort = new MySort();
        ArrayList<String> myStrings = new ArrayList<>();
        myStrings.add("abc");
        myStrings.add("xyz");
        myStrings.add("klm");
        myStrings.add("ijk");
        myStrings.add("jkl");
        myStrings.add("bcd");
        myStrings.add("cde");
        mySort.luckySort(myStrings, Comparator.naturalOrder());
    }
}
