package com.tutorialspoint;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;

import java.io.FileNotFoundException;

public class AddAreaBreak02 {
    public static void main(String[] args) throws FileNotFoundException {

        // Creating a PdfWriter
        String dest = "C:/Users/promosyoncu/Desktop/addbreak.pdf";
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument
        PdfDocument pdfDoc = new PdfDocument(writer);

        // Creating a Document
        Document document = new Document(pdfDoc);

        // Creating an Area Break
        AreaBreak aB = new AreaBreak();

        // Adding area break to the PDF
        document.add(aB);

        // Closing the document
        document.close();



    }
}
