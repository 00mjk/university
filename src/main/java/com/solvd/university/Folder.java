package com.solvd.university;

import java.util.ArrayList;
import java.util.List;

public class Folder<T extends Checkable> {

    private List<T> documents;

    public Folder() {
        this.documents = new ArrayList<>();
    }

    public Folder(List<T> documents) {
        this.documents = documents;
    }

    public List<T> getDocuments() {
        return documents;
    }

    public void setDocuments(List<T> documents) {
        this.documents = documents;
    }

    public void addDocument(T document) {
        documents.add(document);
    }

    public void removeDocument(T document) {
        documents.remove(document);
    }
}
