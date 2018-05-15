package FirstTest;

import org.apache.log4j.LogManager;

import java.io.IOException;
import java.util.logging.ErrorManager;
import java.util.logging.Logger;

import static org.testng.internal.Utils.log;


//@RunWith(MyRunner.class)

//@Listeners({TRTestListener.class})

public class Start
{
//    @org.junit.BeforeClass // выполняет один раз перед всеми тестами

    public static int argumentRunID;
    public static String argumentIPKS;

    public static org.apache.log4j.Logger log = LogManager.getRootLogger();

    public static void main (String[] args) throws IOException, APIException {

        if(!args[0].isEmpty() && !args[1].isEmpty()){
            try {
                argumentRunID = Integer.parseInt(args[0]);
                argumentIPKS = args[1];
//                System.out.println("СТАРТ");
                log.error("Старт");
                GetCases getCases = new GetCases();
                Integer getCase =  getCases.GetCase();
            } catch (Exception e){
//                System.out.println("Не верный формат RUN_ID!" + e);
                log.error("Неверный формат RUN_ID или IP КС");
            }
        }else {
            return;
        }
    }
}
