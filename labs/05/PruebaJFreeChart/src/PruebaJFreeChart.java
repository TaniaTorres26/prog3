import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class PruebaJFreeChart {
    public static final int ANCHO_GRAFICA = 800;
    public static final int ALTO_GRAFICA = 600;

    public static void generarGraficoEdad() throws IOException {
        String arch = "datosin.csv"; // Ruta y nombre del archivo CSV
        File archiData = new File(arch);

        XYSeriesCollection dataset = new XYSeriesCollection();

        try {
            Scanner leeArch = new Scanner(archiData);
            String valor = null;
            int sec = 1;

            while (leeArch.hasNextLine()) {
                XYSeries serie = new XYSeries(sec == 1 ? "Edad y Casos por Edad" : valor);
                sec = 1;

                while (leeArch.hasNextLine()) {
                    valor = leeArch.nextLine();
                    if (!isNumeric(valor)) {
                        break;
                    }
                    serie.add(sec++, Double.parseDouble(valor));
                }

                dataset.addSeries(serie);
            }

            JFreeChart chart = ChartFactory.createXYLineChart(
                    "Gráfico de Edad y Casos por Edad", "Edad", "Casos", dataset,
                    PlotOrientation.VERTICAL, true, true, false);

            ChartUtilities.saveChartAsPNG(new File("grafico_edad.png"), chart, ANCHO_GRAFICA, ALTO_GRAFICA);
            System.out.println("Gráfico generado y guardado como 'grafico_edad.png'.");

        } catch (FileNotFoundException ex) {
            System.err.println("Error -> " + ex.getMessage());
        }
    }

    public static void generarGraficoSeguroSaludEstrato(String tipSS) throws IOException {
        String arch = "datosin.csv"; // Ruta y nombre del archivo CSV
        File archiData = new File(arch);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try {
            Scanner leeArch = new Scanner(archiData);

            while (leeArch.hasNextLine()) {
                String linea = leeArch.nextLine();
                String[] valores = linea.split(",");

                if (valores.length >= 10) {
                    String tipoSS = valores[8];
                    if (tipoSS.equals(tipSS)) {
                        String estrato = valores[10];
                        dataset.addValue(1, estrato, tipSS);
                    }
                }
            }

            String titulo = "Gráfico de " + tipSS + " por Estrato";

            JFreeChart chart = ChartFactory.createBarChart(
                    titulo, "Estrato", "Cantidad de Personas", dataset,
                    PlotOrientation.VERTICAL, true, true, false);

            ChartUtilities.saveChartAsPNG(new File("grafico_" + tipSS + "_estrato.png"), chart, ANCHO_GRAFICA, ALTO_GRAFICA);
            System.out.println("Gráfico generado y guardado como 'grafico_" + tipSS + "_estrato.png'.");

        } catch (FileNotFoundException ex) {
            System.err.println("Error -> " + ex.getMessage());
        }
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}

