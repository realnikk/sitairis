import static java.lang.Double.max;

public class AppFactory {
    public Application createApp(String id, String name, String company, String category, String releaseDate, String lastUpdate, String ageLimit, Double price, Integer reviews, Double rating, String description) {
        Application toReturn = null;
        switch (category) {
            case "TEXT_EDITOR":
                toReturn = new TextEditor(id, name, company, category, releaseDate, lastUpdate, ageLimit, price, reviews, rating, description);
                break;
            case "IMAGE_EDITOR":
                toReturn = new ImageEditor(id, name, company, category, releaseDate, lastUpdate, ageLimit, price, reviews, rating, description);
                break;
            case "CALCULATOR":
                toReturn = new CalculatorApp(id, name, company, category, releaseDate, lastUpdate, ageLimit, reviews, rating, description);
                break;
            default:
                throw new IllegalArgumentException("Wrong application category: " + category);
        }
        return toReturn;
    }
}
