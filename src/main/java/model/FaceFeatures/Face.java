package model.FaceFeatures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sargis on 3/30/17.
 */
public class Face {
    private List<FacePoint> facePointList;
    private HashMap<String,FacePoint> facePointHashMap;
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;
    public Face()
    {
        facePointList=new ArrayList<>();
        facePointHashMap=new HashMap<>();
    }
    public void add(FacePoint facePoint)
    {
        facePointList.add(facePoint);
        facePointHashMap.put(facePoint.getName(),facePoint);
    }
    public List<FacePoint> getFacePointList()
    {
        return facePointList;
    }
    public HashMap<String,FacePoint> getFacePointMap()
    {
        return facePointHashMap;
    }
}
