package deafultpackage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
		
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("deafultpackage/InterMain.fxml"));
			Scene mainScene = new Scene(root,300,350);
			primaryStage.setTitle("Calc1");
			primaryStage.setScene(mainScene);
			primaryStage.show();
		}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		
		public static void main(String[] args) {
			launch(args);
		}
		
		
	}
	
	
	
	

