package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TilePane gameField;
    private Position playerPosition = new Position(28, 7);

    private Image playerImage = new Image("file:resources/player.png");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (int row = 0; row < 30; row++) {
            for (int column = 0; column < 15; column++) {
                Rectangle rectangle = new Rectangle(20, 20);
                if (row == playerPosition.getRow() && column == playerPosition.getColumn()) {
                    rectangle.setFill(new ImagePattern(playerImage));
                }
                gameField.getChildren().add(rectangle);
            }
        }
    }

    @FXML
    public void moveSpaceship(KeyEvent event) {
        getCell(playerPosition).setFill(Color.BLACK);
        if (event.getCode() == KeyCode.LEFT) {
            playerPosition.moveLeft();
        } else if (event.getCode() == KeyCode.RIGHT) {
            playerPosition.moveRight();
        }
        getCell(playerPosition).setFill(new ImagePattern(playerImage));
        System.out.println(playerPosition);
    }

    private Rectangle getCell(Position position) {
        return (Rectangle) gameField.getChildren().get(
          position.getRow() * 15 + position.getColumn()
        );
    }

}
