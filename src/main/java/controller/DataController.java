package controller;


import model.Data;
import model.Face.Facefeature;
import model.FaceFeatures.Face;
import model.FaceFeatures.Main;
import model.Glass.Glass;
import model.Graph.Graph;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import service.DataService;


import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sargis on 3/1/17.
 */
//@org.springframework.stereotype.Controller
@RestController

@RequestMapping("/")
public class DataController {
    @Autowired
    DataService dataService;

    @RequestMapping("")
    public String getDefault() {
        return "Default page";
    }

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public List<Data> getAllData() {
        return dataService.getAllData();
    }

    @RequestMapping(value = "/info", method = RequestMethod.POST)

    public
    @ResponseBody
    String getData(@RequestParam(value = "dataList[]") double dataList[], HttpServletResponse response) {


        response.setHeader("Access-Control-Allow-Origin", "*");
        Graph graph = new Graph(2, 1);

        graph.teachGraphXOR();
        short result = (short) graph.getdataOutput(dataList);
        response.setStatus(200);
        return "Result = " + result + ":";
    }

   // @RequestParam(value="glasstype") String glasstype,


   @RequestMapping(value = "/images", method = RequestMethod.POST) public @ResponseBody
   List<Glass> calculateAllData(MultipartHttpServletRequest request,/*, @RequestParam(value="glasstype") String glasstype, @RequestParam(value="isKid") boolean isKid,*/ HttpServletResponse response) {
       Iterator<String> itr =  request.getFileNames();
       String glasstype=request.getParameter("glasstype");
       boolean isKidSelected= Boolean.parseBoolean(request.getParameter("isKidSelected"));
       MultipartFile mpf= request.getFile(itr.next());
       byte bytes[]=null;
       try {
          bytes=mpf.getBytes();

       } catch (IOException e) {
           e.printStackTrace();
       }
       Main main =new Main(bytes);
       Face face=main.getFace();
       Facefeature facefeature = new Facefeature(face);
     //  System.out.print(glasstype+"poooooooooooooooooooooooooooooooooooooooooooooooooo");
     //   System.out.print(gender+"  "+glasstype+ "  "+isKid);
       List<Glass> glasses = facefeature.getAllImageUrl(face.getGender(), glasstype,isKidSelected);
       //face.getGender()
       response.setHeader("Access-Control-Allow-Origin", "*");
       response.setStatus(200);
  //     System.out.print(glasses.get(1).getImageUrl());
       return glasses;
    }
  }


























