import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import sample.Figure;
import sample.Pen;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private Pane centerPane;
    @FXML private Canvas canvas;
    private GraphicsContext gc;
    private Pen pen;
    private Figure figure;

    public void close() {
        Platform.exit();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        canvas.widthProperty().bind(centerPane.widthProperty());
        canvas.heightProperty().bind(centerPane.heightProperty());
        canvas.widthProperty().addListener(e->draw());
        canvas.heightProperty().addListener(e->draw());
        gc = canvas.getGraphicsContext2D();
        pen = new Pen(gc, canvas);
        figure = new Figure(pen);
    }

    private void draw() {
        gc.setFill(Color.WHITE);
        gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
        figure.draw();
    }


    public void moveUp() {
        figure.move(0, 5);
        draw();
    }
    public void moveDown() {
        figure.move(0, -5);
        draw();
    }
    public void moveLeft() {
        figure.move(-5, 0);
        draw();
    }
    public void moveRight() {
        figure.move(5, 0);
        draw();
    }


    public void zoomIn() {
        figure.zoom(2);
        draw();
    }
    public void zoomOut() {
        figure.zoom(0.5);
        draw();
    }


    public void rotateLeft() {
        figure.rotate(15);
        draw();
    }
    public void rotateRight() {
        figure.rotate(-15);
        draw();
    }


    public void onRed() {
        pen.setColor(Color.RED);
        draw();
    }
    public void onYellow() {
        pen.setColor(Color.YELLOW);
        draw();
    }
    public void onGreen() {
        pen.setColor(Color.GREEN);
        draw();
    }
    public void onBlue() {
        pen.setColor(Color.BLUE);
        draw();
    }
    public void  onBlack() {
        pen.setColor(Color.BLACK);
        draw();
    }
}