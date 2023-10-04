package seminars.third.hw;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MainHWTest {
    private final MainHW mainHW = new MainHW();
    //Передаем в метод 10, оно четное, результат true.
    @Test
    public void testEvenOddNumber_evenNumber() {
        // arrange 
        int number = 10;
        // act
        boolean resulte = numberUtils.evenOddNumber(number);
        //assert
        Assertions.assertTrue(resulte);

    }
    //Передаем в метод 15, оно нечетное, результат афдыу.
    @Test
    public void testEvenOddNumber_oddNumber(){
        //arrange
        int number = 15;

        //act
        boolean resulte = numberUtils.evenOddNumber(number);

        // assert
        Assertions.assertFalse(resulte);
    }
    //Передаем в метод 50, которое попадает в интервал, ожидаем true
    @Test
    public void testNumberInIterval_numberInRange() {
        //arrange
        int number = 50;

        //act
        boolean resulte = numberUtils.numberInIterval(number);

        //assert
        Assertions.assertTrue(resulte);
    }
    //Передаем в метод 110, которое не попадает в интервал, ожидаем false.
    @Test
    public void testNumberInIterval_numberOutOfRange() {
        //arrange
        int number = 110;

        //act
        boolean resulte = numberUtils.numberInIterval(number);

        //assert
        Assertions.assertFalse(resulte);
    }

}