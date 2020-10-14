package packagebylayer.detailed.applicationbusinessrules.usecase.simpleusecase;

public interface OutputBoundary {
     OutputData formatData(OutputData outputData);

     void sendData(OutputData formattedData);
}
