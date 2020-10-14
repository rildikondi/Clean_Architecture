package packagebylayer.detailed.interfaceadapters.presenter;

import packagebylayer.detailed.applicationbusinessrules.usecase.simpleusecase.OutputBoundary;
import packagebylayer.detailed.applicationbusinessrules.usecase.simpleusecase.OutputData;
import packagebylayer.detailed.interfaceadapters.viewmodel.DataViewModel;


public class DataPresenter implements OutputBoundary {

    @Override
    public OutputData formatData(OutputData outputData) {
        new DataViewModel("Welcome: " + outputData.getUsername(),
                true,
                true,
                false);
        return new OutputData("Welcome: " + outputData.getUsername());
    }

    @Override
    public void sendData(OutputData formattedData) {

    }
}
