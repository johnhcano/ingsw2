package Builder;

public class PDFConverter extends Converter{
    
    public PDFConverter(String document){
        super(document);
    }    
    
    //Métodos
    public void makeLine(){ 
        System.out.println("Línea generada en PDF");
    }
    public void makeParagraph(){ 
        System.out.println("Párrafo generado en PDF");
    }
    public void makeTable(){ 
        System.out.println("Tabla generada en PDF");
    }
    
}
