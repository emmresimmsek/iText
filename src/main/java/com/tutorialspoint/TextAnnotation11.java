package com.tutorialspoint;

import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfString;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.annot.PdfAnnotation;
import com.itextpdf.kernel.pdf.annot.PdfTextAnnotation;
import com.itextpdf.layout.Document;

import java.awt.*;
import java.io.FileNotFoundException;

public class TextAnnotation11 {
    public static void main(String[] args) throws FileNotFoundException {
        // Creating a PdfWriter
        String dest = "C:/Users/promosyoncu/Desktop/TextAnnotation.pdf";
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument
        PdfDocument pdfDoc = new PdfDocument(writer);

        // Creating a Document
        Document document = new Document(pdfDoc);








    }
}
