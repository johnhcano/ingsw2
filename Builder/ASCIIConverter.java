package Builder;

public class ASCIIConverter extends Converter{
    
    public ASCIIConverter(String document){
        super(document);
    }    
    
    //Métodos
    public void makeLine(){ 
        System.out.println("Línea generada en ASCCI");
    }
    public void makeParagraph(){ 
        System.out.println("Párrafo generado en ASCCI");
    }
    public void makeTable(){ 
        System.out.println("Tabla generada en ASCCI");
    }   

}
