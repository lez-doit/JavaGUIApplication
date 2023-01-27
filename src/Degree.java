public abstract class Degree {
    public String name;
    public double value;
    public abstract double convert(Celsius c);

    public abstract double convert(Fahrenheit f);
    public abstract double convert(Kelvin k);
}
