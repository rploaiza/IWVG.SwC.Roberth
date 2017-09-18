package es.upm.miw.iwvg.swc.roberth;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction fr;
    
    @Before
    public void before() {
        fr = new Fraction(6, 3); //valores a calcular
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(6, fr.getNumerator());
        assertEquals(3, fr.getDenominator());
    }

    @Test
    public void testFraction() {
        fr = new Fraction();
        assertEquals(1, fr.getNumerator());
        assertEquals(1, fr.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(2,fr.decimal(),10e-5 );//resultado de la fracción, metodo, formato
    }
    @Test
    public void testMultiplicacionPorDos() {
        assertEquals(6,fr.multiplicarPorDos().getDenominator() );
        assertEquals(12,fr.multiplicarPorDos().getNumerator() );
    }

}
