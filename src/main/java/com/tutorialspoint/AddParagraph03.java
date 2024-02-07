import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.WriterProperties;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class AddParagraph03 {
    public static void main(String args[]) throws Exception {

        // Creating a PdfWriter
        String dest = "C:/Users/promosyoncu/Desktop/addparagraph4.pdf";
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument
        PdfDocument pdf = new PdfDocument(writer);

        // Creating a Document
        Document document = new Document(pdf);
        String para1 = "iText Ögreniyorum.";
        String para2 = " iText, Java tabanlı bir kütüphanedir ve PDF dosyalarını oluşturmak, düzenlemek, okumak ve işlemek için kullanılır. ";

        // Creating Paragraphs
        Paragraph paragraph1 = new Paragraph(para1);
        Paragraph paragraph2 = new Paragraph(para2);

        // Adding paragraphs to document
        document.add(paragraph1);
        document.add(paragraph2);
        // Closing the document
        document.close();
        System.out.println("Paragraph eklendi.");




    }
}