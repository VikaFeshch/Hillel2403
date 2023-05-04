package org.example.HomeWork8;

public enum Size {
    SMALL("S",11,40),
    MEDIUM("M",13,50),
    LARGE("L",15,60),
    EXTRA_LARGE("XL",17,70);

    private String sh;
    private int width;
    private int length;

    Size(String sh, int width, int length) {
        this.sh=sh;
        this.width=width;
        this.length=length;
    }

    public String getSh() {
        return sh;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }


    @Override
    public String toString() {
        String str = '\u0022'+getSh()+'\u0022'+" or "+'\u0022'+this.name()+'\u0022'+"  size: width="+getWidth()+", length="+getLength();
        return str;
    }
}
