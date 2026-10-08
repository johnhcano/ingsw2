package Builder;

public class XLSConverter extends Converter{
    
    public XLSConverter(String document){
        super(document);
    }    
    
    //Métodos
    public void makeLine(){ 
        System.out.println("Línea generada en XLS");
    }
    public void makeParagraph(){ 
        System.out.println("Párrafo generado en XLS");
    }
    public void makeTable(){ 
        System.out.println("Tabla generada en XLS");
    }   
}
