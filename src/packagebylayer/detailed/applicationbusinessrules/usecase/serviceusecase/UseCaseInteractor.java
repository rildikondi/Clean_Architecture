package packagebylayer.detailed.applicationbusinessrules.usecase.serviceusecase;

import packagebylayer.detailed.applicationbusinessrules.usecase.simpleusecase.DataAccessInterface;
import packagebylayer.detailed.applicationbusinessrules.usecase.simpleusecase.OutputBoundary;
import packagebylayer.detailed.applicationbusinessrules.usecase.simpleusecase.OutputData;
import packagebylayer.detailed.enterprisebusinessrules.entity.User;

public class UseCaseInteractor implements ServiceBoundary {

    private OutputBoundary outputBoundary;
    private DataAccessInterface dataAccessInterface;
    private ServiceBoundary serviceBoundary;
    private InputData inputData;

    public UseCaseInteractor(OutputBoundary outputBoundary, DataAccessInterface dataAccessInterface, ServiceBoundary serviceBoundary) {
        this.outputBoundary = outputBoundary;
        this.dataAccessInterface = dataAccessInterface;
        this.serviceBoundary = serviceBoundary;
    }

    public void getData() {
        User user  = dataAccessInterface.getUser();
        OutputData outputData = new OutputData(user.getName());
        OutputData formattedData = outputBoundary.formatData(outputData);
        outputBoundary.sendData(formattedData);
    }

    @Override
    public void receiveData(InputData inputData) {
        this.inputData = inputData;
    }
}
