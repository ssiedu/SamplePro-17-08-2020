
public class SwitchCaseExample {

    public static void main(String[] args) {
        
        //switch-case-with-string-value
        
        String state="RJ";
        
        switch(state){
            case "MP":
                System.out.println("Bhopal");
            break;
            case "MH":
                System.out.println("Mumbai");
            break;
            case "RJ":
                System.out.println("Jaipur");
            break;
        }
        
        /*
        int day=3;
        
        switch(day){
            case 1:
                System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
            break;
            case 3:
                System.out.println("Wednesday");
            break;
            case 4:
                System.out.println("Thursday");
            break;
            case 5:
                System.out.println("Friday");
            break;
            case 6:
                System.out.println("Saturday");
            break;
            case 7:
                System.out.println("Sunday");
            break;
            default:
                System.out.println("Invalid Day...");
        }
        */
        
    }
}
