package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class DUintTest {
    @Test
    public void testEWithStub() {
        // יוצרים סטאב של D
        EStub stub = new EStub();
        // יוצרים את C עם הסטאב
        D d = new D(stub);

        // קוראים ל־C — לא לסטאב!
        String result = d.process("HEL");

        // מאמתים את הפלט
        assertEquals("HELLX", result);
    }
}