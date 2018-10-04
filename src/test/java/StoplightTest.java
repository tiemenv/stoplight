import org.junit.Test;

public class StoplightTest {

    @Test
    public void stoplightTest(){
        Stoplight stoplight = new Stoplight();
        stoplight.toggleState();
        System.out.println(stoplight);
        stoplight.toggleState();
        System.out.println(stoplight);
        stoplight.toggleState();
        stoplight.toggleColor();
        System.out.println(stoplight);


        stoplight.toggleColor();
        System.out.println(stoplight);
        stoplight.toggleColor();
        System.out.println(stoplight);
        stoplight.toggleColor();
        System.out.println(stoplight);

        //should fail
        stoplight.toggleState();
        stoplight.toggleColor();
    }
}
