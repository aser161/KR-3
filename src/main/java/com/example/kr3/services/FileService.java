package com.example.kr3.services;

public interface FileService {
    boolean saveToFile(String json);

    String readFromFile();

    boolean cleanDataFile();
}
