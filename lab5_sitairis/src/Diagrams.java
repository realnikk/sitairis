import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Diagrams extends JFrame {
    public Diagrams(Integer textEditorCount, Integer imageEditorCount, Integer calculatorCount, Map<String, Double> ratingData) {
        // Создаем список данных для столбчатой диаграммы
        List<ChartData> barChartData = new ArrayList<>();
        for (Map.Entry<String, Double> data : ratingData.entrySet()) {
            String key = data.getKey();
            Double value = data.getValue();
            barChartData.add(new ChartData(key, value));
            //System.out.println("Key: " + key + ", Value: " + value);
        }
        Comparator<ChartData> comparator = Comparator.comparingDouble(ChartData::getValue);
        Collections.sort(barChartData, comparator);
        barChartData = barChartData.subList(barChartData.size() - 5, barChartData.size());


        // Создаем список данных для кольцевой диаграммы
        List<ChartData> ringChartData = new ArrayList<>();
        ringChartData.add(new ChartData("Text Editors", textEditorCount));
        ringChartData.add(new ChartData("Image Editors", imageEditorCount));
        ringChartData.add(new ChartData("Calculators", calculatorCount));

        // Создаем панели для столбчатой и кольцевой диаграмм
        JPanel barChartPanel = new BarChartPanel(barChartData);
        JPanel ringChartPanel = new RingChartPanel(ringChartData);

        // Размещаем панели на форме
        setLayout(new GridLayout(1, 2));
        add(barChartPanel);
        add(ringChartPanel);

        // Настройка окна
        setPreferredSize(new Dimension(900, 600));
        setTitle("Графики");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }
}


