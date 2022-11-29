package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {
    @Test
    void twoIsEven(){

        var add = new Addition();
        boolean result = add.isEven(2);
        Assertions.assertEquals(true,result);
    }
    @Test
    void threeIsNotEven(){
        var add = new Addition();
        boolean result = add.isEven(3);
        Assertions.assertEquals(false,result);
    }
    @Test
    void fiveIsNotEven(){
        var add = new Addition();
        boolean result = add.isEven(5);
        Assertions.assertEquals(false,result);
    }
    @Test
    void notANUmber(){
        var add = new Addition();
        boolean result = add.isEven(5);
        Assertions.assertEquals(false,result);
    }
    @ParameterizedTest
    @ValueSource(ints = {0,2,4,6,8,10,12,14,16,18})
    void isEven(int ints){
        var add = new Addition();
        assertTrue(add.isEven(ints));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,3,5,7,9,11,13,15,17,19})
    void isNotEven(int ints){
        var add = new Addition();
        assertFalse(add.isEven(ints));
    }
    @ParameterizedTest
    @ValueSource(ints = {-2,-5,-4,-1})
    void lessThanZeroIsNotEven(int ints){
        var add = new Addition();
        assertThrows(IllegalArgumentException.class,()->{
            add.isEven(ints);
        });
    }

}