package tests.api.pool;

import framework.utils.logging.Log;

public class ExportingTask implements Runnable {

    private ObjectPool<ExportingProcess> pool;

    public ExportingTask(ObjectPool<ExportingProcess> pool) {
        this.pool = pool;
    }

    //// need fixing
    public void run() {
        Log.info("Current thread id: " + Thread.currentThread().getId() + " --- name: " + Thread.currentThread().getName());
        ExportingProcess exportingProcess = pool.borrowObject();
//        exportingProcess.getApiTest().testGetBookTitle();
//        exportingProcess.getApiTest().testPostBook();
//        exportingProcess.getApiTest().testGetAllBook();
//        exportingProcess.getApiTest().testDeleteBook();
//        exportingProcess.getApiTest().testPatchBook();
        pool.returnObject(exportingProcess);
    }
}
