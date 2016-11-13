package contexts.monitoring.stub;

import contexts.monitoring.api.MonitoringService;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MonitoringServiceStub implements MonitoringService {
    private Map<String, AtomicInteger> responseCountMetrics = new HashMap<>();

    public void incrementResponseCode(int code) {
        responseCountMetrics.getOrDefault(code, new AtomicInteger(0)).getAndIncrement();
    }
}