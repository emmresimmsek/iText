package com.tutorialspoint;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class AddImage09 {
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
        // Creating a PdfWriter
        String dest = "C:/Users/promosyoncu/Desktop/addImage55.pdf";
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument
        PdfDocument pdfDoc = new PdfDocument(writer);

        // Creating a Document   Document
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

        // Creating an ImageData object
        String imageFile = "C:/Users/promosyoncu/Desktop/logo.png";
        ImageData data = ImageDataFactory.create(imageFile);



        // Creating an Image object
        Image img = new Image(data);

        // Setting the position of the image to the center of the page
        img.setFixedPosition(40, 650);
        img.scaleToFit(100,100);

        // Adding image to the document
        document.add(img);


        // Closing the document
        document.close();



    }
}
