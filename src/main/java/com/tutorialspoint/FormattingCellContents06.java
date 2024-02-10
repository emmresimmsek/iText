package com.tutorialspoint;

import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;


import java.awt.*;
import java.io.FileNotFoundException;

public class FormattingCellContents06 {
    public static void main(String[] args) throws FileNotFoundException {
        // Creating a PdfWriter
        String dest = "C:/Users/promosyoncu/Desktop/FormattingPDF.pdf";
        PdfWriter writer = new PdfWriter(dest); // "writer" : PdfWriter sınıfının bir örneğini temsil eden değişkenin ismidir.
        // Masaüstünde bir PDF belgesi oluştu. Ancak içerik daha hazır değil.

        // Creating a PdfDocument
        //// PdfDocument oluştur ve writer ile ilişkilendir.
        PdfDocument pdfDoc = new PdfDocument(writer);
        //İki temel nesne olan "PdfWriter" ve "PdfDocument" arasındaki ilişki önemlidir.

        // Creating a Document
        Document document = new Document(pdfDoc);
        //Document nesnesi, PdfDocument üzerinde çalışmayı kolaylaştırarak belge içeriğini düzenler.

        // Creating a table
        float [] pointColumnWidths = {200F, 200F};
        Table table = new Table(pointColumnWidths);

        // Adding cell 1 to the table
        Cell cell1 = new Cell();     // Creating a cell
        Paragraph p1 = new Paragraph("Emre");
        cell1.add(p1);           // Adding content to the cell



        // Adding cell 2 to the table
        Cell cell2 = new Cell();     // Creating a cell
        Paragraph p2 = new Paragraph("Yunus");
        cell2.add(p2);           // Adding content to the cell


        // Changing text color of cell2 to RED
        cell2.setFontColor(ColorConstants.RED);
        table.addCell(cell2);

        // Changing text color of cell1 to
        cell1.setFontColor(ColorConstants.GREEN);
        table.addCell(cell1);







        // Adding list to the document
        document.add(table);

        // Closing the document
        document.close();






    }
}
