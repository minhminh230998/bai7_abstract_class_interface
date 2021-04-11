package bai1.iphone;

import java.util.Scanner;

public class test {
    static Scanner sc = new Scanner((System.in));
    static PhoneBook phoneBook = new PhoneBook();
    static String name, phone;

    private static void insertPhone() {
        System.out.println("nhập tên");
        name = sc.nextLine();
        System.out.println("nhập Sđt");
        phone = sc.nextLine();
        phoneBook.insertPhone(name, phone);
    }

    private static void searchPhone() {
        System.out.println("nhập tên bạn muốn tìm");
        name = sc.nextLine();
        phoneBook.searchPhone(name);
    }

    private static void removePhone() {

        System.out.println("nhập tên bạn muốn xóa");
        phoneBook.removePhone(sc.nextLine());
    }

    private static void updatePhone() {
//        boolean timThay = false;
//        System.out.println("nhập vào tên bạn muốn sửa");
//         name = sc.nextLine();
//        for (String s : phoneBook.PhoneList) {
//            if (name.equals(s.substring(0, s.indexOf(",")))) {
//                timThay = true;
//                System.out.println("nhập vào số điện thoại mới");
//                String newPhone=sc.nextLine();
//                phoneBook.updatePhone(name, newPhone);
//                break;
//            }
//        }if(!timThay){
//            System.out.println("không tìm thấy tên"+name);
//        }

    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Chọn");
        System.out.println("1. thêm");
        System.out.println("2. tìm");
        System.out.println("3. remove");
        System.out.println("4. sửa");
        while (true) {
            System.out.println("bạn muốn gì?");

            switch (sc1.nextInt()) {
                case 1:
                    insertPhone();
                    break;
                case 2:
                    searchPhone();
                    break;
                case 3:
                    removePhone();
                case 4:
                    boolean timThay = false;
                    System.out.println("nhập vào tên bạn muốn sửa");
                    name = sc.nextLine();
                    for (String s : phoneBook.PhoneList) {
                        if (name.equals(s.substring(0, s.indexOf(",")))) {
                            timThay = true;
                            System.out.println("nhập vào số điện thoại mới");
                            String newPhone=sc.nextLine();
                            phoneBook.updatePhone(name, newPhone);
                            break;
                        }
                    }if(!timThay){
                    System.out.println("không tìm thấy tên"+name);
                }
            }
        }
    }
}
