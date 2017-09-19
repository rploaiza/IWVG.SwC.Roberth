package es.upm.miw.iwvg.swc.roberth;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User ust;
    
    @Before
    public void before() {
        ust = new User(6, "Roberth","Loaiza", 28341, "Rober@hotmail.com"); //valores a calcular
    }

    @Test
    public void testUser() {
        assertEquals(6, ust.getNumber());
        assertEquals("Roberth", ust.getName());
        assertEquals("Loaiza", ust.getFamilyName());
        assertEquals(28341, ust.getPostalCode());
        assertEquals("Rober@hotmail.com", ust.getEmail());
    }

    @Test
    public void testFullName() {
        assertEquals("Roberth Loaiza",ust.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("R.", ust.initials());
    }
    
    @Test
    public void testGetPostalCode() {
        assertEquals(28341, ust.getPostalCode());
    }
    
    @Test
    public void testGetEmail() {
        assertEquals("Rober@hotmail.com", ust.getEmail());
    }
    

}
