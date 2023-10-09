public class PremiumVersion implements PremiumStrategy{
    private Double price;
    public PremiumVersion(Double price){
        this.price = price;
    }
    @Override
    public String setPremiumVersionPrice() {
        return "Monthly premium version costs " + price + "$";
    }
}
