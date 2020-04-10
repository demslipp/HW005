public class Employee implements Measurable{

    private final String name;
    private double salary;

    public Employee(double salary, String name){
        this.salary=salary;
        this.name=name;
    }

    @Override
    public double getMeasure(){
        return this.salary;
    }


    public String getName(){
        return this.name;
    }
}




