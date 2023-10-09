import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Map;

class BarChartPanel extends JPanel {
    private List<ChartData> data;

    public BarChartPanel(List<ChartData> data) {
        this.data = data;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int chartWidth = width - 50; // Устанавливаем ширину диаграммы с отступами
        int chartHeight = height - 100; // Устанавливаем высоту диаграммы с отступами
        int barWidth = width / data.size() / 2;
        int barSpacing = 40;

        Font legendFont = new Font("Calibri", Font.PLAIN, 14); // Измените параметры шрифта по своему усмотрению
        g.setFont(legendFont);

        // Рассчитываем отступы относительно окна
        int chartX = (width - chartWidth) / 2;
        int chartY = (height - chartHeight) / 2;

        for (int i = 0; i < data.size(); i++) {
            ChartData chartData = data.get(i);
            int barHeight = (int) (chartData.getValue() / 10.0 * chartHeight);
            int x = chartX + i * (barWidth + barSpacing);
            int y = chartY + chartHeight - barHeight;

            Color customColor1 = new Color(45, 100, 130);
            g.setColor(customColor1);
            g.fillRect(x, y, barWidth, barHeight);

            g.setColor(Color.black);
            g.drawRect(x, y, barWidth, barHeight);

            g.drawString(chartData.getLabel(), x + barWidth / 2 - 20, chartY + chartHeight + 20);

            // Устанавливаем координаты для подписей над столбцами
            int labelX = x + barWidth / 2 - 20;
            int labelY = chartY - 10;

            g.drawString(String.valueOf(chartData.getValue()), x + barWidth / 2 - 20, chartY + chartHeight - barHeight - 10);
        }
    }
}
