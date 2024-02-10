package com.tutorialspoint;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;


import java.io.FileNotFoundException;

public class DrawingLine13 {
    public static void main(String[] args) throws FileNotFoundException {
        // Creating a PdfWriter
        String dest = "C:/Users/promosyoncu/Desktop/Line.pdf";
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument
        PdfDocument pdfDoc = new PdfDocument(writer);

        // Creating a Document
        Document document = new Document(pdfDoc);

        // Creating a new page
        PdfPage pdfPage = pdfDoc.addNewPage();

        // Creating a PdfCanvas object
        PdfCanvas canvas = new PdfCanvas(pdfPage);

        // Initial point of the line - Çizgilerin başlangıç noktasını belirliyorsunuz.
        canvas.moveTo(100, 300);

        // Drawing the line - Çizgilerin sonlandığı noktayı belirliyorsunuz.
        canvas.lineTo(500, 300);

        // Closing the path stroke
        canvas.closePathStroke();

        // Closing the document
        document.close();



    }
}
