/*
* @author Muntaqim Elahi
*Purpose: To learn to printf instead of println
*/
        import javafx.application.Application;
        import javafx.stage.Stage;
        import java.util.Optional;
        import javafx.scene.control.TextInputDialog;
public class VIPrintf extends Application{
    @Override
    public void start (Stage primaryStage){
        TextInputDialog textInputDialog = new TextInputDialog("1");
        textInputDialog.setTitle("Println vs Printf");
        textInputDialog.setContentText("Select option 1 for println or option 2 for printf");
        Optional<String> input = textInputDialog.showAndWait();
        String option = input.get();
        if(option.equals("1")){
            System.out.println("You chose to println, get to work!");
        } else if (option.equals("2")){
            System.out.printf("Good choice %s \n" , "lazy bum");
            System.out.printf("Character: %c \n" , 123);
            System.out.printf("Decimal: %8d \n", 4321);
            System.out.printf("Exponents: %+.3e \n", 123.456);
            System.out.printf("Float: %6.4f \n" , 7.8910);
        }
    }
}