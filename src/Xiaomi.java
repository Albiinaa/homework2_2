public class Xiaomi extends Phone{
    public String color;

    public Xiaomi(int yearOfProduction, String phoneModel, String color) {
        super(yearOfProduction, phoneModel);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println("Year of production: " + getYearOfProduction() +
                " Phone model: " + getPhoneModel() + " Color: " + getColor());
    }
}
