package FirstTest;

import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AddResultForCase {
    public JSONObject AddResultForCase(Integer val, String comment, String defects, int i) throws IOException, APIException{

        Connects con = new Connects();
        APIClient newCon = con.Connect();

        Map data = new HashMap();
        data.put("status_id", new Integer(val));
        data.put("defects", defects);
        data.put("comment", comment);
//        data.put("custom_step_results", steps);

        JSONObject r = new JSONObject();

        try {
            r = (JSONObject) newCon.sendPost("add_result_for_case/" + Start.argumentRunID + "/" + i, data);
        } catch (Exception e){
            System.out.println("Error");
        }
        return ((JSONObject) r);

    }
}
