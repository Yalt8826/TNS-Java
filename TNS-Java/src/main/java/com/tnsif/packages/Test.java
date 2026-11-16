package com.tnsif.packages;

public class Test{
    public String pub = "Public";
    private String pri = "Private";
    protected String pro = "Protected";

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.pub);
        System.out.println(t.pri);
        System.out.println(t.pro);
    }
}
