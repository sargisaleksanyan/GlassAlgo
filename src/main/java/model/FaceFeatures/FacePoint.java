package model.FaceFeatures;

/**
 * Created by sargis on 3/30/17.
 */
public class FacePoint {
    private String name;
    private int x;
    private int y;

    public FacePoint(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }





}
