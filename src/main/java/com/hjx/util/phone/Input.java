package com.hjx.util.phone;

public enum Input {

    A(InputCode.LETTER.A),
    _1(InputCode.Number.Num1),
    _2(InputCode.Number.Num2),
    _3(InputCode.Number.Num3),
    _4(InputCode.Number.Num4),
    _5(InputCode.Number.Num5),
    _6(InputCode.Number.Num6),
    _7(InputCode.Number.Num7),
    _8(InputCode.Number.Num8),
    _9(InputCode.Number.Num9),
    _0(InputCode.Number.Num0);

    private final String v;

    Input(String v) {
        this.v = v;
    }

    public String v() {
        return v;
    }
}
