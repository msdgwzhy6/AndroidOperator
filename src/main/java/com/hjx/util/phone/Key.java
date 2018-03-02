package com.hjx.util.phone;

public enum Key {

    HOME(KeyCode.PHONE.HOME),
    POWER(KeyCode.PHONE.POWER);

    private final String v;

    Key(String v) {
        this.v = v;
    }

    public String v() {
        return v;
    }
}
