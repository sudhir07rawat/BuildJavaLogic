package models;

/**
 * Created by sudhir.rawat on 12-01-2017.
 */

public class ProductDataModel {

    String abText,DetailText;

    public ProductDataModel(String abText, String detailText) {
        this.abText = abText;
        DetailText = detailText;
    }

    public ProductDataModel() {
    }

    public String getAbText() {
        return abText;
    }

    public void setAbText(String abText) {
        this.abText = abText;
    }

    public String getDetailText() {
        return DetailText;
    }

    public void setDetailText(String detailText) {
        DetailText = detailText;
    }
}
