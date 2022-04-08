package com.ashishshs.custom_spinner24;

import java.util.ArrayList;
import java.util.List;

public class ModelClass {

  String text,number;

    public ModelClass(String text, String number) {
        this.text = text;
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
