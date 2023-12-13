public class Iphone extends Phone{
    private int price;



    public Iphone(int yearOfProduction, String phoneModel, int price) {
        super(yearOfProduction, phoneModel);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Year of production: " + getYearOfProduction() +
                " Phone model: " + getPhoneModel() + " Price: " + getPrice());
    }
}
