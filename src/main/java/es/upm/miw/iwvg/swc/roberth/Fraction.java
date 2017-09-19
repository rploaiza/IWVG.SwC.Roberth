package es.upm.miw.iwvg.swc.roberth;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction multiplicarPorDos() {
        Fraction fraction = new Fraction(getNumerator() * 2, getDenominator() * 2);
        return fraction;
    }

    public Fraction add1() {
        return new Fraction(this.getNumerator() + 1, this.getDenominator() + 1);
    }

    public Fraction getInverse() {
        return new Fraction(this.getDenominator(), this.getNumerator());
    }
}
