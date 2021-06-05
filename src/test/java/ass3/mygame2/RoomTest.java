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
public class RoomTest extends TestCase {
    
    public RoomTest(String testName) {
        super(testName);
    }
    
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of setExit method, of class Room.
     */
    public void testSetExit() {
        System.out.println("setExit");
        String direction = "";
        Room neighbor = null;
        Room instance = null;
        instance.setExit(direction, neighbor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShortDescription method, of class Room.
     */
    public void testGetShortDescription() {
        System.out.println("getShortDescription");
        Room instance = null;
        String expResult = "";
        String result = instance.getShortDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLongDescription method, of class Room.
     */
    public void testGetLongDescription() {
        System.out.println("getLongDescription");
        Room instance = null;
        String expResult = "";
        String result = instance.getLongDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllItems method, of class Room.
     */
    public void testGetAllItems() {
        System.out.println("getAllItems");
        Room instance = null;
        String expResult = "";
        String result = instance.getAllItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExit method, of class Room.
     */
    public void testGetExit() {
        System.out.println("getExit");
        String direction = "";
        Room instance = null;
        Room expResult = null;
        Room result = instance.getExit(direction);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomItem method, of class Room.
     */
    public void testGetRoomItem() {
        System.out.println("getRoomItem");
        String stringItem = "";
        Room instance = null;
        Item expResult = null;
        Item result = instance.getRoomItem(stringItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItemInRoom method, of class Room.
     */
    public void testAddItemInRoom() {
        System.out.println("addItemInRoom");
        Item item = null;
        Room instance = null;
        instance.addItemInRoom(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeItemInRoom method, of class Room.
     */
    public void testRemoveItemInRoom() {
        System.out.println("removeItemInRoom");
        Item item = null;
        Room instance = null;
        instance.removeItemInRoom(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHashMapItemInRoom method, of class Room.
     */
    public void testAddHashMapItemInRoom() {
        System.out.println("addHashMapItemInRoom");
        Room room = null;
        Item item = null;
        Room instance = null;
        instance.addHashMapItemInRoom(room, item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLockedStatus method, of class Room.
     */
    public void testGetLockedStatus() {
        System.out.println("getLockedStatus");
        Room instance = null;
        boolean expResult = false;
        boolean result = instance.getLockedStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLockedStatus method, of class Room.
     */
    public void testSetLockedStatus() {
        System.out.println("setLockedStatus");
        boolean newStatus = false;
        Room instance = null;
        instance.setLockedStatus(newStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Room.
     */
    public void testGetName() {
        System.out.println("getName");
        Room instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private void fail(String the_test_case_is_a_prototype) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(String expResult, String result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(Room expResult, Room result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
