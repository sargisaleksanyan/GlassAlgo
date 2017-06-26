package model.FaceFeatures;

import javax.json.*;
import java.io.*;
import java.util.List;


/**
 * Created by sargis on 3/28/17.
 */
public class Main {
  public static final String Faces="faces";
  public static final String landmark="landmark";
  private byte[] bytes;
    public Main(byte[] bytes)
    {
     this.bytes=bytes;
    }
    public Face getFace() {
        Face face=new Face();
        File file = new File("Heart.jpg");
        //bytes = getBytesFromFile(file);
        ApiRequest faceParams=new ApiRequest(bytes);
        String json=faceParams.getFaceParams();

      //  System.out.print(json);
        Reader reader=new StringReader(json);
        JsonReader jsonReader= Json.createReader(reader);
        JsonObject jsonObject=jsonReader.readObject();

         JsonArray facesArray=jsonObject.getJsonArray(Faces);
        // System.out.println(jsonObject.size());
         JsonObject jsonArray=facesArray.getJsonObject(0);
         JsonObject facePoints=jsonArray.getJsonObject(landmark);
         FacePoints ft=new FacePoints();
         List<String> facePointNames=ft.getFacepointNames();
         JsonObject genderValue=jsonArray.getJsonObject("attributes").getJsonObject("gender");
          String gender=genderValue.getString("value");
         face.setGender(gender);
         for(int i=0;i<facePointNames.size();i++)
         {
            // JsonObject jjjjjj=facePoints.getJsonObject("mouth_upper_lip_left_contour2");

             JsonObject object=facePoints.getJsonObject(facePointNames.get(i));
             int x=object.getInt("x");
             int y=object.getInt("y");
             FacePoint facePoint=new FacePoint(facePointNames.get(i),x,y);
             face.add(facePoint);
             //System.out.println(" #  "+i+" " +facePointNames.get(i)+ " X "+x+" Y "+y);
           //  int n=55;
         }

         return face;
    }

}
