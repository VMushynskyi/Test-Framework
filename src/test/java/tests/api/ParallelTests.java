package tests.api;

import org.testng.annotations.Test;
import tests.BaseApi;
import tests.api.pool.ParallelRunApi;

public class ParallelTests extends BaseApi {

    @Test
    public void runParallelTest() {
        ParallelRunApi parallelRunApi = new ParallelRunApi();
        parallelRunApi.setUp();
        parallelRunApi.testObjectPool();
        parallelRunApi.tearDown();
    }
}
