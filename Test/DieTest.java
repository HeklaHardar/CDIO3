package Test;
import Game.Model.Die;
import org.junit.Test;
import static org.junit.Assert.*;


import static org.hamcrest.MatcherAssert.assertThat;

public class DieTest {

    int TestRounds = 100000;
    int[] values =new int[6];

    @Test
    public void getDieTest(){

        Die die = new Die(6);

        for (int i = TestRounds; i>=0; i--){
            die.roll();
            if(die.getValue()==1)
                values[0] += 1;
            if(die.getValue()==2)
                values[1] += 1;
            if(die.getValue()==3)
                values[2] += 1;
            if(die.getValue()==4)
                values[3] += 1;
            if(die.getValue()==5)
                values[4] += 1;
            if(die.getValue()==6)
                values[5] += 1;
        }

        for (int i = 10000; i > 0; --i) {
            die.roll();
            assertTrue(String.valueOf(true), die.getValue() >= 1);
            assertTrue(String.valueOf(true), die.getValue() <= 6);
        }

        //Tests each value in the array to see if it's close to TestRounds divided by 6
        for (int i:values) {

            assertEquals(TestRounds/6,i,400);

        }

    }
}