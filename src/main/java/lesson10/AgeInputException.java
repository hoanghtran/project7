package lesson10;

public class AgeInputException extends Exception{

    public AgeInputException(String message) {
        super(message);
    }
    
    @Override
    public String getMessage(){
        return "Loi khi nhap vao tuoi: " + super.getMessage();
    }  
}
