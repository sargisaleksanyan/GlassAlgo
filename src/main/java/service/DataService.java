package service;

import model.Data;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sargis on 3/1/17.
 */
@Service
public class DataService {

    List<Data> dataList;

    public List<Data> getAllData()
    {
        return makeStudentsList();
    }
    public List<Data> makeStudentsList()
    {
        Data date1=new Data(10,5);
        date1.setName("TRA");
        Data date2=new Data(10,5);
        date2.setName("REC");
        Data date3=new Data(10,5);
        date3.setName("RECYLE");
        Data date4=new Data(10,5);
        date4.setName("SHAPE");
        List<Data> list=new ArrayList<>();
        list.add(date1);
        list.add(date2);
        list.add(date3);
        list.add(date4);
        return list;
    }
}
