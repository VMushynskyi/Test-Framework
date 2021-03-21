package tests.api.parallel;

import framework.pool.ObjectPool;
import framework.utils.logging.Log;
import tests.api.ApiTest;

public class ExportingTask implements Runnable {

    private ObjectPool<ExportingTask> pool;
    private ApiTest apiTest;


    public ExportingTask(ObjectPool<ExportingTask> pool) {
        this.pool = pool;
    }

    public ExportingTask() {
        this.apiTest = new ApiTest();
    }

    public void run() {
        Log.info("Current thread id: " + Thread.currentThread().getId() + " --- name: " + Thread.currentThread().getName());
        ExportingTask exportingProcess = pool.borrowObject();
        exportingProcess.apiTest.initRestAssuredSpecification();
        exportingProcess.apiTest.testGetBookTitle();
        exportingProcess.apiTest.testPostBook();
        exportingProcess.apiTest.testGetAllBook();
        exportingProcess.apiTest.testDeleteBook();
        exportingProcess.apiTest.testPatchBook();
        pool.returnObject(exportingProcess);
    }

}
