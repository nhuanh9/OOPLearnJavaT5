package com.company.staticLearn;


class CNTT5 {
    int rollno;
    String name;
    static String college = "BachKhoa";

    static void change() {
        college = "QuocGia";
    }

    CNTT5(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]) {
        CNTT5.change();
        CNTT5 s1 = new CNTT5(111, "Hoang");
        CNTT5 s2 = new CNTT5(222, "Thanh");
        CNTT5 s3 = new CNTT5(333, "Nam");
        s1.display();
        s2.display();
        s3.display();
    }


}