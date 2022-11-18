
import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static ArrayList<Member> members = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            menu();
            int functionchoice = functionchoice();
            switch (functionchoice) {
                case 1:
                    LogicHandle.addMember();
                    break;
                case 2:
                    LogicHandle.showInfoMember();
                    break;
                case 3:
                    return;
            }
        }
    }

    private static int functionchoice() {
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 3)
                break;
            System.out.print("Nhập sai, mời nhập lại: ");
        }
        while (true);
        return choice;
    }

    private static void menu() {
        System.out.println("----PHẦN MÊM QUẢN LÝ THÔNG TIN MEMBER----");
        System.out.println("1. Thêm thông tin Member");
        System.out.println("2. Danh sách thông tin Menber");
        System.out.println("3. Thoát");
        System.out.print("Mời chọn: ");
    }

}
