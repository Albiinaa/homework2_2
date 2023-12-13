public class Samsung extends Phone {
    private String maker;

    public Samsung(int yearOfProduction, String phoneModel, String maker) {
        super(yearOfProduction, phoneModel);
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }

    @Override
    public void print() {
        System.out.println("Year of production: " + getYearOfProduction() +
                " Phone model: " + getPhoneModel() + " Maker: " + getMaker());
    }
}
