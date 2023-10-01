import org.w3c.dom.Document;
import org.w3c.dom.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

public class XMLParser {
    public static List<Application> applicationList = new ArrayList<>();
    public static void main(String[] args) {
        try {
            // Создаем фабрику для создания парсера
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            factory.setIgnoringComments(true);
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Чтение XML-файла и создание объекта документа
            File xmlFile = new File("lab4_sitairis/GooglePlay.xml");
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
                String category = app.getElementsByTagNameNS("https://play.google.com", "category").item(0).getTextContent();
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
                appObject.setCategory(category);
                appObject.setReleaseDate(releaseDate);
                appObject.setLastUpdate(lastUpdate);
                appObject.setAgeLimit(ageLimit);
                appObject.setPrice(Double.parseDouble(price));
                appObject.setReviews(Integer.parseInt(reviews));
                appObject.setRating(Double.parseDouble(rating));
                appObject.setDescription(description);

                applicationList.add(appObject);
                System.out.println(appObject.getInfo());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
