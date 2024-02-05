import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BikeAppTest {


        @Test
        public void testThatBikeCanBeTurnedOn(){
            BikeApp myBikeApp = new BikeApp();
            assertFalse(myBikeApp.itIsOff());
            myBikeApp.turnBikeOn();
            assertTrue(myBikeApp.itIsOff());
        }

        @Test
        public void testThatBikeCanBeTurnedOff(){
            BikeApp myBikeApp = new BikeApp();
            myBikeApp.turnBikeOn();
            myBikeApp.turnBikeOff();
            assertFalse(myBikeApp.itIsOff());
        }

    @Test
    public void testThatBikeCannotAccelerateWhenBikeIsOff(){
        BikeApp myBikeApp = new BikeApp();
        myBikeApp.itIsOff();
        assertEquals(0, myBikeApp.accelerate());

    }

    @Test
        public void testThatBikeCanAccelerate(){
            BikeApp myBikeApp = new BikeApp();
            myBikeApp.turnBikeOn();
            myBikeApp.setGear(1);
            myBikeApp.setSpeed(15);
            assertEquals(16,myBikeApp.accelerate());
            myBikeApp.setGear(2);
            myBikeApp.setSpeed(24);
            assertEquals(26, myBikeApp.accelerate());
            myBikeApp.setGear(3);
            myBikeApp.setSpeed(35);
            assertEquals(38, myBikeApp.accelerate());
            myBikeApp.setGear(4);
            myBikeApp.setSpeed(44);
            assertEquals(48, myBikeApp.accelerate());

        }

    @Test
    public void testThatBikeCannotDecelerateWhenBikeIsOff(){
        BikeApp myBikeApp = new BikeApp();
        myBikeApp.itIsOff();
        assertEquals(0, myBikeApp.decelerate());

    }

    @Test
    public void testThatBikeCanDecelerate(){BikeApp myBikeApp = new BikeApp();
        myBikeApp.turnBikeOn();
        myBikeApp.setGear(1);
        myBikeApp.setSpeed(15);
        assertEquals(14,myBikeApp.decelerate());
        myBikeApp.setGear(2);
        myBikeApp.setSpeed(24);
        assertEquals(22, myBikeApp.decelerate());
        myBikeApp.setGear(3);
        myBikeApp.setSpeed(35);
        assertEquals(32, myBikeApp.decelerate());
        myBikeApp.setGear(4);
        myBikeApp.setSpeed(44);
        assertEquals(40, myBikeApp.decelerate());

    }

}
