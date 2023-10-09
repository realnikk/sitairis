public class PremiumVersion implements PremiumStrategy{
    private Double price;
    public PremiumVersion(Double price){
        this.price = price;
    }
    @Override
    public void setPremiumVersionPrice() {
        System.out.println("Monthly premium version costs " + price + "$");
    }
}
