package lab02;

public class etStudent extends Student{
    double digital_transmission, module_design, micro_remote;

    public etStudent(String name, String major, double digital_transmission, double module_design, double micro_remote) {
        super(name, major);
        this.digital_transmission = digital_transmission;
        this.module_design = module_design;
        this.micro_remote = micro_remote;
    }
    
    @Override
    public double getDiem() {
        return (digital_transmission*2 + module_design + micro_remote)/4;
    } 
}
