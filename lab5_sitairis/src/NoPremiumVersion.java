public class NoPremiumVersion implements PremiumStrategy{
    @Override
    public void setPremiumVersionPrice() {
        System.out.println("There is no premium version for this application");
    }
}
