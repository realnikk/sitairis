import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Variant1 {
    public static void main(String[] args) {
        try {
            // Создаем фабрику для создания парсера
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            factory.setIgnoringComments(true);
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Чтение XML-файла и создание объекта документа
            File xmlFile = new File("ITCompany.xml"); // Замените на путь к вашему XML-файлу
            Document document = builder.parse(xmlFile);

            // Получение корневого элемента
            Element root = document.getDocumentElement();
            System.out.println("Корневой элемент: " + root.getNodeName());

            // Получение списка всех продуктов
            NodeList productList = root.getElementsByTagNameNS("https://about.google/", "product");

            // Итерация по списку продуктов и вывод информации
            for (int i = 0; i < productList.getLength(); i++) {
                Element product = (Element) productList.item(i);
                String productID = product.getAttribute("id");
                String name = product.getElementsByTagNameNS("https://about.google/", "name").item(0).getTextContent();
                String date = product.getElementsByTagNameNS("https://about.google/", "date").item(0).getTextContent();
                String category = product.getElementsByTagNameNS("https://about.google/", "category").item(0).getTextContent();
                String language = product.getElementsByTagNameNS("https://about.google/", "language").item(0).getTextContent();
                String description = product.getElementsByTagNameNS("https://about.google/", "description").item(0).getTextContent();

                System.out.println("Имя продукта: " + name);
                System.out.println("Дата выпуска: " + date);
                System.out.println("Категория: " + category);
                System.out.println("Язык программирования: " + language);
                System.out.println("Описание: " + description);
                System.out.println("-----------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
