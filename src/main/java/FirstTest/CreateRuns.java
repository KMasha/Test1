//package FirstTest;
//
//import java.io.IOException;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//import org.json.simple.JSONObject;
//
//
//public class CreateRuns {
//
//    public JSONObject CreateRun() throws IOException, APIException {
//
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        Date date = new Date();
//
//        Map nameRun = new HashMap();
////        nameRun.put("case_id", client.sendGet("get_cases/" + 1));
//        nameRun.put("name","Тест_Котельникова_" + date);
//
////        JSONArray response = (JSONArray) client.sendGet("get_cases/" + 1);
////        JSONObject testRailResponse = (JSONObject)client.sendPost("add_run/"+1, nameRun);
////        JSONObject testRailResponse = (JSONObject)client.sendGet("");
//
//
////        JSONObject testRailResponse = (JSONObject) client.sendGet("get_run/" + "18");
//
//
////        JSONObject r = (JSONObject) client.sendPost("add_result_for_case/" + testRailResponse.get("id") + "/2", data);
//
////        JSONObject r = (JSONObject) client.sendPost("add_result_for_case/" + "12" + "/2/2", data);
//
////        JSONObject r = (JSONObject) client.sendGet("get_run/" + "12");
////        JSONObject rr = (JSONObject) client.sendGet("get_cases/" + r);
//
////        System.out.println("Создал Run c ID:"  + testRailResponse.get("id"));
//
//
////        List cases = new ArrayList<>();
////        JSONObject response = (JSONObject) client.sendGet("get_case/" + 1 + "&run_id/" + 32);
//
//
////        List steps = new ArrayList();
////        Map step1 = new HashMap();
////        step1.put("status_id", new Integer(5));
////        steps.add(step1);
//
//        JSONObject r = (JSONObject) client.sendPost("add_result_for_case/" + 32 + "/" + 1, data);
////        System.out.println(response);
////            for (int i = 0; i < response.size(); i++) {
////                cases.add(response.get(i));
////            }
////
////        System.out.println(cases);
//        return ((JSONObject) r);
////    return ((JSONObject) testRailResponse);
//    }
//}
