

import java.util.Scanner;

public class LogicHandle {
    static void showInfoMember() {
        System.out.println("Danh sách menber: ");
        for (Member member : MainRun.members)
            System.out.println(member);
    }

    static void addMember() {
        int a;
        System.out.print("Nhập số lượng Member: ");
        do {
            a = new Scanner(System.in).nextByte();
            if (a >= 3) {
                break;
            }
            System.out.println("Số lượng Member phải lớn hơn 3, mời nhập lại: ");
        } while (true);
        for (int i = 0; i < a; i++) {
            System.out.println("Nhập menber thứ: " + (i + 1));
            Member member = new Member();
            member.inputInfo();
            MainRun.members.add(member);
        }
    }
}
