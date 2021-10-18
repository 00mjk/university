package com.solvd.university;

/**
 * Use it for important documents that should be checked
 */
public interface Checkable {

    /**
     * Check if document is valid
     */
    boolean isValidDate();

    /**
     * Check if a document's identificator valid
     */
    boolean isValidIdentificator();
}
