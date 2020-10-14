package packagebylayer.detailed.interfaceadapters.viewmodel;

public class DataViewModel {

    private String status;
    private boolean verifiedIcon;
    private boolean commentButtonActivated;
    private boolean premiumFeatureActivated;

    public DataViewModel(String status,
                         boolean verifiedIcon,
                         boolean commentButtonActivated,
                         boolean premiumFeatureActivated) {
        this.status = status;
        this.verifiedIcon = verifiedIcon;
        this.commentButtonActivated = commentButtonActivated;
        this.premiumFeatureActivated = premiumFeatureActivated;
    }

}
