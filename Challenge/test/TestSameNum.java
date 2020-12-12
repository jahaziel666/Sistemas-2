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
public class TestSameNum extends TestCase{

    private static void assertTrue(int isSameNum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Challenge challenge;
    public void test(){ 
        challenge = new Challenge();
    }
    public static void isSameNum(){
        assertTrue(Challenge.isSameNum(2, 2));
    }
    
}