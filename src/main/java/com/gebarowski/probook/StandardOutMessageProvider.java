package com.gebarowski.probook;

public class StandardOutMessageProvider implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void render() {
        if (messageProvider == null)
            throw new RuntimeException("You must set the property messagePrivider of class:" + StandardOutMessageProvider.class.getName());
        System.out.println(messageProvider.getMessage());
    }
}
