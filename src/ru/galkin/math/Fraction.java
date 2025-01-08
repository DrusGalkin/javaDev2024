package ru.galkin.math;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class Fraction extends Number implements Cloneable {
    public double denominator;
    double numerator;

    private Fraction(double d, double n) {
        if (d < 0) d *= -1;
        if (n < 0) n *= -1;

        this.denominator = d;
        this.numerator = n;
    }

    public static class Factory {
        private static Factory instance;
        private static final Map<String, Fraction> save = new HashMap<>();

        public static Factory getInstance(){
            if(instance == null) instance = new Factory();
            return instance;
        }

        public Fraction createFraction(double d, double n){
            String key = d + "/" + n;
            if(!save.containsKey(key)){
                save.put(key, new Fraction(d,n));
            }
            return save.get(key);
        }
    }

    public Fraction miltioly(Fraction two) {
        return new Fraction(denominator * two.denominator, numerator * two.numerator);
    }

    public Fraction minus(Fraction frac) {
        double commonDenominator = this.denominator * frac.denominator;
        double newNumerator = this.numerator * frac.denominator - frac.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }

    public Fraction minus(int num) {
        Fraction a = new Fraction(num, 1);
        double commonDenominator = this.denominator * a.denominator;
        double newNumerator = this.numerator * a.denominator - a.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }

    public Fraction getFraction() {
        return new Fraction(this.denominator, this.numerator);
    }

    public Fraction divide(Fraction frac) {
        return new Fraction(this.numerator * frac.denominator, this.denominator * frac.numerator);
    }

    public Fraction plus(Fraction frac) {
        double commonDenominator = this.denominator * frac.denominator;
        double newNumerator = this.numerator * frac.denominator + frac.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }

    public String toString() {
        return denominator + "/" + numerator;
    }

    @Override
    public int intValue() {
        return (int) (this.denominator /= this.numerator);
    }

    @Override
    public long longValue() {
        return (long) (this.denominator /= this.numerator);
    }

    @Override
    public float floatValue() {
        return (float) (this.denominator /= this.numerator);
    }

    @Override
    public double doubleValue() {
        return this.denominator /= this.numerator;
    }

    public Fraction clone() {
        try {
            return (Fraction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof Fraction)) return false;
        Fraction fraction = (Fraction) o;
        return Double.compare(denominator, fraction.denominator) == 0 && Double.compare(numerator, fraction.numerator) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(denominator / numerator);
    }
}