package Builder;

public class Converter {
    //Atributos
    private String document;

    //Constructor
    public Converter(String document){
        this.document = document;
    }
    //Métodos
    public void makeLine(){ }
    public void makeParagraph(){ }
    public void makeTable(){ }
    public String getDocument(){
        return document;
    }

}
