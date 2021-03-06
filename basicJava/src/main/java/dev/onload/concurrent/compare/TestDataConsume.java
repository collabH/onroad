package dev.onload.concurrent.compare;

import com.lmax.disruptor.EventHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * @author echo huang
 * @version 1.0
 * @date 2019-09-22 23:40
 * @description disruptor消费者
 */
public class TestDataConsume implements EventHandler<TestData> {
    private long startTime;
    private int i;

    public TestDataConsume() {
        this.startTime = System.currentTimeMillis();
    }


    @Override
    public void onEvent(TestData testData, long l, boolean b) throws Exception {
        i++;
        if (i == 50000000) {
            long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        }
    }
}
