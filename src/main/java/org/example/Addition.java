package org.example;

public class Addition {
    public boolean isEven(int number1) {
        if(number1<0) throw new IllegalArgumentException("Invalid number");
        else if (number1 % 2 == 0) return true;
            return false;
    }
}
