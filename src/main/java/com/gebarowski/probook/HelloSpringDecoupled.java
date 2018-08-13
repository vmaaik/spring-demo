package com.gebarowski.probook;

public class HelloSpringDecoupled {

    public static void main(String[] args) {
        MessageProvider helloSpringMessageProvider = new HelloSpringMessageProvider();
        MessageRenderer messageRenderer = new StandardOutMessageProvider();
        messageRenderer.setMessageProvider(helloSpringMessageProvider);
        messageRenderer.render();
    }

}
