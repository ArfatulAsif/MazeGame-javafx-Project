package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.image.Image;
import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class stage02 implements Initializable
{
	private BooleanProperty wPressed = new SimpleBooleanProperty();
    private BooleanProperty sPressed = new SimpleBooleanProperty();
    private BooleanProperty aPressed = new SimpleBooleanProperty();
    private BooleanProperty dPressed = new SimpleBooleanProperty();
    private BooleanBinding keyPressed1 = aPressed.or(wPressed).or(sPressed).or(dPressed);
    
    @FXML
    private Rectangle rect1;
    @FXML
    private Rectangle rect2;
    @FXML
    private Rectangle rect3;
    @FXML
    private Rectangle rect4;
    @FXML
    private Rectangle rect5;
    @FXML
    private Rectangle rect6;
    @FXML
    private Rectangle rect7;
    @FXML
    private Rectangle rect8;
    @FXML
    private Rectangle rect9;
    @FXML
    private Rectangle rect10;
    @FXML
    private Rectangle rect11;
    @FXML
    private Rectangle rect12;
    
    
    
    @FXML
    private ImageView vehicle;
    
    
    private int movement = 2;
    
    @FXML
    private AnchorPane anchorpane;
    
    @FXML
    private ImageView back;
    
    @FXML
    private ImageView gameover;
    
    @FXML
    private ImageView goalflag;
    
    @FXML 
    private ImageView youwin;
    
    
    
    @FXML
    private Label timerLabel;
    
    @FXML
    private Label scoreLabel;
    
    @FXML
    private Label showscoreatendlabel;
    
    @FXML
    private Button nextButton;
    
    
    private Timeline timeline1;
    
    private int time_remaining = 13;
    
    
    
    
    
    
    
    
    
    private void startTimer()
    {
    	timeline1 = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            time_remaining--;
            timerLabel.setText(time_remaining+"");
            scoreLabel.setText(time_remaining*100+"");
         
            

            if (time_remaining <= 0) {
                stopTimer();
                youwin.setVisible(false);
                gameover.setVisible(true);
                showscoreatendlabel.setText(time_remaining*100+"");
                showscoreatendlabel.setVisible(true);
            }
        }));
        timeline1.setCycleCount(Animation.INDEFINITE);
        timeline1.play();
    }
    
    private void stopTimer() {
        if (timeline1 != null) {
            timeline1.stop();
        }
    }
    
    
    AnimationTimer timer1 = new AnimationTimer() {
    	
        @Override
        public void handle(long timestamp) {
        	
        	if(aPressed.get())
        	{
        		int counter = 0;
        		
        		counter += touchrectangle(rect1 , vehicle , 1);
        		counter += touchrectangle(rect2 , vehicle , 1);
        		counter += touchrectangle(rect3 , vehicle , 1);
        		counter += touchrectangle(rect4 , vehicle , 1);
        		counter += touchrectangle(rect5 , vehicle , 1);
        		counter += touchrectangle(rect6 , vehicle , 1);
        		counter += touchrectangle(rect7 , vehicle , 1);
        		counter += touchrectangle(rect8 , vehicle , 1);
        		counter += touchrectangle(rect9 , vehicle , 1);
        		counter += touchrectangle(rect10 , vehicle , 1);
        		counter += touchrectangle(rect11 , vehicle , 1);
        		counter += touchrectangle(rect12 , vehicle , 1);
        		
        		if(counter>0)
        		{
        			
        		}
        		else 
        		{
        			vehicle.setLayoutX(vehicle.getLayoutX()-movement);
        			
        		}
        		
        		if(touchtheflag(goalflag , vehicle) && time_remaining>0)
        		{
        			
        			youwin.setVisible(true);
        			showscoreatendlabel.setText(time_remaining*100+"");
                    showscoreatendlabel.setVisible(true);
                    nextButton.setVisible(true);
                    
                    stopTimer();
        			
        		}
        		
        	}
        	
        	if(dPressed.get())
        	{
        		
        		int counter = 0;
        		
        		counter += touchrectangle(rect1 , vehicle , 2);
        		counter += touchrectangle(rect2 , vehicle , 2);
        		counter += touchrectangle(rect3 , vehicle , 2);
        		counter += touchrectangle(rect4 , vehicle , 2);
        		counter += touchrectangle(rect5 , vehicle , 2);
        		counter += touchrectangle(rect6 , vehicle , 2);
        		counter += touchrectangle(rect7 , vehicle , 2);
        		counter += touchrectangle(rect8 , vehicle , 2);
        		counter += touchrectangle(rect9 , vehicle , 2);
        		counter += touchrectangle(rect10 , vehicle , 2);
        		counter += touchrectangle(rect11 , vehicle , 2);
        		counter += touchrectangle(rect12 , vehicle , 2);
        		
        		if(counter>0)
        		{
        			
        		}
        		else 
        		{
        			vehicle.setLayoutX(vehicle.getLayoutX()+movement);
        			
        		}
        		if(touchtheflag(goalflag , vehicle) && time_remaining>0)
        		{
        			
        			youwin.setVisible(true);
        			showscoreatendlabel.setText(time_remaining*100+"");
                    showscoreatendlabel.setVisible(true);
                    nextButton.setVisible(true);
                    
                    stopTimer();
        			
        		}
        		
        	}
        	if(wPressed.get())
        	{
        		int counter = 0;
        		
        		counter += touchrectangle(rect1 , vehicle , 3);
        		counter += touchrectangle(rect2 , vehicle , 3);
        		counter += touchrectangle(rect3 , vehicle , 3);
        		counter += touchrectangle(rect4 , vehicle , 3);
        		counter += touchrectangle(rect5 , vehicle , 3);
        		counter += touchrectangle(rect6 , vehicle , 3);
        		counter += touchrectangle(rect7 , vehicle , 3);
        		counter += touchrectangle(rect8 , vehicle , 3);
        		counter += touchrectangle(rect9 , vehicle , 3);
        		counter += touchrectangle(rect10 , vehicle , 3);
        		counter += touchrectangle(rect11 , vehicle , 3);
        		counter += touchrectangle(rect12 , vehicle , 3);
        		
        		if(counter>0)
        		{
        			
        		}
        		else 
        		{
        			vehicle.setLayoutY(vehicle.getLayoutY()-movement);
        			
        		}
        		
        		if(touchtheflag(goalflag , vehicle) && time_remaining>0)
        		{
        			
        			youwin.setVisible(true);
        			showscoreatendlabel.setText(time_remaining*100+"");
                    showscoreatendlabel.setVisible(true);
                    nextButton.setVisible(true);
                    
                    stopTimer();
        			
        		}
        		
        	}
        	if(sPressed.get())
        	{
        		int counter = 0;
        		
        		counter += touchrectangle(rect1 , vehicle , 4);
        		counter += touchrectangle(rect2 , vehicle , 4);
        		counter += touchrectangle(rect3 , vehicle , 4);
        		counter += touchrectangle(rect4 , vehicle , 4);
        		counter += touchrectangle(rect5 , vehicle , 4);
        		counter += touchrectangle(rect6 , vehicle , 4);
        		counter += touchrectangle(rect7 , vehicle , 4);
        		counter += touchrectangle(rect8 , vehicle , 4);
        		counter += touchrectangle(rect9 , vehicle , 4);
        		counter += touchrectangle(rect10 , vehicle , 4);
        		counter += touchrectangle(rect11 , vehicle , 4);
        		counter += touchrectangle(rect12 , vehicle , 4);
        		
        		if(counter>0)
        		{
        			
        		}
        		else 
        		{
        			vehicle.setLayoutY(vehicle.getLayoutY()+movement);
        			
        		}
        		if(touchtheflag(goalflag , vehicle) && time_remaining>0)
        		{
        			
        			youwin.setVisible(true);
        			showscoreatendlabel.setText(time_remaining*100+"");
                    showscoreatendlabel.setVisible(true);
                    nextButton.setVisible(true);
                    
                    stopTimer();
        			
        		}
        		
        	}
            
        }
    };
    
    void movementSetup1(){
        back.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.A) {
                aPressed.set(true);
            }

            if(e.getCode() == KeyCode.D) {
                dPressed.set(true);
            }
            if(e.getCode() == KeyCode.W) {
                wPressed.set(true);
            }

            if(e.getCode() == KeyCode.S) {
                sPressed.set(true);
            }
        });

        back.setOnKeyReleased(e ->{
            if(e.getCode() == KeyCode.A) {
                aPressed.set(false);
            }

            if(e.getCode() == KeyCode.D) {
                dPressed.set(false);
            }
            if(e.getCode() == KeyCode.W) {
                wPressed.set(false);
            }

            if(e.getCode() == KeyCode.S) {
                sPressed.set(false);
            }
        });
    }
    
    @Override 
    public void initialize(URL arg0, ResourceBundle arg1) {
		
		
    	movementSetup1();
    	
    	startTimer();
    
		

    	 keyPressed1.addListener(((observableValue, aBoolean, t1) -> {
             if(!aBoolean){
                 timer1.start();
             } else {
                 timer1.stop();
             }
         }));
    	 
    	 back.setFocusTraversable(true);
         back.requestFocus();
        
        
	}
    
    
    
    
    private int touchrectangle(Rectangle rect , ImageView car , int moveno)
    {
    	if(moveno==1)
    	{
    		double x1 = car.getLayoutX()-movement;
    		double x2 = car.getLayoutX()+car.getFitWidth()-movement;
    		double y1 = car.getLayoutY();
    		double y2 = car.getLayoutY()+car.getFitHeight();
    		
    		double ox1 = rect.getLayoutX();
    		double ox2 = rect.getLayoutX()+rect.getWidth();
    		double oy1 = rect.getLayoutY();
    		double oy2 = rect.getLayoutY()+rect.getHeight();
    		
    		boolean check1 = (ox1<=x1 && ox2>=x1) || (ox1<=x2 && ox2>=x2 );
    		boolean check2 = (oy1<=y1 && oy2>=y1) || (oy1<=y2 && oy2>=y2);
    		
    		if(check1 && check2)
    		{
    			return 1;
    		}
    		
    	}
    	if(moveno==2)
    	{
    		double x1 = car.getLayoutX()+movement;
    		double x2 = car.getLayoutX()+car.getFitWidth()+movement;
    		double y1 = car.getLayoutY();
    		double y2 = car.getLayoutY()+car.getFitHeight();
    		
    		double ox1 = rect.getLayoutX();
    		double ox2 = rect.getLayoutX()+rect.getWidth();
    		double oy1 = rect.getLayoutY();
    		double oy2 = rect.getLayoutY()+rect.getHeight();
    		
    		boolean check1 = (ox1<=x1 && ox2>=x1) || (ox1<=x2 && ox2>=x2 );
    		boolean check2 = (oy1<=y1 && oy2>=y1) || (oy1<=y2 && oy2>=y2);
    		
    		if(check1 && check2)
    		{
    			return 1;
    		}
    		
    	}
    	if(moveno==3)
    	{
    		double x1 = car.getLayoutX();
    		double x2 = car.getLayoutX()+car.getFitWidth();
    		double y1 = car.getLayoutY()-movement;
    		double y2 = car.getLayoutY()+car.getFitHeight()-movement;
    		
    		double ox1 = rect.getLayoutX();
    		double ox2 = rect.getLayoutX()+rect.getWidth();
    		double oy1 = rect.getLayoutY();
    		double oy2 = rect.getLayoutY()+rect.getHeight();
    		
    		boolean check1 = (ox1<=x1 && ox2>=x1) || (ox1<=x2 && ox2>=x2 );
    		boolean check2 = (oy1<=y1 && oy2>=y1) || (oy1<=y2 && oy2>=y2);
    		
    		if(check1 && check2)
    		{
    			return 1;
    		}
    		
    	}
    	else 
    	{
    		double x1 = car.getLayoutX();
    		double x2 = car.getLayoutX()+car.getFitWidth();
    		double y1 = car.getLayoutY()+movement;
    		double y2 = car.getLayoutY()+car.getFitHeight()+movement;
    		
    		double ox1 = rect.getLayoutX();
    		double ox2 = rect.getLayoutX()+rect.getWidth();
    		double oy1 = rect.getLayoutY();
    		double oy2 = rect.getLayoutY()+rect.getHeight();
    		
    		boolean check1 = (ox1<=x1 && ox2>=x1) || (ox1<=x2 && ox2>=x2 );
    		boolean check2 = (oy1<=y1 && oy2>=y1) || (oy1<=y2 && oy2>=y2);
    		
    		if(check1 && check2)
    		{
    			return 1;
    		}
    		
    	}
    	
    	
    	return 0;
    }
    
    private boolean touchtheflag(ImageView flag , ImageView car)
    {
    	double x1 = car.getLayoutX();
		double x2 = car.getLayoutX()+car.getFitWidth();
		double y1 = car.getLayoutY();
		double y2 = car.getLayoutY()+car.getFitHeight();
		
		double ox1 = flag.getLayoutX();
		double ox2 = flag.getLayoutX()+flag.getFitWidth();
		double oy1 = flag.getLayoutY();
		double oy2 = flag.getLayoutY()+flag.getFitHeight();
		
		boolean check1 = (ox1<=x1 && ox2>=x1) || (ox1<=x2 && ox2>=x2 );
		boolean check2 = (oy1<=y1 && oy2>=y1) || (oy1<=y2 && oy2>=y2);
		
		if(check1 && check2)
		{
			return true;
		}
		
    	return false;
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
    
    public void backtolabelpage(ActionEvent event) throws IOException
	{
    	 Stage stage;
    	 Scene scene;
    	 Parent root;
		root = FXMLLoader.load(getClass().getResource("levels.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
    
    

    
    
    
}