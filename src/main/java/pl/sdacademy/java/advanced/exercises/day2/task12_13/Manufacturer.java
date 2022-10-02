package pl.sdacademy.java.advanced.exercises.day2.task12_13;

import java.util.Objects;

public class Manufacturer {
    private final String name;
    private final int foundedYear;
    private final String country;

    public Manufacturer(String name, int foundedYear, String country) {
        this.name = name;
        this.foundedYear = foundedYear;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return foundedYear == that.foundedYear && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, foundedYear, country);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", foundedYear=" + foundedYear +
                ", country='" + country + '\'' +
                '}';
    }
}
