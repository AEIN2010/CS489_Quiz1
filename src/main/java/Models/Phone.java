package Models;

public class Phone {


    private String number;
    private String label;


    public Phone(String number, String label) {
        this.number = number;
        this.label = label;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    @Override
    public String toString() {
        return "\"Phone\"{\n\t"
                +"\"number\":"+number
                +"\n\t"
                +"\"label\":"+label
                +"\n"
                +"}";
    }

}
