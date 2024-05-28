/**
 *
 * @author Jackson
 */
public interface Umliphone {
    void commonMethod();
    String getCommonProperty();
    void setCommonProperty(String value);


    public static void main(String[] args) {
        Umliphone umliphone;

        // Create an instance of one of the implementing classes
        umliphone = new Call();

        // Call the methods defined in the Umliphone interface
        umliphone.commonMethod();
        String commonProperty = umliphone.getCommonProperty();
        umliphone.setCommonProperty("Selecione a opção");

        // Add any additional logic you want to execute in the main method
        System.out.println("Abrindo " + commonProperty);
    }
}
