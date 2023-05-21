import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IsLeapYear {

    // Подготовка данных.
    static String isLeapYear = " - этот год високосный!";
    static String isNotALeapYear = " - этот год НЕ високосный!";
    static String gratitude = "Спасибо, что воспользовались нашим калькулятором високосных годов!";
    static String preamble = "Введите год для проверки: ";


    // Метод вычисления високосного года.
    public static boolean isLeapYear(int year) throws InterruptedException {
        if (year <= 0) {
            System.out.println("Вы ввели некорректный год!");
        } else if (year % 400 == 0 || (year % 4 == 0) && !(year % 100 == 0)) {
            System.out.println(year + isLeapYear);
            Thread.sleep(2000);
            System.out.println(gratitude);
            return true;
        } else {
            System.out.println(year + isNotALeapYear);
            Thread.sleep(2000);
            System.out.println(gratitude);
            return false;
        }
        return false;
    }

    // Метод считывания года из консоли.
    public static int readInt() throws Exception {
        System.out.println(preamble);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(console.readLine());
        return x;
    }
}