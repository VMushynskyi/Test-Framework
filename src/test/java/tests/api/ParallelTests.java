package tests.api;

import org.testng.annotations.Test;
import tests.api.pool.ParallelRunApi;

public class ParallelTests{

    @Test
    public void runParallelTest() {
        ParallelRunApi parallelRunApi = new ParallelRunApi();
        parallelRunApi.setUp();
        parallelRunApi.testObjectPool();
        parallelRunApi.tearDown();
    }
}
