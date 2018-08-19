package com.gebarowski.probook.ch3.messagerenderer;

import com.gebarowski.probook.ch3.messageprovider.MessageProvider;

public interface MessageRenderer {
    MessageProvider getMessageProvider();
    void setMessageProvider(MessageProvider messageProvider);
    void render();



}
