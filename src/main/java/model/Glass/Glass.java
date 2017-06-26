package model.Glass;

/**
 * Created by sargis on 3/21/17.
 */
public class Glass implements Comparable<Glass>{

    private String imageUrl;
    private String storeUrl;
    private String gender;
    private double heart;
    private double oval;
    private double round;
    private double square;

    public String getGlassName() {
        return glassName;
    }

    public void setGlassName(String glassName) {
        this.glassName = glassName;
    }

    private String glassName;

    public double getCorrespondence() {
        return correspondence;
    }

    private double correspondence;

    public boolean isKid() {
        return isKid;
    }

    public void setKid(boolean kid) {
        isKid = kid;
    }

    private boolean isKid=false;
    public String getGlassType() {
        return glassType;
    }

    public void setGlassType(String glassType) {
        this.glassType = glassType;
    }

    private String glassType;

    public Glass(String name,String storeUrl,String imageUrl)
    {
        glassName=name;
        this.imageUrl=imageUrl;
        this.storeUrl=storeUrl;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeart() {
        return heart;
    }

    public void setHeart(double heart) {
        this.heart = heart;
    }

    public double getOval() {
        return oval;
    }

    public void setOval(double oval) {
        this.oval = oval;
    }

    public double getRound() {
        return round;
    }

    public void setRound(double round) {
        this.round = round;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStoreUrl() {
        return storeUrl;
    }

    public void setStoreUrl(String storUrl) {
        this.storeUrl = storUrl;

    }

    @Override
    public int compareTo(Glass o) {
        if (this.correspondence > o.correspondence) return 1;
        if (this.correspondence < o.correspondence) return -1;
        return 0;
    }

    public void setCorrespondence(double correspondence) {
        this.correspondence = correspondence;
    }
}
