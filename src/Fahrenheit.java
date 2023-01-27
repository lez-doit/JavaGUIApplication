public class Fahrenheit extends Degree {
    public double value;
    public String name;

    Fahrenheit(double value) {
        this.value = value;
        name = "Fahrenheit";
    }

    @Override
    public double convert(Celsius c) {
        return Math.round(c.value * 1.8 + 32);
    }

    @Override
    public double convert(Fahrenheit f) {
        return 0;
    }

    @Override
    public double convert(Kelvin k) {
        return Math.round((k.value - 273.15) * 1.8 + 32);
    }
}
