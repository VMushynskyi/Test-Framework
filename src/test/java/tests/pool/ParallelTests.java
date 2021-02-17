package tests.pool;

import org.testng.annotations.Test;
import tests.api.BaseApi;

public class ParallelTests extends BaseApi {

    @Test
    public void runParallelTest() {
        ParallelRunApi parallelRunApi = new ParallelRunApi();
        parallelRunApi.setUp();
        parallelRunApi.testObjectPool();
        parallelRunApi.tearDown();
    }
}
