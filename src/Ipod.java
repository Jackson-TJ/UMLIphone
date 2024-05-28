public class Ipod implements Umliphone {
    private String commonProperty;

    @Override
    public void commonMethod() {
        System.out.println("Acesando Musicas e Videos");
    }

    @Override
    public String getCommonProperty() {
        return commonProperty;
    }

    @Override
    public void setCommonProperty(String value) {
        this.commonProperty = value;
    }

    public void playMusic() {
        System.out.println("Tocando midias");
    }
}
