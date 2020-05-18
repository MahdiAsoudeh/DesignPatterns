package com.mahdi20.structural.proxy;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void lazyDisplay() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.lazyDisplay();
    }
}