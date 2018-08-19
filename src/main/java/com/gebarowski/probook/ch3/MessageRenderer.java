package com.gebarowski.probook.ch3;

public interface MessageRenderer {
    MessageProvider getMessageProvider();
    void setMessageProvider(MessageProvider messageProvider);
    void render();



}
