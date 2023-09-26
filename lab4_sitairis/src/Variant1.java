import org.w3c.dom.Document;
import org.w3c.dom.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

public class Variant1 {
    public static List<Product> productList = new ArrayList<>();
    public static void main(String[] args) {
        try {
            // Создаем фабрику для создания парсера
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            factory.setIgnoringComments(true);
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Чтение XML-файла и создание объекта документа
            File xmlFile = new File("ITCompany.xml");
            Document document = builder.parse(xmlFile);

            // Получение корневого элемента
            Element root = document.getDocumentElement();
            System.out.println("Корневой элемент: " + root.getNodeName());

            // Получение списка всех продуктов
            NodeList productList = root.getElementsByTagNameNS("https://about.google/", "product");

            // Итерация по списку продуктов и вывод информации
            for (int i = 0; i < productList.getLength(); i++) {
                Element product = (Element) productList.item(i);
                Product productObject = new Product();
                String productID = product.getAttribute("id");
                String name = product.getElementsByTagNameNS("https://about.google/", "name").item(0).getTextContent();
                String date = product.getElementsByTagNameNS("https://about.google/", "date").item(0).getTextContent();
                String category = product.getElementsByTagNameNS("https://about.google/", "category").item(0).getTextContent();
                String language = product.getElementsByTagNameNS("https://about.google/", "language").item(0).getTextContent();
                String description = product.getElementsByTagNameNS("https://about.google/", "description").item(0).getTextContent();

                productObject.setID(Integer.parseInt(productID));
                productObject.setName(name);
                productObject.setDate(date);
                productObject.setCategory(category);
                productObject.setLanguage(language);
                productObject.setDescription(description);

                System.out.println(productObject.getInfo());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Product {
    private int id;
    private String name;
    private String date;
    private String category;
    private String language;
    private String description;

    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getInfo() {
        return "Product Info...\n" +
                "Product ID " + id + '\n' +
                "Product name: " + name + '\n' +
                "Release date: " + date + '\n' +
                "Category: " + category + '\n' +
                "Programming language: " + language + '\n' +
                "Description:" + '\n' + description + '\n' +
                "__________________________________________________________";
    }
}
