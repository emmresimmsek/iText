package com.tutorialspoint;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;


public class AddList04 {
    public static void main(String[] args) throws FileNotFoundException {
        // Creating a PdfWriter
        String dest = "C:/Users/promosyoncu/Desktop/addlist2.pdf";
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument
        PdfDocument pdfDoc = new PdfDocument(writer);

        // Creating a Document
        Document document = new Document(pdfDoc);
        String text = "Programlama Dilleri";

        // Creating Paragraphs
        Paragraph paragraph = new Paragraph(text);

        // Adding paragraphs to document
        document.add(paragraph);

        // Creating a list
        List list = new List();

        //  Add elements to the list
        list.add("Java");
        list.add("Python");
        list.add("Javascript");

        // Adding list to the document
        document.add(list);

        // Closing the document
        document.close();








    }
}
