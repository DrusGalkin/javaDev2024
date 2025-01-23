package ru.galkin.patterns.chain_of_responsibility.les7_3_7;

public class Statement {
    private String name;
    private String text;
    private String signature = "";
    private boolean check;

    public Statement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public String getSignature() {
        return signature;
    }

    public boolean isCheck() {
        return check;
    }

    public void setSignature(String signature) {
        this.signature += " " + signature;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
