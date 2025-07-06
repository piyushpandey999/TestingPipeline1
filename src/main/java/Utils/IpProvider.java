package Utils;

import org.testng.annotations.DataProvider;

import java.util.Arrays;

public class IpProvider {


    @DataProvider(name ="ipProvider")
    public Object[][] ipProvider() {
        String[] ips = System.getProperty("ips", "127.0.0.1").split(",");
        return Arrays.stream(ips).map(ip -> new Object[]{ip}).toArray(Object[][]::new);
    }
}
