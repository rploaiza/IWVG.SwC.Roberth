package es.upm.miw.iwvg.swc.roberth;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User ust;
    
    @Before
    public void before() {
        ust = new User(6, "Roberth","Loaiza"); //valores a calcular
    }

    @Test
    public void testUser() {
        assertEquals(6, ust.getNumber());
        assertEquals("Roberth", ust.getName());
        assertEquals("Loaiza", ust.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Roberth Loaiza",ust.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("R.", ust.initials());
    }

}
