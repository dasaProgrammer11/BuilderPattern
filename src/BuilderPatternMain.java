public class BuilderPatternMain {

    public static void main(String args[]){
        PhoneBuilder pb=new PhoneBuilder();
         Phone phn=pb.setOS("Android")
                .setBrand("Micromax")
                .setPrice(30000)
                .getPhone();

         phn.phoneDetails();
    }
}
