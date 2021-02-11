package tests.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

import static framework.api.utils.ApplicationProperties.getBaseURI;

public class BaseApi {

    public static RequestSpecification requestSpecification;

    @BeforeClass
    public void setupRequestSpecification(){
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(getBaseURI())
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
    }

    protected static RequestSpecification getRequestSpecification(){
        return requestSpecification;
    }
}
