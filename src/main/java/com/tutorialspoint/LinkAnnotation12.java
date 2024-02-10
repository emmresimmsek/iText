package com.tutorialspoint;

import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfString;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.action.PdfAction;
import com.itextpdf.kernel.pdf.annot.PdfAnnotation;
import com.itextpdf.kernel.pdf.annot.PdfLinkAnnotation;
import com.itextpdf.kernel.pdf.annot.PdfTextAnnotation;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Link;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;

public class LinkAnnotation12 {
    public static void main(String[] args) throws FileNotFoundException, FileNotFoundException {

        // Creating a PdfWriter
        String dest = "C:/Users/promosyoncu/Desktop/TextAnnotation.pdf";
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument
        PdfDocument pdfDoc = new PdfDocument(writer);

        // Creating a Document
        Document document = new Document(pdfDoc);

        // Creating a PdfLinkAnnotation object
        Rectangle rect = new Rectangle(0, 0);
        PdfLinkAnnotation annotation = new PdfLinkAnnotation(rect);

        // Setting action of the annotation
        PdfAction action = PdfAction.createURI("https://www.google.com.tr/");
        annotation.setAction(action);

        // Creating a link
        Link link = new Link("Click here", annotation);

        // Creating a paragraph
        Paragraph paragraph = new Paragraph("Hi welcome to Google ");

        // Adding link to paragraph
        paragraph.add(link.setUnderline());

        // Adding paragraph to document
        document.add(paragraph);

        // Closing the document
        document.close();










    }
}
