import challenge.Challenge;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertTrue;
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
public class TesthelloName extends TestCase{

    

    private static void assertTrue(String helloName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Challenge challenge;
    public void test(){ 
        challenge = new Challenge();
    }
    public static void helloName(){
        assertTrue(Challenge.helloName("Juan"));
    }
    
}