package com.tutorialspoint;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;





import java.io.FileNotFoundException;

public class AddTable05 {
    public static void main(String[] args) throws FileNotFoundException {
        // Creating a PdfWriter
        String dest = "C:/Users/promosyoncu/Desktop/Table.pdf";
        PdfWriter writer = new PdfWriter(dest); // "writer" : PdfWriter sınıfının bir örneğini temsil eden değişkenin ismidir.
        // Masaüstünde bir PDF belgesi oluştu. Ancak içerik daha hazır değil.

        // Creating a PdfDocument
        //// PdfDocument oluştur ve writer ile ilişkilendir.
        PdfDocument pdfDoc = new PdfDocument(writer);
        //İki temel nesne olan "PdfWriter" ve "PdfDocument" arasındaki ilişki önemlidir.

        // Creating a Document
        Document document = new Document(pdfDoc);
        //Document nesnesi, PdfDocument üzerinde çalışmayı kolaylaştırarak belge içeriğini düzenler.

        // Creating a table object
        float [] pointColumnWidths = {150F, 150F, 150F};
        Table table = new Table(pointColumnWidths);

        // Adding cell 1 to the table
        Cell cell1 = new Cell();
        Paragraph paragraph = new Paragraph("Ad ve Soyad");
        cell1.add(paragraph);
        table.addCell(cell1);
        // Adding cell 2 to the table
        Cell cell2 = new Cell();
        Paragraph paragraph2 = new Paragraph("Memleket");
        cell2.add(paragraph2);
        table.addCell(cell2);

        // Adding list to the document
        document.add(table);

        // Closing the document
        document.close();






    }
}
