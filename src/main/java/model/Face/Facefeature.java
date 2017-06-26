package model.Face;

import model.FaceFeatures.Face;
import model.FaceFeatures.FacePoint;
import model.FaceFeatures.FacePoints;
import model.Gender;
import model.Glass.AvailableGlass;
import model.Glass.Glass;
import model.glassType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public class Facefeature {
    private int[] facePoints;
    private Face face;
    public static final String OvalFace="oval";
    public static final String RoundFace="round";
    public static final String SquareFace="square";
    public static final String HeartFace="heart";
    public static final String Women="Female";
    public static final String Men="Male";
    public static final String Unisex="both";
    public static final String Sunglass="sunglass";
    public static final String Eyeglass="eyeglass";
    AvailableGlass availableGlass;
    List<Glass> glassList;

    public Facefeature(Face face)
    {
        this.face=face;
        AvailableGlass availableGlass=new AvailableGlass();
        glassList=availableGlass.makeGlassCollection();
    }
    private  double calcDistance(double initialX,double initialY,double targetX,double targetY)
    {
        return Math.sqrt(Math.pow((targetX-initialX),2)+Math.pow((targetY-initialY),2));
    }

  private double param_one()
  {
      HashMap<String,FacePoint> facePointHashMap=face.getFacePointMap();
      double one_thirteen=calcDistance(facePointHashMap.get(FacePoints.contour_left2).getX(),
              facePointHashMap.get(FacePoints.contour_left2).getY(),
              facePointHashMap.get(FacePoints.contour_right2).getX(),
              facePointHashMap.get(FacePoints.contour_right2).getY());
      double one_seven=calcDistance(
              facePointHashMap.get(FacePoints.contour_left2).getX(),
              facePointHashMap.get(FacePoints.contour_left2).getY(),
              facePointHashMap.get(FacePoints.contour_chin).getX(),
              facePointHashMap.get(FacePoints.contour_chin).getY());
      return one_thirteen/one_seven;
  }
    private double param_three()
    {

        HashMap<String,FacePoint> facePointHashMap=face.getFacePointMap();
        double []params=new double[2];
        double one_thirteen=calcDistance(facePointHashMap.get(FacePoints.contour_left2).getX(),
                facePointHashMap.get(FacePoints.contour_left2).getY(),
                facePointHashMap.get(FacePoints.contour_right2).getX(),
                facePointHashMap.get(FacePoints.contour_right2).getY());;
        double fore_ten=/*calcDistance(facePoints[8],facePoints[9],facePoints[20],facePoints[21]);*/
        calcDistance(
                facePointHashMap.get(FacePoints.contour_left7).getX(),
                facePointHashMap.get(FacePoints.contour_left7).getY(),
                facePointHashMap.get(FacePoints.contour_right7).getX(),
                facePointHashMap.get(FacePoints.contour_right7).getY());
        double five_nine=/*calcDistance(facePoints[10],facePoints[11],facePoints[18],facePoints[19]);*/
        calcDistance(
                facePointHashMap.get(FacePoints.contour_left8).getX(),
                facePointHashMap.get(FacePoints.contour_left8).getY(),
                facePointHashMap.get(FacePoints.contour_right8).getX(),
                facePointHashMap.get(FacePoints.contour_right8).getY());
        params[0]=one_thirteen/fore_ten;
        params[1]=one_thirteen/five_nine;
        return params[0];
    }

    public Glass getImageUrl(String gender, String eyeweartype,boolean isKid) {
        String facetype = FaceShapeParam3_1();
        Glass glass = null;
        if(isKid)
        {
          glass=getKidGlass().get(0);
            return glass;
        }
       if (gender.equals(Women)) {
            if (eyeweartype.equals(Sunglass)) {
                  glass=getWomenSunGlass(facetype).get(0);
            } else if(eyeweartype.equals(Eyeglass)){
                glass = getWomenGlass(facetype).get(0);
            }
           return glass;
        }

        if (gender.equals(Men)) {
            if (eyeweartype.equals(Sunglass)) {
                glass=getMenSunGlass(facetype).get(0);
            }
            else if(eyeweartype.equals(Eyeglass)){
                glass = getMenGlass(facetype).get(0);
            }
            return glass;
        }

        if (gender.equals(Unisex)) {
            if (eyeweartype.equals(Sunglass)) {
                glass=getUnisexSunGlass(facetype).get(0);
            }
            else if(eyeweartype.equals(Eyeglass)){
                glass = getUnisexGlass(facetype).get(0);
            }
            return glass;
        }
        return glass;
    }

    public List<Glass> getAllImageUrl(String gender, String eyeweartype, boolean isKid) {
        List<Glass> glasses = new ArrayList<Glass>();
        String facetype = FaceShapeParam3_1();
        if(isKid)
        {
            glasses=getKidGlass();
            return glasses;
        }
        if (gender.equals(Women)) {
            if (eyeweartype.equals(Sunglass)) {
                glasses=getWomenSunGlass(facetype);
            } else if(eyeweartype.equals(Eyeglass)){
                glasses = getWomenGlass(facetype);
            }
            else{
                List<Glass> sunGlasses=getWomenSunGlass(facetype);
                List<Glass> eyeClasses=getWomenGlass(facetype);
                glasses.addAll(sunGlasses);
                glasses.addAll(eyeClasses);
            }
            return glasses;
        }

        if (gender.equals(Men)) {
            if (eyeweartype.equals(Sunglass)) {
                glasses=getMenSunGlass(facetype);
            }
            else if(eyeweartype.equals(Eyeglass)){
                glasses = getMenGlass(facetype);
            }
            else{
                List<Glass> sunGlasses=getMenSunGlass(facetype);
                List<Glass> eyeClasses=getMenGlass(facetype);
                glasses.addAll(sunGlasses);
                glasses.addAll(eyeClasses);
            }
            return glasses;
        }


        if (gender.equals(Unisex)) {
            if (eyeweartype.equals(Sunglass)) {
                glasses=getUnisexSunGlass(facetype);
            }
            else if(eyeweartype.equals(Eyeglass)){
                glasses = getUnisexGlass(facetype);
            }
            else{
                List<Glass> sunGlasses=getUnisexSunGlass(Sunglass);
                List<Glass> eyeClasses=getUnisexGlass(Eyeglass);
                glasses.addAll(sunGlasses);
                glasses.addAll(eyeClasses);
            }
            // glass= getUnisexGlass(facetype).get(0);
            return glasses;
        }
       // printAll(glasses);
        return glasses;
    }

    private List<Glass> getKidGlass()
    {
        List<Glass> glasses = new ArrayList<Glass>();
        String facetype = FaceShapeParam3_1();
        for (int i=0;i<glassList.size();i++)
        {
            if(glassList.get(i).isKid())
            {
                glasses.add(glassList.get(i));
            }
        }
        // Sort according to type correspondence
        double paramOne = param_one();
        double paramThree = param_three();
        for (int i=0;i<glasses.size();i++)
        {
            glasses.get(i).setCorrespondence(countCorrespondence(paramOne, paramThree, glassList.get(i).getHeart(), glassList.get(i).getOval(), glassList.get(i).getRound(), glassList.get(i).getSquare()));
        }
        Collections.sort(glasses);
        printAll(glasses);
        return glasses;

    }

    // should waive between 0.0 till max

    private double countCorrespondence(double faceParamOne, double faceParamThree, double glassHeart, double glassOval, double glassRound, double glassSquare) {
        double answer = 0.0;
        double faceHeart, faceOval, faceRound, faceSquare;
        double deltaP1 = faceParamOne-1.17;
        double deltaP1percent = deltaP1/0.13;
        double deltaP3;
        if (deltaP1>0){
            deltaP3 = faceParamThree-1.35;
        }
        else{
            deltaP3 = faceParamThree-1.405;
        }
        double deltaP3percent = deltaP3/0.065;

        faceHeart = (-deltaP1percent) + deltaP3percent;
        faceOval = (-deltaP1percent) - deltaP3percent;
        faceRound = deltaP1percent + deltaP3percent;
        faceSquare = deltaP1percent - deltaP3percent;

        // Normalize the computed face parameters to get the max 1.0 and min 0.0
        double max = Math.max(faceHeart, faceOval);
        max = Math.max(max, faceRound);
        max = Math.max(max, faceSquare);

        double min = Math.min(faceHeart, faceOval);
        min = Math.min(min, faceRound);
        min = Math.min(min, faceSquare);

        double distance = max - min;
        faceHeart = (faceHeart - min)/distance;
        faceOval = (faceOval - min)/distance;
        faceRound = (faceRound - min)/distance;
        faceSquare = (faceSquare - min)/distance;

        // Normalize the glasses parameters to get the max 1.0 and min 0.0
        max = Math.max(glassHeart, glassOval);
        max = Math.max(max, glassRound);
        max = Math.max(max, faceRound);

        min = Math.min(glassHeart, glassOval);
        min = Math.min(min, glassRound);
        min = Math.min(min, faceRound);

        distance = max - min;
        glassHeart = (glassHeart - min)/distance;
        glassOval = (glassOval - min)/distance;
        glassRound = (glassRound - min)/distance;
        faceRound = (faceRound - min)/distance;

        //answer = Math.abs(faceHeart-glassHeart) + Math.abs(faceOval-glassOval) +Math.abs(faceRound-glassRound) +Math.abs(faceSquare-glassSquare);
        answer = Math.sqrt(Math.pow((faceHeart-glassHeart), 2) + Math.pow((faceOval-glassOval), 2) +Math.pow((faceRound-glassRound), 2) +Math.pow((faceSquare-glassSquare), 2));
     //   System.out.println("#Type | "+"faceHeart = "+String.format("%.2f", faceHeart)+" | faceOval = "+String.format("%.2f", faceOval) + " | faceRound  = "+String.format("%.2f", faceRound)+" | faceSquare = "+String.format("%.2f", faceSquare)+" | !correspondence = "+String.format("%.2f", answer));
        return answer;
    }
    private List<Glass> getUnisexGlass(String facetype)
    {
        List<Glass> glasses = new ArrayList<Glass>();
        for (int i=0;i<glassList.size();i++) {
            if (glassList.get(i).getGender()!= null) {
                if (glassList.get(i).getGender().equals(String.valueOf(Gender.UNISEX)) && glassList.get(i).getGlassType().equals(String.valueOf(glassType.eyeglass))) {
                    glasses.add(glassList.get(i));
                }
            }
        }
        // Sort according to type correspondence
        double paramOne = param_one();
        double paramThree = param_three();
        for (int i=0;i<glasses.size();i++)
        {
            glasses.get(i).setCorrespondence(countCorrespondence(paramOne, paramThree, glassList.get(i).getHeart(), glassList.get(i).getOval(), glassList.get(i).getRound(), glassList.get(i).getSquare()));
        }
        Collections.sort(glasses);
        printAll(glasses);
        return glasses;
    }
    private List<Glass> getUnisexSunGlass(String facetype)
    {
        List<Glass> glasses = new ArrayList<Glass>();
        for (int i=0;i<glassList.size();i++) {
            if (glassList.get(i).getGender()!= null) {
                if (glassList.get(i).getGender().equals(String.valueOf(Gender.UNISEX)) && glassList.get(i).getGlassType().equals(String.valueOf(glassType.sunglass)) ){
                    glasses.add(glassList.get(i));
                }
            }
        }
        // Sort according to type correspondence
        double paramOne = param_one();
        double paramThree = param_three();
        for (int i=0;i<glasses.size();i++)
        {
            glasses.get(i).setCorrespondence(countCorrespondence(paramOne, paramThree, glassList.get(i).getHeart(), glassList.get(i).getOval(), glassList.get(i).getRound(), glassList.get(i).getSquare()));
        }
        Collections.sort(glasses);
        printAll(glasses);
        return glasses;
    }
    private List<Glass> getWomenGlass(String facetype)
    {
        List<Glass> glasses = new ArrayList<Glass>();
        for (int i=0;i<glassList.size();i++) {
            if (glassList.get(i).getGender() != null && glassList.get(i).getGlassType()!=null) {
                if (glassList.get(i).getGender().equals(String.valueOf(Gender.WOMEN)) && glassList.get(i).getGlassType().equals(String.valueOf(glassType.eyeglass))) {
                    glasses.add(glassList.get(i));
                }
            }
        }
        // Sort according to type correspondence
        double paramOne = param_one();
        double paramThree = param_three();
        for (int i=0;i<glasses.size();i++)
        {
            glasses.get(i).setCorrespondence(countCorrespondence(paramOne, paramThree, glassList.get(i).getHeart(), glassList.get(i).getOval(), glassList.get(i).getRound(), glassList.get(i).getSquare()));
        }
        Collections.sort(glasses);
        printAll(glasses);
        return glasses;
    }
    private List<Glass> getWomenSunGlass(String facetype)
    {
        List<Glass> glasses = new ArrayList<Glass>();
        for (int i=0;i<glassList.size();i++) {
            if (glassList.get(i).getGender() != null && glassList.get(i).getGlassType()!=null) {
                if (glassList.get(i).getGender().equals(String.valueOf(Gender.WOMEN)) && glassList.get(i).getGlassType().equals(String.valueOf(glassType.sunglass))) {
                    glasses.add(glassList.get(i));
                }
            }
        }
        // Sort according to type correspondence
        double paramOne = param_one();
        double paramThree = param_three();
        for (int i=0;i<glasses.size();i++)
        {
            glasses.get(i).setCorrespondence(countCorrespondence(paramOne, paramThree, glassList.get(i).getHeart(), glassList.get(i).getOval(), glassList.get(i).getRound(), glassList.get(i).getSquare()));
        }
        Collections.sort(glasses);
        printAll(glasses);
        return glasses;
    }
    private List<Glass> getMenGlass(String facetype)
    {
        List<Glass> glasses = new ArrayList<Glass>();
        for (int i=0;i<glassList.size();i++) {
            if (glassList.get(i).getGender() != null && glassList.get(i).getGlassType()!=null) {
                if (glassList.get(i).getGender().equals(String.valueOf(Gender.MAN)) && glassList.get(i).getGlassType().equals(String.valueOf(glassType.eyeglass))) {
                    glasses.add(glassList.get(i));
                }
            }
        }
        // Sort according to type correspondence
        double paramOne = param_one();
        double paramThree = param_three();
        for (int i=0;i<glasses.size();i++)
        {
            glasses.get(i).setCorrespondence(countCorrespondence(paramOne, paramThree, glassList.get(i).getHeart(), glassList.get(i).getOval(), glassList.get(i).getRound(), glassList.get(i).getSquare()));
        }
        printAll(glasses);
        Collections.sort(glasses);
       // printAll(glasses);
        return glasses;
    }
    private List<Glass> getMenSunGlass(String facetype)
    {
        List<Glass> glasses = new ArrayList<Glass>();
        for (int i=0;i<glassList.size();i++) {
            if (glassList.get(i).getGender() != null && glassList.get(i).getGlassType()!=null) {
                if (glassList.get(i).getGender().equals(String.valueOf(Gender.MAN)) && glassList.get(i).getGlassType().equals(String.valueOf(glassType.sunglass))) {
                    glasses.add(glassList.get(i));
                }
            }
        }
        // Sort according to type correspondence
        double paramOne = param_one();
        double paramThree = param_three();
        for (int i=0;i<glasses.size();i++)
        {
            glasses.get(i).setCorrespondence(countCorrespondence(paramOne, paramThree, glassList.get(i).getHeart(), glassList.get(i).getOval(), glassList.get(i).getRound(), glassList.get(i).getSquare()));
        }
        Collections.sort(glasses);
        printAll(glasses);
        return glasses;
    }
   public void printAll( List<Glass> glasses)
   {
       for(int i=0;i<glasses.size();i++)
       {
         //  System.out.println("#" + i + " | !correspondence = "+String.format("%.2f", glasses.get(i).getCorrespondence())+" | name : "+glasses.get(i).getGlassName());

       }
   }
    private String FaceShapeParam3_1()
    {
        double paramOne = param_one();
        double paramThree = param_three();
        String type="";
     if(paramThree>1.43)
     {
         type=HeartFace;
     }
     else if(paramThree<1.43&&paramThree>1.4)
     {
         type=OvalFace;
     }
     else if(paramThree<1.4&& paramThree>1.36)
     {
         type=RoundFace;
     }
     else {
         type=SquareFace;
     }
    // System.out.println("Face shape params are : Param 1 = " + paramOne + ", param 3 = " + paramThree);
     return type;
    }

}
