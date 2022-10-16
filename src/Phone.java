public class Phone {
    private String OS;
    private String Brand;
    private double price;
    private float screenSize;
    private String processor;

    public Phone(String OS, String brand, double price, float screenSize, String processor) {
        this.OS = OS;
        Brand = brand;
        this.price = price;
        this.screenSize = screenSize;
        this.processor = processor;
    }

    public void phoneDetails(){
        System.out.println("OS:::"+OS);
        System.out.println("Brand::::"+Brand);
        System.out.println("Price:::"+price);
        System.out.println("screenSize:::"+screenSize);
        System.out.println("processor:::"+processor);
    }


}
