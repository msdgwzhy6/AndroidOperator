import com.hjx.util.phone.*;
import org.junit.Test;

public class OperatorTest {

    @Test
    public void name() throws Exception {
        Execute execute = new Execute("adb");
        AndroidOperator androidOperator = new AndroidOperator();
        androidOperator.setExecute(execute);
        //手机解锁
        androidOperator.click(Key.POWER);
        androidOperator.slide(new Point(525, 1500), new Point(525, 300), 500);
        androidOperator.input(Input._0, Input._5, Input._2, Input._0);
        androidOperator.click(Key.HOME);
        androidOperator.slide(new Point(1000, 700), new Point(100, 700), 500);
        androidOperator.click(Key.POWER);
//        androidOperator.click(Key.POWER);
    }

}
