package application;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SampleController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void secondpage(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("secondpage.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	public void levelpage(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("levels.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	public void backtosecond(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("secondpage.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	public void exit(ActionEvent event) throws IOException
	{
		Platform.exit();
	}
	public void instruction(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("instruction.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	
	public void gotostage01(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("stage001.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	
	public void gotostage02(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("stage002.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	
	public void gotostage03(ActionEvent event) throws IOException
	{
    	 Stage stage;
    	 Scene scene;
    	 Parent root;
		root = FXMLLoader.load(getClass().getResource("stage003.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	public void gotostage04(ActionEvent event) throws IOException
	{
    	 Stage stage;
    	 Scene scene;
    	 Parent root;
		root = FXMLLoader.load(getClass().getResource("stage004.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	
	public void gotostage05(ActionEvent event) throws IOException
	{
    	 Stage stage;
    	 Scene scene;
    	 Parent root;
		root = FXMLLoader.load(getClass().getResource("stage005.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	
	public void gotostage06(ActionEvent event) throws IOException
	{
    	 Stage stage;
    	 Scene scene;
    	 Parent root;
		root = FXMLLoader.load(getClass().getResource("stage006.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	public void gotostage07(ActionEvent event) throws IOException
	{
    	 Stage stage;
    	 Scene scene;
    	 Parent root;
		root = FXMLLoader.load(getClass().getResource("stage007.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	public void gotostage08(ActionEvent event) throws IOException
	{
    	 Stage stage;
    	 Scene scene;
    	 Parent root;
		root = FXMLLoader.load(getClass().getResource("stage008.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	public void gotostage09(ActionEvent event) throws IOException
	{
    	 Stage stage;
    	 Scene scene;
    	 Parent root;
		root = FXMLLoader.load(getClass().getResource("stage009.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	public void gotostage10(ActionEvent event) throws IOException
	{
    	 Stage stage;
    	 Scene scene;
    	 Parent root;
		root = FXMLLoader.load(getClass().getResource("stage0010.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	public void gotostage11(ActionEvent event) throws IOException
	{
    	 Stage stage;
    	 Scene scene;
    	 Parent root;
		root = FXMLLoader.load(getClass().getResource("stage0011.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	public void gotostage12(ActionEvent event) throws IOException
	{
    	 Stage stage;
    	 Scene scene;
    	 Parent root;
		root = FXMLLoader.load(getClass().getResource("stage0012.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	public void gotostage13(ActionEvent event) throws IOException
	{
    	 Stage stage;
    	 Scene scene;
    	 Parent root;
		root = FXMLLoader.load(getClass().getResource("stage0013.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	public void gotostage14(ActionEvent event) throws IOException
	{
    	 Stage stage;
    	 Scene scene;
    	 Parent root;
		root = FXMLLoader.load(getClass().getResource("stage0014.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	public void gotostage15(ActionEvent event) throws IOException
	{
    	 Stage stage;
    	 Scene scene;
    	 Parent root;
		root = FXMLLoader.load(getClass().getResource("stage0015.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	
}
