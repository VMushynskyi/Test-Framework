package tests.api.parallel;

import org.testng.annotations.Test;

public class ParallelTests {

    @Test
    public void runParallelTest() {
        ParallelRunApi parallelRunApi = new ParallelRunApi();
        parallelRunApi.setUp();
        parallelRunApi.testObjectPool();
        parallelRunApi.tearDown();
    }
}
