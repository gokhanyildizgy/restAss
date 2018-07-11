package getRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class getData {

    @Test
    public void testResponseCode () {

        Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");

        int code = resp.getStatusCode();

        System.out.println("Status Code is: " + code);

        Assert.assertEquals(code, 200);
    }

    @Test
    public void testBody () {

        Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");

        String data = resp.asString();

        Long time = resp.getTime();

        System.out.println("Data is: " + data);

        System.out.println("Time is: " + time);

    }

}
