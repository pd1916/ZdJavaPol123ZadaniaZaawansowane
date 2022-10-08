package pl.sdacademy.java.advanced.exercises.day3.app;

import java.util.Objects;

public class Rate {
    private String currency;
    private String code;
    private double mid;

    public Rate() {
    }

    public Rate(String currency, String code, double mid) {
        this.currency = currency;
        this.code = code;
        this.mid = mid;
    }

    public String getCode() {
        return code;
    }

    public double getMid() {
        return mid;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Rate rate = (Rate) o;
        return Double.compare(rate.mid, mid) == 0 && Objects.equals(currency, rate.currency) && Objects.equals(code, rate.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, code, mid);
    }

    @Override
    public String toString() {
        return "Rate{" +
                "currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", mid=" + mid +
                '}';
    }
}