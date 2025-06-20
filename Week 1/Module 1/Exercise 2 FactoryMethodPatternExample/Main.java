public class Main {
    public static void main(String[] args) {
        DocumentFactory factory;

   
        factory = new WordFactory();
        Document wordDoc = factory.createDocument();
        wordDoc.open();

       
        factory = new PdfFactory();
        Document pdfDoc = factory.createDocument();
        pdfDoc.open();

      
        factory = new ExcelFactory();
        Document excelDoc = factory.createDocument();
        excelDoc.open();
    }
}
