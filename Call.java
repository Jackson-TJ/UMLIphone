public class Call implements Umliphone {
    private String commonProperty;

    @Override
    public void commonMethod() {
        System.out.println("Chamadas Telefonicas");
    }

    @Override
    public String getCommonProperty() {
        return commonProperty;
    }

    @Override
    public void setCommonProperty(String value) {
        this.commonProperty = value;
    }

    public void makeCall() {
        System.out.println("Fazendo Chamadas");
    }
}
