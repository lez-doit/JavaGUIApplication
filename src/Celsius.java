public class Celsius extends Degree {
    public double value;
    public String name;

    Celsius(double value) {
        this.value = value;
        name = "Celsius";
    }

    @Override
    public double convert(Celsius c) {
        return 0;
    }

    @Override
    public double convert(Fahrenheit f) {
        return Math.round((f.value - 32) / 1.8);
    }

    @Override
    public double convert(Kelvin k) {
        return Math.round(value - 273.15);
    }
}