package oops;
class LowMarksException extends Exception {
        public LowMarksException(String message){
            super(message);
        }
}
public class CustomException {
    public static void enrollStudent(String name , int marks ) throws LowMarksException{
        if(marks<40){
            throw new LowMarksException("soory "+ name +" you need atleast 40marks to enroll");
        }else {
            System.out.println(name +" enrolled successfully");
        }
    }
    public static void main(String[] args) {
        try{
            enrollStudent("John",30);
        }catch(LowMarksException e ) {
            System.out.println("caught exception "+ e.getMessage());
        }
    }
}
