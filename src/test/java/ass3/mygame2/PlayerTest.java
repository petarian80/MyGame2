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
public class PlayerTest extends TestCase {
    
    public PlayerTest(String testName) {
        super(testName);
    }
    
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of dropAllItems method, of class Player.
     */
    public void testDropAllItems() {
        System.out.println("dropAllItems");
        Player instance = new Player();
        instance.dropAllItems();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItemInventory method, of class Player.
     */
    public void testAddItemInventory() {
        System.out.println("addItemInventory");
        Item item = null;
        Player instance = new Player();
        instance.addItemInventory(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeItemInventory method, of class Player.
     */
    public void testRemoveItemInventory() {
        System.out.println("removeItemInventory");
        Item item = null;
        Player instance = new Player();
        instance.removeItemInventory(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerItem method, of class Player.
     */
    public void testGetPlayerItem() {
        System.out.println("getPlayerItem");
        String stringItem = "";
        Player instance = new Player();
        Item expResult = null;
        Item result = instance.getPlayerItem(stringItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printAllInventory method, of class Player.
     */
    public void testPrintAllInventory() {
        System.out.println("printAllInventory");
        Player instance = new Player();
        String expResult = "";
        String result = instance.printAllInventory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private void fail(String the_test_case_is_a_prototype) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
