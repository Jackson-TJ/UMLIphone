public class Internet implements Umliphone {
    private String commonProperty;

    @Override
    public void commonMethod() {
        System.out.println("Acessando a internet");
    }

    @Override
    public String getCommonProperty() {
        return commonProperty;
    }

    @Override
    public void setCommonProperty(String value) {
        this.commonProperty = value;
    }

    public void browseInternet() {
        System.out.println("Navegando na internet");
    }
}
