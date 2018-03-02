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
        androidOperator.input(Input._1, Input._4, Input._7, Input._3, Input._6, Input._9);
        androidOperator.click(Key.POWER);
    }

}
