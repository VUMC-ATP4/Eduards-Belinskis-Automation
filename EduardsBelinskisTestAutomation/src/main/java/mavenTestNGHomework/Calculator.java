package mavenTestNGHomework;

import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calculator {

    int result;
    //Method for addition
    public int add(int num1, int num2){
        result = num1+num2;
        return result;
    }
    //Method for subtraction
    public int substract(int num1, int num2){
        result = num1-num2;
        return result;
    }
    //Method for multiplication
    public int multiply(int num1, int num2){
        result = num1*num2;
        return result;
    }
    //Method for division
    public float divide(int num1, int num2){
        result = num1/num2;
        return result;
    }


}
