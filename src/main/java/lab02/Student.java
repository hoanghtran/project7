package lab02;

public abstract class Student {

    private final String name;
    private final String major;

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public abstract double getDiem();

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getHocLuc() {
        double point = getDiem();
        if (point < 4.0) {
            return "Yeu";
        } else if (point < 6) {
            return "Trung binh";
        } else if (point < 7) {
            return "Trung binh kha";
        } else if (point < 8) {
            return "Kha";
        } else if (point < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }
    
    public void xuatThongTin(){
        System.out.printf("SV: %-20s - %s - %.2f - %s\n", name, major, getDiem(), getHocLuc());
    }
}
