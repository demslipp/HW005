import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class AverageSalaryCounter{
    public double average(Measurable[] objects){
        return Arrays.stream(objects).collect(Collectors.averagingDouble(Measurable::getMeasure));
    }

    public Measurable largest(Measurable[] objects){
        return (Arrays.stream(objects).max(Comparator.comparingDouble(Measurable::getMeasure)).get());
    }
}
