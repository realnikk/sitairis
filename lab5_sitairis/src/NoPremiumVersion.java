public class NoPremiumVersion implements PremiumStrategy{
    @Override
    public String setPremiumVersionPrice() {
        return "There is no premium version for this application";
    }
}
