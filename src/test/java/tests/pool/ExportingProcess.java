package tests.pool;

import tests.api.ApiTest;

public class ExportingProcess {

    private ApiTest apiTest;

    public ExportingProcess() {

        this.apiTest = new ApiTest();
    }

    public ApiTest getApiTest() {
        return apiTest;
    }
}
