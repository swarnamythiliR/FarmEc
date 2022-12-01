package com.swarnamythili.farmec;

public class ChatModal {
    private String message;
    private  String sender;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ChatModal(String message, String sender) {
        this.message = message;
        this.sender=sender;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
