package Builder;

public class EjecutarBuilder {
    public static void main(String[] args) {
        
        //Creación de los objetos de tipo Converter
        Converter objConverter1 = new ASCIIConverter("Tesis");
        Converter objConverter2 = new PostScriptConverter("Tesis");
        Converter objConverter3 = new PDFConverter("Tesis");
        Converter objConverter4 = new XLSConverter("Tesis");
        
        Reader objLector1 = new Reader("LINE", objConverter1); 
        Reader objLector2 = new Reader("PARAGRAPH", objConverter2); 
        Reader objLector3 = new Reader("TABLE", objConverter3); 
        Reader objLector4 = new Reader("TABLE", objConverter4); 

        objLector1.parseInput(); //Línea generada en ASCCI
        objLector2.parseInput(); //Párrafo generado en PostScript
        objLector3.parseInput(); //Tabla generada en PDF 
        objLector4.parseInput(); //Tabla generada en XLS 

    }
}
