package ExceptionHandling;

public class TestCustomException {
    public static void ValidateAge(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Age is not valid for Voting...");
        }else{
            System.out.println("Age is valid for Voting..");
        }
    }
    public static void main(String[] args) {
        try {
            ValidateAge(17);
        } catch (InvalidAgeException e) {
            System.out.println("Exception Occured : "+e);
        }
    }
}
class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}

