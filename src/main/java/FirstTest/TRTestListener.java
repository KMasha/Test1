package FirstTest;

import org.testng.IExecutionListener;
import org.testng.ITestNGListener;

import java.io.IOException;

public class TRTestListener implements IExecutionListener {
    public Object TRTestListener() throws IOException, APIException {
        GetCases trTestListener = new GetCases();
        Object newtrTestListener = trTestListener.GetCase();
        return newtrTestListener;
    }

    @Override
    public void onExecutionStart() {

    }

    @Override
    public void onExecutionFinish() {

    }
}
