package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestIntegration_AtoB_withCStub {

    @Test
    public void testIntegration() {

        CStub cStub = new CStub();   // יצירת סטאב ל־C
        B realB = new B(cStub);      // B מקבל את CStub
        A realA = new A(realB);      // A מקבל את B

        String result = realA.process("");  // הפעלת כל השרשרת

        assertEquals("HE", result);         // בדיקת התוצאה הסופית
    }
}