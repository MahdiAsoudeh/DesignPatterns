package com.mahdi20.command;

import java.util.List;

class Message {

    protected List<String> list;
    protected IMessageSender sender;

    public void addMessage(IMessageSender sender) {

        //add to list
        this.sender = sender;
    }

    public void executeQueue() {

        list.forEach(s -> {

            boolean statusSendingMessage = false;
            while (!statusSendingMessage) {
                statusSendingMessage = sender.sendMessage();
            }

        });

    }
}