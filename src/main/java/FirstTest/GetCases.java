package FirstTest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;

public class GetCases {

    private static WebDriver driver;

    public Integer GetCase() {

        ConnectsTestRail con = new ConnectsTestRail();
        APIClient newCon = con.Connect();

        ConnectsKS conKS = new ConnectsKS();
        WebDriver newconKS = conKS.ConnectKS();
        driver = newconKS;

        Integer tests = null;

        try {
            JSONArray r = (JSONArray) newCon.sendGet("get_tests/" + Start.argumentRunID);
            for (int i = 0; i < r.size(); i++) {

                tests = Tests.parse((JSONObject) r.get(i)).getCaseId();
                switch (tests) {
//                    case 1:
//                        TestingUO.Logins(1, driver);
//                        break;
//                    case 2:
//                        TestingUO.Report(2, driver);
//                        break;
//                    case 34:
//                        TestingUO.Print(34, driver);
//                        break;
                    case 56:
                        TestingUO.PurposeSP(56, driver);
                        break;

                    default:
                }

            }
        } catch (Exception e) {
            Start.log.error("Нет такого RUN_ID :" + Start.argumentRunID + e);
        }
        return (tests);
    }
}
