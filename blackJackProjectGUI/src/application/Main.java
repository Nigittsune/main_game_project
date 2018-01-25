package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			StackPane root = new StackPane();
			Scene scene = new Scene(root,800,610);
			
			BorderPane borderRoot = new BorderPane();
			Pane paneRoot = new Pane();
			
			root.getChildren().addAll(borderRoot, paneRoot);
			
			scene.setFill(Color.DARKCYAN);
			
			Text dealerHand = new Text(20, 35, "score:                                        Dealer's Hand:                                   DECK:");
			dealerHand.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			dealerHand.setFill(Color.WHITE);
			
			Text dealerScore = new Text(22, 70, "12");
			dealerScore.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
			dealerScore.setFill(Color.BISQUE);
			
			Text playerHand = new Text(20, 320, "score:                                        Player's Hand: ");
			playerHand.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			playerHand.setFill(Color.WHITE);
			
			Text playerScore = new Text(22, 355, "19");
			playerScore.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
			playerScore.setFill(Color.BISQUE);
			
			Image cardBack = new Image("application/card-back-1024x1024.png");
			ImageView cardBackIV = new ImageView(cardBack);
			cardBackIV.setFitWidth(100);
			cardBackIV.setPreserveRatio(true);
			cardBackIV.setSmooth(true);
			cardBackIV.setCache(true);
			cardBackIV.setX(650);
			cardBackIV.setY(50);
			
			Image dealerCard1 = new Image("application/BeMqaPvIQAAzHro.png");
			ImageView dealerCard1IV = new ImageView(dealerCard1);
			dealerCard1IV.setFitWidth(100);
			dealerCard1IV.setPreserveRatio(true);
			dealerCard1IV.setSmooth(true);
			dealerCard1IV.setCache(true);
			dealerCard1IV.setX(280);
			dealerCard1IV.setY(50);
			
			Image dealerCard2 = new Image("application/queen-hearts1.png");
			ImageView dealerCard2IV = new ImageView(dealerCard2);
			dealerCard2IV.setFitWidth(100);
			dealerCard2IV.setPreserveRatio(true);
			dealerCard2IV.setSmooth(true);
			dealerCard2IV.setCache(true);
			dealerCard2IV.setX(400);
			dealerCard2IV.setY(50);
			
			Image playerCard1 = new Image("application/king-spades.png");
			ImageView playerCard1IV = new ImageView(playerCard1);
			playerCard1IV.setFitWidth(100);
			playerCard1IV.setPreserveRatio(true);
			playerCard1IV.setSmooth(true);
			playerCard1IV.setCache(true);
			playerCard1IV.setX(280);
			playerCard1IV.setY(370);
			
			Image playerCard2 = new Image("application/BeMqaPvIQAAzHro.png");
			ImageView playerCard2IV = new ImageView(playerCard2);
			playerCard2IV.setFitWidth(100);
			playerCard2IV.setPreserveRatio(true);
			playerCard2IV.setSmooth(true);
			playerCard2IV.setCache(true);
			playerCard2IV.setX(400);
			playerCard2IV.setY(370);
			
			borderRoot.getChildren().addAll(dealerHand, dealerScore, playerHand, playerScore, cardBackIV,
					dealerCard1IV, dealerCard2IV, playerCard1IV, playerCard2IV);
			
			Button btn = new Button("Play");
			
			btn.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					System.out.println("Let's PLAY!");
					
				}
			});
			paneRoot.getChildren().add(btn);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Welcome to BlackJack!");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	static void drawCard(String name, ) {
//		Image cardBack = new Image("application/card-back-1024x1024.png");
//		ImageView cardBackIV = new ImageView(cardBack);
//		cardBackIV.setFitWidth(100);
//		cardBackIV.setPreserveRatio(true);
//		cardBackIV.setSmooth(true);
//		cardBackIV.setCache(true);
//		cardBackIV.setX(650);
//		cardBackIV.setY(50);
//	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
