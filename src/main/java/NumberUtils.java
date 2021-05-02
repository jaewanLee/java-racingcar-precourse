import java.util.Random;

public class NumberUtils {
    private static final Number min=new Number(0);
    private static final Number max=new Number(9);
    static public int getRandom(){
        return new Random().nextInt(max.getValue()-min.getValue()+1)+min.getValue();
    }
}
