package com.techventus.parsetabledownloader;

/**
 * Created by josephmalone on 2017-01-21.
 */
public class ParseStruct {
    String createdAt;
    String fileName;
    FileReference fileReference;
    String objectId;
    String owner;
    String updatedAt;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getFilename() {
        return fileName;
    }

    public void setFilename(String filename) {
        this.fileName = filename;
    }

    public FileReference getFileReference() {
        return fileReference;
    }

    public void setFileReference(FileReference fileReference) {
        this.fileReference = fileReference;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "ParseStruct{" +
                "createdAt='" + createdAt + '\'' +
                ", filename='" + fileName + '\'' +
                ", fileReference=" + fileReference.toString() +
                ", objectId='" + objectId + '\'' +
                ", owner='" + owner + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
