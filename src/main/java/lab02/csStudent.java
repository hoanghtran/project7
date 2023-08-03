package lab02;

public class csStudent extends Student{
    double malware, safeCoding, forensics;

    public csStudent(String name, String major, double malware, double safeCoding, double forensics) {
        super(name, major);
        this.malware = malware;
        this.safeCoding = safeCoding;
        this.forensics = forensics;
    }
    
    @Override
    public double getDiem() {
        return (malware*2 + safeCoding*2 + forensics)/5;
    }   
}
