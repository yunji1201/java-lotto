package domain;

public class Subtraction implements Calculator{

    @Override
    public int calculator(int num1, int num2) {
        return num1 - num2;
    }
}