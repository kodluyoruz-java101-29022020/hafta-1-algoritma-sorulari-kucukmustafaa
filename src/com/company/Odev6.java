package com.company;

public class Odev6
{
    public static void main(String[] args) {
        PDFDocument pdfDocument=new PDFDocument("merhaba bu dosya pdf dosyası");
        WordDocument wordDocument=new WordDocument("merhaba bu dosya word dosyasıdır");
        Printer.printPDFDocument(pdfDocument);
        Printer.printWordDocument(wordDocument);
    }
}

class PDFDocument
{
    public String body;
    public PDFDocument(String body){
        this.body=body;
    }

    public String getBody() {
        return body;
    }
}



class WordDocument
{
    public String body;
    public WordDocument(String body){
        this.body=body;
    }

    public String getBody() {
        return body;
    }
}

class Printer
{
     public static void printPDFDocument(PDFDocument pdfDocument){
         if (pdfDocument == null) {
             System.out.println("error :)");
         }
         else {
             System.out.println(pdfDocument.body);
         }
     }
     public static void printWordDocument(WordDocument wordDocument){
         if (wordDocument == null) {
             System.out.println("error :)");
         }
         else {
             System.out.println(wordDocument.body);
         }

     }
}