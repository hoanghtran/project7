package lab02;

public class itStudent extends Student{

    double web, android, embedded;

    public itStudent(String name, String major, double web, double android, double embedded) {
        super(name, major);
        this.web = web;
        this.android = android;
        this.embedded = embedded;
    }

    @Override
    public double getDiem() {
        return (web + android * 2 + embedded * 2) / 5;
    }
}
