import java.util.Scanner;

public final class Utility {

    public static String nextLine(Scanner input){
        if(input.hasNext()){
            input.nextLine();
            return input.nextLine();
        }
        return input.nextLine();
    }
}
