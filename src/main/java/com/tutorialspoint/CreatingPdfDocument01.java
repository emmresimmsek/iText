package com.tutorialspoint;


import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

import java.io.FileNotFoundException;

public class CreatingPdfDocument01 {
    public static void main(String[] args) throws FileNotFoundException {

        // Creating a PdfWriter
        String dest = "C:/Users/promosyoncu/Desktop/ornek.pdf";
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument
        PdfDocument pdfDoc = new PdfDocument(writer);

        // Adding an empty page
        pdfDoc.addNewPage();

        // Creating a Document
        Document document = new Document(pdfDoc);

        // Closing the document
        document.close();



    }
}
