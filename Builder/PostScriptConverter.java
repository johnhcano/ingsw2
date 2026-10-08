package Builder;

public class PostScriptConverter extends Converter{
    
    public PostScriptConverter(String document){
        super(document);
    }    
    
    //Métodos
    public void makeLine(){ 
        System.out.println("Línea generada en PostScript");
    }
    public void makeParagraph(){ 
        System.out.println("Párrafo generado en PostScript");
    }
    public void makeTable(){ 
        System.out.println("Tabla generada en PostScript");
    }
    
}
