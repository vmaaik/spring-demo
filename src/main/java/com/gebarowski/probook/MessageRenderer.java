package com.gebarowski.probook;

public interface MessageRenderer {
    MessageProvider getMessageProvider();
    void setMessageProvider(MessageProvider messageProvider);
    void render();



}
