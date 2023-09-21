package my.classs;
import com.company.*;

    public class Main {
        public static void main(String[] args) {
            WebDesigner wd = new WebDesigner();
            JuniorFrontendDeveloper jfd = new JuniorFrontendDeveloper();
            SeniorFrontendDeveloper sfd = new SeniorFrontendDeveloper();
            FullStackDeveloper fsd = new FullStackDeveloper();
            BackendDeveloper bd = new BackendDeveloper();
            JavaDeveloper jd = new JavaDeveloper();
            jd.createITProduct(); //вызов метода через объект
            ToProgram tp = new JavaDeveloper();
            tp.createITProduct(); //вызов метода через интерфейс
            SoftwareEngineer se = new FullStackDeveloper();
            se.createITProduct(); //вызов метода через абстрактный класс
        }
    }
