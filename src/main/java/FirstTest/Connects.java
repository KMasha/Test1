package FirstTest;

import com.github.ppadial.testrail.client.apiClient.ApiClient;

import java.io.IOException;

public class Connects {
     public APIClient Connect() throws IOException, APIException {

        try {
            APIClient client = new APIClient("http://izh.technoserv.com/testrail/");
            client.setUser("m.kotelnikova@magelan.ru");
            client.setPassword("Gjvybgfhjkm!");
            return client;

        } catch (Exception e) {
//            Start.log.debug("TestRail недоступен");
//            System.out.println("TestRail недоступен");
            return (null);
        }
    }
}