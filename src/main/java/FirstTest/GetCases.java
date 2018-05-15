package FirstTest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;

public class GetCases {

    public Integer GetCase() throws IOException, APIException {

        Connects con = new Connects();
        APIClient newCon = con.Connect();

        Integer tests = null;
        try {


            JSONArray r = (JSONArray) newCon.sendGet("get_tests/" + Start.argumentRunID);
            for(int i = 0; i < r.size(); i++) {

                tests = Tests.parse((JSONObject) r.get(i)).getCaseId();
                switch (tests) {
                    case 1: Testing.Logins(1); break;
                    case 2: Testing.Report(2); break;
                    case 34: Testing.Print(34); break;
                    default:
                 }

            }

        } catch (Exception e){
//            Start.log.debug("Нет такого RUN_ID :" + Start.argumentRunID);
        }
         return (tests);
    }
}
