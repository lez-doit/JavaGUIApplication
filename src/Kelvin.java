public class Kelvin extends Degree {
    public double value;
    public String name;

    Kelvin(double value) {
        this.value = value;
        name = "Kelvin";
    }

    @Override
    public double convert(Celsius c) {
        return Math.round(c.value + 273.15);
    }

    @Override
    public double convert(Fahrenheit f) {
        return Math.round((f.value - 32) / 1.8 + 273.15);
    }

    @Override
    public double convert(Kelvin k) {
        return 0;
    }
}
