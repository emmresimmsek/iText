package com.tutorialspoint;

import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.borders.DashedBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.awt.*;
import java.io.FileNotFoundException;

public class FormattingTheBordersCell07 {
    public static void main(String[] args) throws FileNotFoundException {

        // Creating a PdfWriter
        String dest = "C:/Users/promosyoncu/Desktop/Formatting.pdf";
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument
        PdfDocument pdfDoc = new PdfDocument(writer);

        // Creating a Document
        Document document = new Document(pdfDoc);

        // Creating a table
        float [] pointColumnWidths = {200F, 200F};
        Table table = new Table(pointColumnWidths);

        // Adding cell 1 to the table
        Cell cell1 = new Cell();
        Paragraph p1 = new Paragraph("Sivas");
        cell1.add(p1);
        table.addCell(cell1);

        // Creating a custom border with RED color
        cell1.setBorder(Border.NO_BORDER);

        // Adding list to the document
        document.add(table);

        // Closing the document
        document.close();











    }
}
