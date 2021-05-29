/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3.mygame2;

import junit.framework.TestCase;

/**
 *
 * @author 92322
 */
public class GameTest extends TestCase {
    
    public GameTest(String testName) {
        super(testName);
    }
    

    /**
     * Test of getCurrentRoom method, of class Game.
     */
    public void testGetCurrentRoom() {
        System.out.println("getCurrentRoom");
        Game instance = new Game();
        Room expResult = null;
        Room result = instance.getCurrentRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class Game.
     */
    public void testPlay() {
        System.out.println("play");
        Game instance = new Game();
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processCommand method, of class Game.
     */
    public void testProcessCommand() {
        System.out.println("processCommand");
        Command command = null;
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.processCommand(command);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private void assertEquals(Room expResult, Room result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void fail(String the_test_case_is_a_prototype) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(boolean expResult, boolean result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
