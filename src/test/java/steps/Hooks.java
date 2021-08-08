package steps;

import org.junit.After;
import org.junit.Before;
import utils.CommonMethods;

public class Hooks extends CommonMethods {

    @Before
    public void start(){
        setUp();
    }

    @After
    public void end(){
        tearDown();
    }
}
