package com.gebarowski.probook.ch3.messagerenderer;

import com.gebarowski.probook.ch3.messageprovider.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

    @Override
    @Autowired
    @Qualifier("configMessage")
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void render() {
        if (messageProvider == null)
            throw new RuntimeException("You must set the property messageProvider of class:" + StandardOutMessageRenderer.class.getName());
        System.out.println(messageProvider.getMessage());
    }
}
