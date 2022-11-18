
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Member {
    private String id;
    private String name;
    private LocalDate dob;
    private String job;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", job='" + job + '\'' +
                '}';
    }

    public void inputInfo() {
        System.out.print("Nhập ID: ");
        this.id = new Scanner(System.in).nextLine();
        System.out.print("Nhập tên: ");
        this.name = new Scanner(System.in).nextLine();
        inputDob();
        System.out.print("Nhập công việc: ");
        this.job = new Scanner(System.in).nextLine();
    }

    private void inputDob() {
        LocalDate now = LocalDate.now();
        String date;
        System.out.print("Nhập ngày tháng năm sinh: ");
        DateTimeFormatter birth = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        do {
            date = new Scanner(System.in).next();
            this.dob = LocalDate.parse(date, birth);
            if (dob.isBefore(now)) {
                break;
            }
            System.out.print("Bạn chưa đc sinh ra, nhập lại: ");
        } while (true);
    }
}
