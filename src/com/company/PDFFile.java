package com.company;

public class PDFFile implements Document{
    @Override
    public void createDocument() {
        System.out.println("Document was successfully created");
    }

    @Override
    public void uploadToMoodleDocument() {
        System.out.println("The document was successfully uploaded to Moodle");
    }
}
