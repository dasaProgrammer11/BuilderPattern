public class PhoneBuilder {

    private String OS;
    private String Brand;
    private double price;
    private float screenSize;
    private String processor;

    public PhoneBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public PhoneBuilder setBrand(String brand) {
        Brand = brand;
        return this;
    }

    public PhoneBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public PhoneBuilder setScreenSize(float screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public Phone getPhone(){
        return  new Phone(OS,Brand,price,screenSize,processor);
    }
}
