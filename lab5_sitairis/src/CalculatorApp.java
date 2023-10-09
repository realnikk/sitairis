public class CalculatorApp extends Application{
    public CalculatorApp(String id, String name, String company, String category, String releaseDate, String lastUpdate, String ageLimit, Integer reviews, Double rating, String description){
        super(id, name, company, category, releaseDate, lastUpdate, ageLimit, reviews, rating, description);
        //strategy = new PremiumVersion(price);
    }
    @Override
    public void start(){
        System.out.println("Запуск калькулятора");
    }
}
