
public class Main {
    public static void main(String[] args) {
        Phone[] phones = {createObject("Iphone"), createObject("Samsung"),
                createObject("Xiaomi")};
        for (Phone printable : phones) {
            printable.print();
        }
    }
    public static Phone createObject(String className) {
        Phone phone = null;
        switch (className) {
            case "Iphone":
            phone = new Iphone(2022,"Iphone 14 Pro",250000);
                    break;
            case "Samsung":
                phone = new Samsung(2020,"Galaxy Z Flip 5","Made in Korea");
                break;
            case "Xiaomi":
                phone = new Xiaomi(2023,"Xiaomi 13T Pro","Blue");
                break;
        }
        return phone;
    }
}