import org.junit.Test;

import org.junit.jupiter.api.DisplayName;

import java.time.LocalDate;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("2018-01-02")
    public void testFintXextDay() {
        LocalDate dayInput = LocalDate.parse("2018-01-01");
        LocalDate dayOutput = dayInput.plusDays(1);
        LocalDate result = LocalDate.parse("2018-01-02");

        dayOutput.isAfter(dayInput);
        dayOutput.equals(result);
    }

    @Test
    @DisplayName("2018-02-01")
    public void testFintXextDay1() {
        LocalDate dayInput = LocalDate.parse("2018-01-31");
        LocalDate dayOutput = dayInput.plusDays(1);
        LocalDate result = LocalDate.parse("2018-02-01");

        dayOutput.isAfter(dayInput);
        dayOutput.equals(result);
    }

    @Test
    @DisplayName("2018-05-01")
    public void testFintXextDay2() {
        LocalDate dayInput = LocalDate.parse("2018-04-30");
        LocalDate dayOutput = dayInput.plusDays(1);
        LocalDate result = LocalDate.parse("2018-05-01");

        dayOutput.isAfter(dayInput);
        dayOutput.equals(result);
    }

    @Test
    @DisplayName("2018-03-01")
    public void testFintXextDay3() {
        LocalDate dayInput = LocalDate.parse("2018-02-28");
        LocalDate dayOutput = dayInput.plusDays(1);
        LocalDate result = LocalDate.parse("2018-03-01");

        dayOutput.isAfter(dayInput);
        dayOutput.equals(result);
    }

    @Test
    @DisplayName("2020-03-01")
    public void testFintXextDay4() {
        LocalDate dayInput = LocalDate.parse("2020-02-29");
        LocalDate dayOutput = dayInput.plusDays(1);
        LocalDate result = LocalDate.parse("2020-03-01");

        dayOutput.isAfter(dayInput);
        dayOutput.equals(result);
    }

    @Test
    @DisplayName("2019-01-01")
    public void testFintXextDay5() {
        LocalDate dayInput = LocalDate.parse("2018-12-31");
        LocalDate dayOutput = dayInput.plusDays(1);
        LocalDate result = LocalDate.parse("2019-01-01");

        dayOutput.isAfter(dayInput);
        dayOutput.equals(result);
    }


}
