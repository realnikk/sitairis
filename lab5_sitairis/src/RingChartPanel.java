import javax.swing.*;
import java.awt.*;
import java.util.List;

class RingChartPanel extends JPanel {
    private List<ChartData> data;

    public RingChartPanel(List<ChartData> data) {
        this.data = data;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        //int chartWidth = width - 50;  Устанавливаем ширину диаграммы с отступами
        //int chartHeight = height - 100;  Устанавливаем высоту диаграммы с отступами
        int cx = width / 2;
        int cy = height / 2;
        int radius = Math.min(cx, cy) - 20;

        double total = data.stream().mapToDouble(ChartData::getValue).sum();
        double startAngle = 0;
        Color backgroundColor = new Color(238, 238, 238);

        int legendX = width - 100;
        int legendY = 20;

        for (ChartData chartData : data) {
            double arcAngle = 360 * chartData.getValue() / total;
            g.setColor(getRandomColor());
            g.fillArc(cx - radius, cy - radius, 2 * radius, 2 * radius, (int) startAngle, (int) arcAngle);
            startAngle += arcAngle;

            g.fillRect(legendX, legendY, 10, 10);
            g.setColor(Color.black);
            g.drawRect(legendX, legendY, 10, 10);
            g.drawString(chartData.getLabel(), legendX + 20, legendY + 10);
            g.drawString(String.valueOf(chartData.getValue()), legendX - 30, legendY + 10);

            legendY += 20;
        }
        g.setColor(backgroundColor);
        g.fillArc(cx - 100, cy - 100, 200, 200, 0, 360);
    }

    private Color getRandomColor() {
        return new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
    }
}
