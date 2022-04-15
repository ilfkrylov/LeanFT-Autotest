import com.hp.lft.sdk.ModifiableSDKConfiguration;
import com.hp.lft.sdk.SDK;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import views.CalculatorView;

import java.io.IOException;
import java.net.URI;

public class ExampleTest {
    @BeforeClass
    public void before() throws Exception {
        start();
        init();
    }

    private void start() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c leanft start --port=5095");
        Thread.sleep(20_000);
    }

    private void init() throws Exception {
        ModifiableSDKConfiguration config = new ModifiableSDKConfiguration();
        config.setServerAddress(new URI("ws://localhost:5095"));
        SDK.init(config);
    }

    @Test
    public void calcTest() throws IOException, InterruptedException {
        startApp();
        String expected = "3";
        String actual = new CalculatorView()
                .clickOnButton1()
                .clickOnPlusButton()
                .clickOnButton2()
                .clickOnFirstEqualButton()
                .getResultText();
        Assert.assertEquals(actual, expected);
    }

    private void startApp() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c calc");
        Thread.sleep(5_000);
    }

    @AfterClass
    public void after() throws IOException {
        Runtime.getRuntime().exec("cmd /c leanft stop");
    }
}
