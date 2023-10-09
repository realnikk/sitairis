import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Создаем фабрику для создания парсера
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            factory.setIgnoringComments(true);
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Чтение XML-файла и создание объекта документа
            File xmlFile = new File("lab55_sitairis/GooglePlay.xml");
            Document document = builder.parse(xmlFile);

            // Получение корневого элемента
            Element root = document.getDocumentElement();
            //System.out.println("Root element: " + root.getNodeName());

            // Получение списка всех приложений
            NodeList appList = root.getElementsByTagNameNS("https://play.google.com", "application");

            // Создание фабрики для объектов приложений
            AppFactory appFactory = new AppFactory();

            // Создание единственного экземпляра в рамках паттерна синглтон
            AppsStatistic statistic = AppsStatistic.getInstance();

            // Итерация по списку приложений и вывод информации
            for (int i = 0; i < appList.getLength(); i++) {
                Element app = (Element) appList.item(i);
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

                Application appObject = appFactory.createApp(appID, name, company, category, releaseDate, lastUpdate, ageLimit, Integer.parseInt(reviews), Double.parseDouble(rating), description);
                statistic.updateStatistic(appObject);
            }
            statistic.printStatistic();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
