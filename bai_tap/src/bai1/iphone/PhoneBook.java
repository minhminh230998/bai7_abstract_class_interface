package bai1.iphone;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook extends Phone {
    @Override
    public String toString() {
        return
                name +","+phone;
    }

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> PhoneList = new ArrayList<>();

    @Override
    void insertPhone(String name, String phone) {
        boolean timThay = false;
        for (String s : PhoneList) {
            if (s.contains(name)) {
                timThay = true;
                if (!s.contains(phone)) {
                    s += "," + phone;
                } else {
                    System.out.println("Đã có người này trong danh bạ");
                    ;
                }
            }
        }
        if (!timThay) {
            PhoneList.add(name + "," + phone);
        }
    }


    @Override
    void removePhone(String name) {
        boolean timThay = false;
        for (String s : PhoneList) {
            if (name.equals(s.substring(0, s.indexOf(",")))) {
                timThay = true;
                PhoneList.remove(s);
                break;
            }
        }
        if (!timThay) {
            System.out.println("không tìm thấy");
        }
    }

    @Override
    void updatePhone(String name, String newPhone) {
        String s = name;
        s = s.substring(0, s.indexOf(","));
        PhoneList.set(PhoneList.indexOf(s), s + "," + newPhone);
        System.out.println("Updated");
    }


    @Override
    void searchPhone(String name) {
        boolean timThay = false;
        for (String s : PhoneList) {
            if (s.contains(name)) {
                timThay = true;
                System.out.println(s.toString());
            }
        }
        if (!timThay) {
            System.out.println("không tìm thấy tên người dùng");
//            System.out.println("bạn có muốn tìm lại không");
//            System.out.println("1. có");
//            System.out.println("2. không");
//            String input=sc.nextLine();
//            switch (input){
//                case "1":
//                    searchPhone(name);
//                case "2":
//
//            }
        }
    }

    @Override
    void sout() {

    }


}
