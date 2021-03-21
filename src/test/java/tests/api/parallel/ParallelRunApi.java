package tests.api.parallel;

import framework.pool.ObjectPool;
import tests.api.BaseApiTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ParallelRunApi {
    private ObjectPool<ExportingTask> pool;

    public void setUp() {
        pool = new ObjectPool<ExportingTask>(4, 10, 5) {
            protected ExportingTask createObject() {
                return new ExportingTask();
            }
        };
    }

    public void tearDown() {
        pool.shutdown();
    }

    public void testObjectPool() {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(new ExportingTask(pool));
        executor.execute(new ExportingTask(pool));
        executor.execute(new ExportingTask(pool));
        executor.execute(new ExportingTask(pool));

        executor.shutdown();
        try {
            executor.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
