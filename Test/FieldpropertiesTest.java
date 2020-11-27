package Test;

import Game.Model.Fieldproperties;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FieldpropertiesTest {


    @Test
    void calculateValue() {
        Fieldproperties fields = new Fieldproperties();
        System.out.println(fields.calculateValue(0));
    }
    @org.junit.jupiter.api.Test
    void fieldsWithSameColor(){
        Fieldproperties fields = new Fieldproperties();
        for (int i=0;i<fields.getOwnedFields().length;i++) {
            if (i%3!=0) {
                fields.setOwnedFields(fields.getOwnedFields(), i, 1);
            }
        }
        fields.Fieldproperties(4);
        int expected = 2;
        System.out.println(Arrays.toString(fields.getOwnedFields()));
        assertEquals(expected,fields.calculateValue(4));
        System.out.println(fields.getValue());
    }
}