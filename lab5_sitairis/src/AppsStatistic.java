import java.util.ArrayList;
import java.util.List;

public class AppsStatistic {
    private static AppsStatistic instance = null;
    private Integer textEditorCount = 0;
    private Double textEditorMaxRating = 0.0;
    private String topRatedTextEditor;
    private List<Application> textEditorsList = new ArrayList<>();
    private Integer imageEditorCount = 0;
    private Double imageEditorMaxRating = 0.0;
    private String topRatedImageEditor;
    private List<ImageEditor> imageEditorsList = new ArrayList<>();
    private Integer calculatorCount = 0;
    private Double calculatorMaxRating = 0.0;
    private String topRatedCalculator;
    private List<CalculatorApp> calculatorsList = new ArrayList<>();
    private AppsStatistic() {}
    public static AppsStatistic getInstance() {
        if (instance == null) {
            instance = new AppsStatistic();
        }
        return instance;
    }
    public void setUp() {
        System.out.println("setUp");
    }
    public void updateStatistic(Application app) {
        switch (app.getCategory()) {
            case "TEXT_EDITOR":
                textEditorCount++;
                textEditorsList.add(app);
                if(textEditorMaxRating <= app.getRating()){
                    textEditorMaxRating = app.getRating();
                    topRatedTextEditor = app.getName();
                }
                break;
            case "IMAGE_EDITOR":
                imageEditorCount++;
                if(imageEditorMaxRating <= app.getRating()){
                    imageEditorMaxRating = app.getRating();
                    topRatedImageEditor = app.getName();
                }
                break;
            case "CALCULATOR":
                calculatorCount++;
                if(calculatorMaxRating <= app.getRating()){
                    calculatorMaxRating = app.getRating();
                    topRatedCalculator = app.getName();
                }
                break;
            default:
                throw new IllegalArgumentException("Wrong application category: " + app.getCategory());
        }
    }
    public void printStatistic(){
        System.out.println("Number of text editors: "+textEditorCount);
        System.out.println("The best text editor: "+topRatedTextEditor+" with rating "+textEditorMaxRating+" stars");
        System.out.println("List of text editors: ");
        for (Application list : textEditorsList) {
            System.out.println(list.getName());
        }
        System.out.println("Number of image editors: "+imageEditorCount);
        System.out.println("The best image editor: "+topRatedImageEditor+" with rating "+imageEditorMaxRating+" stars");
        System.out.println("Number of calculators: "+calculatorCount);
        System.out.println("The best calculator: "+topRatedCalculator+" with rating "+calculatorMaxRating+" stars");
    }
}
