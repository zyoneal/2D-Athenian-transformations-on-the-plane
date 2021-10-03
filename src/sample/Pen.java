package sample;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
public class Pen {
    private final GraphicsContext gc;
    private final Canvas canvas;

    public Pen(GraphicsContext gc, Canvas canvas) {
        this.gc = gc;
        this.canvas = canvas;
    }

    public void setColor(Color color) {
        gc.setStroke(color);
    }

    public void drawPixel(double x, double y) {
        gc.strokeLine(x, y, x, y);
    }

    public void drawLine(Point p1, Point p2){
        drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    public void drawLine(double x1, double y1, double x2, double y2){
        x1 = toScreenX(x1);
        y1 = toScreenY(y1);

        x2 = toScreenX(x2);
        y2 = toScreenY(y2);

        double dx = x2 - x1; double dy = y2 - y1;
        int incX, incY;

        if ( dx > 0 ) incX = 1;
        else if (dx < 0) {
            incX = -1;
        } else {
            incX = 0;
        }

        if (dy > 0) {
            incY = 1;
        } else {
            if (dy < 0) {
                incY = -1;
            } else {
                incY = 0;
            }
        }
        dx = Math.abs(dx);
        dy = Math.abs(dy);

        double d = Math.max(dx, dy);

        int xErr = 0;
        int yErr = 0;
        double x = x1;
        double y = y1;
        drawPixel(x,y);

        for (int i = 0; i < d; i++) {
            xErr += dx;
            yErr += dy;
            if ( xErr > d ) {
                xErr -= d;
                x += incX;
            }
            if ( yErr > d ) {
                yErr -= d;
                y += incY;
            }
            drawPixel(x,y);

        }
    }

    private int toScreenX(double x) {
        double minX = -65;
        double maxX = 65;
        return (int) (canvas.getWidth() * (x - minX) / (maxX - minX));
    }
    private int toScreenY(double y) {
        double minY = -65;
        double maxY = 65;
        return (int) (canvas.getHeight() * (1 - (y - minY) / (maxY - minY)));
    }
}
