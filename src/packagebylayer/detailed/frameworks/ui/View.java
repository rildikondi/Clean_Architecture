package packagebylayer.detailed.frameworks.ui;

import packagebylayer.detailed.interfaceadapters.viewmodel.DataViewModel;

public class View {
    private final DataViewModel dataViewModel;

    public View(DataViewModel dataViewModel) {
        this.dataViewModel = dataViewModel;
    }

    public void showData(DataViewModel dataViewModel){
        //Html stuff or other ui stuff
    }
}
