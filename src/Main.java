import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javafx.scene.text.Text;

/**
 * Create by hieuduong on 11/9/17
 *
 * CSC 201 - Assignment 15
 * Problem 15.1:
 *
 * (Pick four cards) Write a program that lets the user click the Refresh button to
 * display four cards from a deck of 52 cards, as shown in Figure 15.24a. (See the
 * hint in Programming Exercise 14.3 on how to obtain four random cards.)
 */

public class Main extends Application{

    protected ImageView imageView1, imageView2, imageView3, imageView4;
    protected Text text;
    @Override
    public void start(Stage primaryStage) {

        // Create a pane
        BorderPane pane = new BorderPane();

        // Place nodes in the pane
        pane.setTop(getHBox());
        //pane.setLeft(getVBox());
        pane.setBottom(getSecondHBox());

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Cards Game"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * Create Hbox to hold the shuffle button
     * @return
     */
    private HBox getHBox() {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setStyle("-fx-background-color: silver");

        Button b1 = new Button("Shuffle Cards");
        hBox.getChildren().add(b1);
        hBox.setAlignment(Pos.CENTER);

        b1.setOnAction(e -> ChangeImage());

        return hBox;
    }

    /**
     * Create the second Hbox to hold 3 cards
     * @return
     */
    private HBox getSecondHBox(){
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15, 15, 15, 15));

        imageView1 = new ImageView(new Image(ImageUrl(GetRandom())));
        imageView1.setFitWidth(200);
        imageView1.setFitHeight(250);

        imageView2 = new ImageView(new Image(ImageUrl(GetRandom())));
        imageView2.setFitWidth(200);
        imageView2.setFitHeight(250);

        imageView3 = new ImageView(new Image(ImageUrl(GetRandom())));
        imageView3.setFitWidth(200);
        imageView3.setFitHeight(250);

        imageView4 = new ImageView(new Image(ImageUrl(GetRandom())));
        imageView4.setFitWidth(200);
        imageView4.setFitHeight(250);

        hBox.getChildren().addAll(imageView1, imageView2, imageView3, imageView4);
        hBox.setAlignment(Pos.CENTER);
        return hBox;
    }

    /**
     * Change card method
     */

    private void ChangeImage() {

        imageView1.setImage(new Image(ImageUrl(GetRandom())));
        imageView2.setImage(new Image(ImageUrl(GetRandom())));
        imageView3.setImage(new Image(ImageUrl(GetRandom())));
        imageView4.setImage(new Image(ImageUrl(GetRandom())));
    }

    /**
     * Generate a random number from 0 to 51
     * @return
     */
    private static int GetRandom(){
        int random;
        random = ((int)(Math.random() * 51)) + 1;

        return random;
    }

    /**
     * Return the card url that points to the image of the card base on the index from 0 to 51
     * @param index
     * @return
     */
    private static String ImageUrl(int index){
        String imageUrl = "images/2.png";

        switch (index){
            case 0:
                imageUrl = "images/cards/ace_of_clubs.png";
                break;
            case 1:
                imageUrl = "images/cards/ace_of_diamonds.png";
                break;
            case 2:
                imageUrl = "images/cards/ace_of_hearts.png";
                break;
            case 3:
                imageUrl = "images/cards/ace_of_spades.png";
                break;
            case 4:
                imageUrl = "images/cards/2_of_clubs.png";
                break;
            case 5:
                imageUrl = "images/cards/2_of_diamonds.png";
                break;
            case 6:
                imageUrl = "images/cards/2_of_hearts.png";
                break;
            case 7:
                imageUrl = "images/cards/2_of_spades.png";
                break;
            case 8:
                imageUrl = "images/cards/3_of_clubs.png";
                break;
            case 9:
                imageUrl = "images/cards/3_of_diamonds.png";
                break;
            case 10:
                imageUrl = "images/cards/3_of_hearts.png";
                break;
            case 11:
                imageUrl = "images/cards/3_of_spades.png";
                break;
            case 12:
                imageUrl = "images/cards/4_of_clubs.png";
                break;
            case 13:
                imageUrl = "images/cards/4_of_diamonds.png";
                break;
            case 14:
                imageUrl = "images/cards/4_of_hearts.png";
                break;
            case 15:
                imageUrl = "images/cards/4_of_spades.png";
                break;
            case 16:
                imageUrl = "images/cards/5_of_clubs.png";
                break;
            case 17:
                imageUrl = "images/cards/5_of_diamonds.png";
                break;
            case 18:
                imageUrl = "images/cards/5_of_hearts.png";
                break;
            case 19:
                imageUrl = "images/cards/5_of_spades.png";
                break;
            case 20:
                imageUrl = "images/cards/6_of_clubs.png";
                break;
            case 21:
                imageUrl = "images/cards/6_of_diamonds.png";
                break;
            case 22:
                imageUrl = "images/cards/6_of_hearts.png";
                break;
            case 23:
                imageUrl = "images/cards/6_of_spades.png";
                break;
            case 24:
                imageUrl = "images/cards/7_of_clubs.png";
                break;
            case 25:
                imageUrl = "images/cards/7_of_diamonds.png";
                break;
            case 26:
                imageUrl = "images/cards/7_of_hearts.png";
                break;
            case 27:
                imageUrl = "images/cards/7_of_spades.png";
                break;
            case 28:
                imageUrl = "images/cards/8_of_clubs.png";
                break;
            case 29:
                imageUrl = "images/cards/8_of_diamonds.png";
                break;
            case 30:
                imageUrl = "images/cards/8_of_hearts.png";
                break;
            case 31:
                imageUrl = "images/cards/8_of_spades.png";
                break;
            case 32:
                imageUrl = "images/cards/9_of_clubs.png";
                break;
            case 33:
                imageUrl = "images/cards/9_of_diamonds.png";
                break;
            case 34:
                imageUrl = "images/cards/9_of_hearts.png";
                break;
            case 35:
                imageUrl = "images/cards/9_of_spades.png";
                break;
            case 36:
                imageUrl = "images/cards/10_of_clubs.png";
                break;
            case 37:
                imageUrl = "images/cards/10_of_diamonds.png";
                break;
            case 38:
                imageUrl = "images/cards/10_of_hearts.png";
                break;
            case 39:
                imageUrl = "images/cards/10_of_spades.png";
                break;
            case 40:
                imageUrl = "images/cards/jack_of_clubs.png";
                break;
            case 41:
                imageUrl = "images/cards/jack_of_diamonds.png";
                break;
            case 42:
                imageUrl = "images/cards/jack_of_hearts.png";
                break;
            case 43:
                imageUrl = "images/cards/jack_of_spades.png";
                break;
            case 44:
                imageUrl = "images/cards/queen_of_clubs.png";
                break;
            case 45:
                imageUrl = "images/cards/queen_of_diamonds.png";
                break;
            case 46:
                imageUrl = "images/cards/queen_of_hearts.png";
                break;
            case 47:
                imageUrl = "images/cards/queen_of_spades.png";
                break;
            case 48:
                imageUrl = "images/cards/king_of_clubs.png";
                break;
            case 49:
                imageUrl = "images/cards/king_of_diamonds.png";
                break;
            case 50:
                imageUrl = "images/cards/king_of_hearts.png";
                break;
            case 51:
                imageUrl = "images/cards/king_of_spades.png";
                break;
            default:
                imageUrl = "images/red_joker.png";
                break;
        }
        return  imageUrl;
    }

}
