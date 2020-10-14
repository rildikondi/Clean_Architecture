package packagebylayer.detailed.applicationbusinessrules.usecase.simpleusecase;

import packagebylayer.detailed.enterprisebusinessrules.entity.User;

public class UseCaseInteractor implements  InputBoundary{

    private InputData inputData;
    private final OutputBoundary outputBoundary;
    private final DataAccessInterface dataAccessInterface;

    public UseCaseInteractor(OutputBoundary outputBoundary,
                             DataAccessInterface dataAccessInterface) {
        this.outputBoundary = outputBoundary;
        this.dataAccessInterface = dataAccessInterface;
    }

    @Override
    public void receiveData(InputData inputData) {
        this.inputData = inputData;
    }

    public void getData() {
        User user  = dataAccessInterface.getUser();
        OutputData outputData = new OutputData(user.getName());
        outputBoundary.formatData(outputData);
    }
}
