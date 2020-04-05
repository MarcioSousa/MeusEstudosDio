package com.example.app.dto;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcio Sousa
 */
public class ResultBotTelegramList {
    private boolean ok;
    private List<GetUpdates> result;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public List<GetUpdates> getResult() {
        return result;
    }

    public void setResult(List<GetUpdates> result) {
        this.result = result;
    }
}
