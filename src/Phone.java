public abstract class Phone implements Printable{
    private int yearOfProduction;
    private String phoneModel;

    public Phone(int yearOfProduction, String phoneModel) {
        this.yearOfProduction = yearOfProduction;
        this.phoneModel = phoneModel;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getPhoneModel() {
        return phoneModel;
    }
}
