package packagebylayer.detailed.interfaceadapters.service;

import java.util.List;

public class DataService {
    private ServiceListener serviceListener;

    public DataService(ServiceListener serviceListener) {
        this.serviceListener = serviceListener;
    }

    public void setData(List<String> data) {
        serviceListener.formatData(data);
    }
}
