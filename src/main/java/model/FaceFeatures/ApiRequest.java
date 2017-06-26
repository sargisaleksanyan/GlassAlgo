package model.FaceFeatures;

import javax.net.ssl.SSLException;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;

/**
 * Created by sargis on 3/28/17.
 */
public class ApiRequest {
 //  private final String API_KEY=
    private  byte[] buff;
    public ApiRequest(byte[] buff)
    {
        this.buff=buff;
    }
    public String getFaceParams() {


        String url = "https://api-us.faceplusplus.com/facepp/v3/detect";
        String str=null;
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, byte[]> byteMap = new HashMap<>();
        HashMap<String, Integer> landMark = new HashMap<>();
        HashMap<String, String> attribute = new HashMap<>();
        map.put("api_key", "Ik6OinkXxVJfO3jslbOFZBi9SN6JZDBd");
        map.put("api_secret", "fkmwKx9tvSgaBtkUORGOTasHYN5_KOmb");
        landMark.put("return_landmark", 1);
        String attribs[] = {"gender", "age", "smile"};
        attribute.put("return_attributes", "gender");
        byteMap.put("image_file", buff);
        try {
           String bacd = post(url, map, byteMap, landMark, attribute);
            str = new String(bacd);
           // System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }


    private final static int CONNECT_TIME_OUT = 100000;
    private final static int READ_OUT_TIME =100000;
    private static String boundaryString = getBoundary();
    protected static String post(String url, HashMap<String, String> map, HashMap<String, byte[]> fileMap,  HashMap<String, Integer>  landmark, HashMap<String, String>  attribute) throws Exception {
        HttpURLConnection conne;
        URL url1 = new URL(url);
        conne = (HttpURLConnection) url1.openConnection();
        conne.setDoOutput(true);
        conne.setUseCaches(false);
        conne.setRequestMethod("POST");
        conne.setConnectTimeout(CONNECT_TIME_OUT);
        conne.setReadTimeout(READ_OUT_TIME);
        conne.setRequestProperty("accept", "*/*");
        conne.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundaryString);
        conne.setRequestProperty("connection", "Keep-Alive");
        conne.setRequestProperty("user-agent", "Mozilla/4.0 (compatible;MSIE 6.0;Windows NT 5.1;SV1)");
        DataOutputStream obos = new DataOutputStream(conne.getOutputStream());
        Iterator iter = map.entrySet().iterator();
        Iterator iter1 = landmark.entrySet().iterator();
        Iterator iter2 = attribute.entrySet().iterator();
        writeToFile(obos,iter);
        writeToFileInt(obos,iter1);
        writeToFile(obos,iter2);
        if (fileMap != null && fileMap.size() > 0) {
            Iterator fileIter = fileMap.entrySet().iterator();
            while (fileIter.hasNext()) {
                Map.Entry<String, byte[]> fileEntry = (Map.Entry<String, byte[]>) fileIter.next();
                obos.writeBytes("--" + boundaryString + "\r\n");
                obos.writeBytes("Content-Disposition: form-data; name=\"" + fileEntry.getKey()
                        + "\"; filename=\"" + encode(" ") + "\"\r\n");
                obos.writeBytes("\r\n");
                obos.write(fileEntry.getValue());
                obos.writeBytes("\r\n");
            }
        }
        obos.writeBytes("--" + boundaryString + "--" + "\r\n");
        obos.writeBytes("\r\n");
        obos.flush();
        obos.close();
        InputStream ins = null;
        int code = conne.getResponseCode();
        try {
            if (code == 200) {
                ins = conne.getInputStream();
            } else {
                ins = conne.getErrorStream();
            }
        } catch (SSLException e) {
            e.printStackTrace();
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buff = new byte[4096];
        int len;
        String inputStreamString = new Scanner(ins, "UTF-8").useDelimiter("\\A").next();
        return inputStreamString;

    }
    public static  void writeToFile(DataOutputStream obos,Iterator iter) throws IOException {
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry) iter.next();
            String key = entry.getKey();
            String value = entry.getValue();
            obos.writeBytes("--" + boundaryString + "\r\n");
            obos.writeBytes("Content-Disposition: form-data; name=\"" + key
                    + "\"\r\n");
            obos.writeBytes("\r\n");
            obos.writeBytes(value + "\r\n");
        }
    }
    public static  void writeToFileInt(DataOutputStream obos,Iterator iter) throws IOException {
        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry) iter.next();
            String key = entry.getKey();
            int value = entry.getValue();
            obos.writeBytes("--" + boundaryString + "\r\n");
            obos.writeBytes("Content-Disposition: form-data; name=\"" + key
                    + "\"\r\n");
            obos.writeBytes("\r\n");
            obos.writeBytes(value + "\r\n");
        }
    }
    private static String getBoundary() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < 32; ++i) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_-".charAt(random.nextInt("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_".length())));
        }
        return sb.toString();
    }
    private static String encode(String value) throws Exception{
        return URLEncoder.encode(value, "UTF-8");
    }

  

}


