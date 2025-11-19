package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class AUnitTest {
    @Test
    public void testCWithStub() {
        // יוצרים סטאב של D
        BStub stub = new BStub();
        // יוצרים את C עם הסטאב
        A a = new A(stub);

        // קוראים ל־C — לא לסטאב!
        String result = a.process("");

        // מאמתים את הפלט
        assertEquals("HX", result);
    }
}

