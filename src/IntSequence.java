import java.util.function.Consumer;

public class IntSequence{
    private int[] array;

    private IntSequence(int[] array){
        this.array=array;
    }

    public static IntSequence of(int... asd){
        return new IntSequence(asd);
    }

    public static Consumer<Integer> constant(){
        return i -> {
            for (; ; ){
                System.out.println(i);
            }

        };
    }
}
