package FirstTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//@RunWith(MyRunner.class)
//@Listeners({TRTestListener.class})

public class Start
{
    public static int argumentRunID;
    public static String argumentIPKS;
    public static Logger log = LogManager.getLogger(Start.class.getName());

    public static void main (String[] args) {

        if(!args[0].isEmpty() && !args[1].isEmpty()){
            try {
                argumentRunID = Integer.parseInt(args[0]);
                argumentIPKS = args[1];

//                argumentRunID = 43;
//                argumentIPKS = "192.168.221.143:9080";

                log.info("Старт");
                GetCases getCases = new GetCases();
                Integer getCase =  getCases.GetCase();
                log.info("Конец");
            } catch (Exception e){
                log.error("Неверный формат RUN_ID или IP КС");
            }
        }else {
            return;
        }
    }
}
