package com.tutorialspoint;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class AddingImageTable08 {
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {

        // Creating a PdfWriter object
        String dest = "\"C:/Users/promosyoncu/Desktop/ImageTable.pdf\";";
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument object
        PdfDocument  pdfDoc = new PdfDocument(writer);

        // Creating a Document object
        Document document = new Document(pdfDoc);

        // Creating a table
        float[] pointColumnWidths = {150f, 150f};
        Table table = new Table(pointColumnWidths);

        // Populating row 1 and adding it to the table
        Cell cell1 = new Cell();
        Paragraph paragraph1 = new Paragraph("Tutorial ID");
        cell1.add(paragraph1);
        table.addCell(cell1);

        Cell cell2 = new Cell();
        Paragraph paragraph2 = new Paragraph("585858");
        cell2.add(paragraph2);
        table.addCell(cell2);



        // Populating row 2 and adding it to the table
        Cell cell3 = new Cell();
        Paragraph paragraph3 = new Paragraph("Tutorial Title");
        cell3.add(paragraph3);
        table.addCell(cell3);

        Cell cell4 = new Cell();
        Paragraph paragraph4 = new Paragraph("iText");
        cell4.add(paragraph4);
        table.addCell(cell4);

        // Populating row 3 and adding it to the table
        Cell cell5 = new Cell();
        Paragraph paragraph5 = new Paragraph("Tutorial Author");
        cell5.add(paragraph5);
        table.addCell(cell5);

        Cell cell6 = new Cell();
        Paragraph paragraph6 = new Paragraph("Emre Simsek");
        cell6.add(paragraph6);
        table.addCell(cell6);

        // Populating row 4 and adding it to the table
        Cell cell7 = new Cell();
        Paragraph paragraph7 = new Paragraph("Tutorial Image");
        cell7.add(paragraph7);
        table.addCell(paragraph7);

        // Creating the cell8
        Cell cell8 =new Cell();
        table.addCell(cell8);

        // Creating an ImageData object
        String imagefile ="C:/Users/promosyoncu/Desktop/imageitext.png";
        ImageData data = ImageDataFactory.create(imagefile);

        // Creating the image
        Image img =new Image(data);

        // Adding image to the cell8
        cell8.add(img.setAutoScale(true));



        // Adding list to the document
        document.add(table);

        // Closing the document
        document.close();






    }
}
