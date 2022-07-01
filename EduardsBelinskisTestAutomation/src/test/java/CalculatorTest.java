import classroomSix.Calculator;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeMethod

    public void pirmsTesta(){

        System.out.println("Tests ir sācies!");
        calculator = new Calculator();

    }

    @Test

    public void testAdd(){
        System.out.println("Saskaitisana");
        int actualResult = calculator.add(13,25);
        int expectedResult = 38;
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test

    public void testSubtract(){

        System.out.println("Atņemšana");
        int actualResult = calculator.substract(25, 13);
        int expectedResult = 12;
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test

    public void testMultiply(){

        System.out.println("Reizināšana");
        int actualResult = calculator.multiply(3, 5);
        int expectedResult = 15;
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test

    public void testDivide(){

//        System.out.println("Dalīšana");
//        int actualResult = calculator.divide(8, 2);
//        int expectedResult = 4;
//        Assert.assertEquals(actualResult, expectedResult);

    }

}
