package com.gebarowski.probook.ch3.xmlbased;

import com.gebarowski.probook.ch3.messageprovider.HelloSpringMessageProvider;
import com.gebarowski.probook.ch3.messageprovider.MessageProvider;
import com.gebarowski.probook.ch3.messagerenderer.MessageRenderer;
import com.gebarowski.probook.ch3.messagerenderer.StandardOutMessageRenderer;

public class HelloSpringDecoupled {

    public static void main(String[] args) {
        MessageProvider helloSpringMessageProvider = new HelloSpringMessageProvider();
        MessageRenderer messageRenderer = new StandardOutMessageRenderer();
        messageRenderer.setMessageProvider(helloSpringMessageProvider);
        messageRenderer.render();
    }

}
