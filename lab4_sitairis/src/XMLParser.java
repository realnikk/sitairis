import org.w3c.dom.Document;
import org.w3c.dom.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

public class Variant1 {
    public static List<Application> appList = new ArrayList<>();
    public static void main(String[] args) {
        try {
            // Создаем фабрику для создания парсера
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            factory.setIgnoringComments(true);
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Чтение XML-файла и создание объекта документа
            File xmlFile = new File("GooglePlay.xml");
            Document document = builder.parse(xmlFile);

            // Получение корневого элемента
            Element root = document.getDocumentElement();
            System.out.println("Root element: " + root.getNodeName());

            // Получение списка всех приложений
            NodeList appList = root.getElementsByTagNameNS("https://play.google.com", "application");

            // Итерация по списку приложений и вывод информации
            for (int i = 0; i < appList.getLength(); i++) {
                Element app = (Element) appList.item(i);
                Application appObject = new Application();
                String appID = app.getAttribute("id");
                String name = app.getElementsByTagNameNS("https://play.google.com", "name").item(0).getTextContent();
                String company = app.getElementsByTagNameNS("https://play.google.com", "company").item(0).getTextContent();
                String releaseDate = app.getElementsByTagNameNS("https://play.google.com", "releasedate").item(0).getTextContent();
                String lastUpdate = app.getElementsByTagNameNS("https://play.google.com", "lastupdate").item(0).getTextContent();
                String ageLimit = app.getElementsByTagNameNS("https://play.google.com", "agelimit").item(0).getTextContent();
                String price = app.getElementsByTagNameNS("https://play.google.com", "price").item(0).getTextContent();
                String reviews = app.getElementsByTagNameNS("https://play.google.com", "reviews").item(0).getTextContent();
                String rating = app.getElementsByTagNameNS("https://play.google.com", "rating").item(0).getTextContent();
                String description = app.getElementsByTagNameNS("https://play.google.com", "description").item(0).getTextContent();

                appObject.setID(appID);
                appObject.setName(name);
                appObject.setCompany(company);
                appObject.setReleaseDate(releaseDate);
                appObject.setLastUpdate(lastUpdate);
                appObject.setAgeLimit(ageLimit);
                appObject.setPrice(Double.parseDouble(price));
                appObject.setReviews(Integer.parseInt(reviews));
                appObject.setRating(Double.parseDouble(rating));
                appObject.setDescription(description);

                System.out.println(appObject.getInfo());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Application {
    private String id;
    private String name;
    private String company;
    private String releaseDate;
    private String lastUpdate;
    private String ageLimit;
    private Double price;
    private Integer reviews;
    private Double rating;
    private String description;

    public String getID() {
        return id;
    }
    public void setID(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public String getAgeLimit() {
        return ageLimit;
    }
    public void setAgeLimit(String ageLimit) {
        this.ageLimit = ageLimit;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getReviews() {
        return reviews;
    }
    public void setReviews(Integer reviews) {
        this.reviews = reviews;
    }
    public Double getRating() {
        return rating;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getInfo() {
        return "Application Info...\n" +
                "App ID " + id + '\n' +
                "App name: " + name + '\n' +
                "Company-developer: " + company + '\n' +
                "Release date: " + releaseDate + '\n' +
                "Last update: " + lastUpdate + '\n' +
                "Age limit: " + ageLimit + '\n' +
                "Price of premium version: " + price + '\n' +
                "Num of reviews: " + reviews + '\n' +
                "Rating on a 5-point scale: " + rating + '\n' +
                "Description:" + '\n' + description + '\n' +
                "__________________________________________________________";
    }
}
