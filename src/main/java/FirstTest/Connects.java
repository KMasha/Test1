package FirstTest;

import java.io.IOException;

public class Connects {
     public APIClient Connect() throws IOException, APIException {

        try {
            APIClient client = new APIClient("http://izh.technoserv.com/testrail/");
            client.setUser("m.kotelnikova@magelan.ru");
            client.setPassword("Gjvybgfhjkm!");
            return client;

        } catch (Exception e) {
            Start.log.error("TestRail недоступен");
//            System.out.println("TestRail недоступен");
            return (null);
        }
    }
}