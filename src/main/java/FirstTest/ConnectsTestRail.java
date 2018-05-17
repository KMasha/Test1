package FirstTest;

public class ConnectsTestRail {
     public APIClient Connect() {

        try {
            APIClient client = new APIClient("http://izh.technoserv.com/testrail/");
            client.setUser("m.kotelnikova@magelan.ru");
            client.setPassword("Gjvybgfhjkm!");
            return client;

        } catch (Exception e) {
            Start.log.error("TestRail недоступен");
            System.exit(1);
            return (null);
        }
    }
}