package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestIntegration_BtoC_withDStub {

    @Test
    public void testIntegration() {

        DStub dStub = new DStub();   // יצירת סטאב ל־D
        C realC = new C(dStub);      // C מקבל את DStub
        B realB = new B(realC);      // c מקבל את B

        String result = realB.process("H");  // הפעלת כל השרשרת

        assertEquals("HELX", result);         // בדיקת התוצאה הסופית
    }
}