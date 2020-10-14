package packagebylayer.detailed.interfaceadapters.controller;

import packagebylayer.detailed.applicationbusinessrules.usecase.simpleusecase.InputBoundary;
import packagebylayer.detailed.applicationbusinessrules.usecase.simpleusecase.InputData;

public class DataController {
    private InputBoundary inputBoundary;

    public DataController(InputBoundary inputBoundary) {
        this.inputBoundary = inputBoundary;
    }

    public void handData(String username, String password) {
        inputBoundary.receiveData(new InputData(username, password));
    }
}
