/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.app.dto;

/**
 *
 * @author Marcio Sousa
 */
public class ResponseMessage {
     @JsonProperty("update_id")
    private Long updateId;
    private From from;
    private Chat chat;
    private Timestamp date;
    private String text;

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
