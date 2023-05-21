import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IsLeapYearTest {

    private final int year;
    private final boolean result;

    public IsLeapYearTest(int year, boolean result) {
        this.year = year;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getYearData() {
        return new Object[][] {
                {988, true},
                {2017, false},
                {2018, false},
                {2019, false},
                {2020, true},
                {2030, false},
                {1983, false},
                {0, false},
                {-1950, false},
        };
    }

    @Test
    public void checkIsALeapYear() throws InterruptedException {
        IsLeapYear isLeapYear = new IsLeapYear();
        boolean actual = isLeapYear.isLeapYear(year);
        assertEquals("Error", result, actual);
    }
}