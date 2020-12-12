import challenge.Challenge;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Uriel
 */
public class TestPower extends TestCase{

    private static void assertTrue(int power) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Challenge challenge;
    public void test(){ 
        challenge = new Challenge();
    }
    public static void power(){
        assertTrue(Challenge.power(5, 2));
    }
    
}
