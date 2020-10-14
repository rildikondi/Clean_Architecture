package packagebylayer.detailed.interfaceadapters.service;

import packagebylayer.detailed.applicationbusinessrules.usecase.serviceusecase.InputData;
import packagebylayer.detailed.applicationbusinessrules.usecase.serviceusecase.ServiceBoundary;

import java.util.List;

public class ServiceListener {
    private ServiceBoundary serviceBoundary;

    public ServiceListener(ServiceBoundary serviceBoundary) {
        this.serviceBoundary = serviceBoundary;
    }

    void formatData(List<String> data) {
        serviceBoundary.receiveData( new InputData(data.get(0), data.get(1)));
    }
}
