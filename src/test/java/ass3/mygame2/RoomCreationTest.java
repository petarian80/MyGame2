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
public class RoomCreationTest extends TestCase {
    
    public RoomCreationTest(String testName) {
        super(testName);
    }


    /**
     * Test of getRoom method, of class RoomCreation.
     */
    public void testGetRoom() {
        System.out.println("getRoom");
        String stringRoom = "";
        RoomCreation instance = new RoomCreation();
        Room expResult = null;
        Room result = instance.getRoom(stringRoom);

        System.out.println(result.getName());
        // (expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    private void assertEquals(Room expResult, Room result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void fail(String the_test_case_is_a_prototype) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
