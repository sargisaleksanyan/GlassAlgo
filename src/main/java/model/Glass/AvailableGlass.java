package model.Glass;

import model.Gender;
import model.glassType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sargis on 3/21/17.
 */
public class AvailableGlass {

    private List<Glass> glassCollection;
    public AvailableGlass()
    {
        glassCollection = new ArrayList<>();
    }
    public void addGlass(Glass glass)
    {
        glassCollection.add(glass);
    }
    public List<Glass> getGlassCollection()
    {
        return glassCollection;
    }
    public List<Glass> makeGlassCollection() {
        //addGlass(makeGlass("");
        addGlass(makeGlass("ADIDAS A011","https://glassvue.com/store/index.php?route=product/product&path=64&product_id=43",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/4593_f-540x660.jpg", String.valueOf(Gender.MAN),
                0.85, 0, 0.75, 0, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("ARMANI EXCHANGE AX1012","https://glassvue.com/store/index.php?route=product/product&path=64&product_id=42",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/4428_f-540x660.jpg", String.valueOf(Gender.MAN), 0.7, 0, 0, 0.85, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("ELLIOT","https://glassvue.com/store/index.php?route=product/product&path=64&product_id=47",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/31-1863_f-540x660.jpg", String.valueOf(Gender.MAN), 0, 0.9, 0.7, 0, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("GENIUS","https://glassvue.com/store/index.php?route=product/product&path=64&product_id=46",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/31-1866_f-540x660.jpg", String.valueOf(Gender.MAN), 0.7, 0, 0, 0.9, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("MUSE M8090","https://glassvue.com/store/index.php?route=product/product&path=64&product_id=44",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/9178_f_1-540x660.jpg", String.valueOf(Gender.MAN), 0.5, 0.2, 0.2, 0.65, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("RAY-BAN","https://glassvue.com/store/index.php?route=product/product&path=64&product_id=48",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/3846_f-540x660.jpg", String.valueOf(Gender.MAN), 0.65, 0, 0.2, 0.75, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("REVEL WILLOW ","https://glassvue.com/store/index.php?route=product/product&path=64&product_id=45",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/1796_f-540x660.jpg", String.valueOf(Gender.MAN), 0.6, 0, 0, 0.75, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("WESTON","https://glassvue.com/store/index.php?route=product/product&path=64&product_id=30",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/1996_f_1-540x660.jpg", String.valueOf(Gender.MAN), 0.65, 0.4, 0, 0.75, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("FREUD" ,"https://glassvue.com/store/index.php?route=product/product&path=64&product_id=69",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/31-1887_f-540x660.jpg", String.valueOf(Gender.MAN), 0.65, 0.5, 0, 0.75, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("JASON","https://glassvue.com/store/index.php?route=product/product&path=64&product_id=70",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/1824_f_3-540x660.jpg", String.valueOf(Gender.MAN), 0.4, 0.3, 0.5, 0, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("RAY BARRY","https://glassvue.com/store/index.php?route=product/product&path=65&product_id=77",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/6825_f-540x660.jpg", String.valueOf(Gender.MAN), 0.4, 0.9, 0.3, 0.7, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("RAY B05900","https://glassvue.com/store/index.php?route=product/product&path=65&product_id=51",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/6544_f_2_-540x660.jpg", String.valueOf(Gender.MAN), 0.8, 0.8, 0.9, 0, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("RAY B06900 BLACK (NON-RX-ABLE)","https://glassvue.com/store/index.php?route=product/product&path=63&product_id=50",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/6560_f-540x660.jpg", String.valueOf(Gender.MAN), 0.85, 0, 0.3, 0, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("RAY-BAN 3025","https://glassvue.com/store/index.php?route=product/product&path=63&product_id=52",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/6705-f_2-540x660.jpg", String.valueOf(Gender.MAN), 0.3, 0.8, 0.3, 0.5, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("RAY-BAN 3025 XL","https://glassvue.com/store/index.php?route=product/product&path=63&product_id=54",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/6707-f_2-540x660.jpg", String.valueOf(Gender.MAN), 0.85, 0, 0.3, 0, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("REVEL BLYTHE","https://glassvue.com/store/index.php?route=product/product&path=63&product_id=53",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/6902_f-540x660.jpg", String.valueOf(Gender.MAN), 0.2, 0.9, 0, 0.5, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("WISDOM","https://glassvue.com/store/index.php?route=product/product&path=64&product_id=49",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/31-1873_f-540x660.jpg", String.valueOf(Gender.MAN), 0.5, 0, 0.85, 0.2, String.valueOf(glassType.eyeglass)));
        //////////////////-----------------
        addGlass(makeGlass("AMELIA E. CRESSIDA","https://glassvue.com/store/index.php?route=product/product&path=27&product_id=56",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/10n222_f-540x660.jpg", String.valueOf(Gender.WOMEN), 0.65, 0.5, 0, 0.75, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("FREUD","https://glassvue.com/store/index.php?route=product/product&path=27&product_id=69",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/31-1887_f-540x660.jpg", String.valueOf(Gender.WOMEN), 0.75, 0.85, 0, 0.5, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("JASON","https://glassvue.com/store/index.php?route=product/product&path=27&product_id=78",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/31-1825_f-540x660.jpg", String.valueOf(Gender.WOMEN), 0.85, 0.3, 0.5, 0, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("JASON","https://glassvue.com/store/index.php?route=product/product&path=27&product_id=70",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/1824_f_3-540x660.jpg", String.valueOf(Gender.WOMEN), 0.5, 0.75, 0.5, 0, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("MUSE BLEM","https://glassvue.com/store/index.php?route=product/product&path=27&product_id=57",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/9149_f-540x660.jpg", String.valueOf(Gender.WOMEN), 0.5, 0.65, 0, 0.2, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("RAY-BAN 7053","https://glassvue.com/store/index.php?route=product/product&path=27&product_id=58",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/3838_f-540x660.jpg", String.valueOf(Gender.WOMEN), 0.5, 0.35, 0.2, 0, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("REVEL LUCIEN","https://glassvue.com/store/index.php?route=product/product&path=27&product_id=60",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/10n099_f-540x660.jpg", String.valueOf(Gender.WOMEN), 0.45, 0.5, 0, 0.2, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("SAM","https://glassvue.com/store/index.php?route=product/product&path=27&product_id=79",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/1940_f-540x660.jpg", String.valueOf(Gender.WOMEN), 0.75, 0.5, 0.4, 0.9, String.valueOf(glassType.eyeglass)));
        /////
        addGlass(makeGlass("CAROLINA LEMKE CL1306","https://glassvue.com/store/index.php?route=product/product&path=26&product_id=73",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/7342_f-540x660.jpg", String.valueOf(Gender. MAN), 0.1, 0.5, 0.5, 0.1, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("CAROLONA LEMKE CL2401","https://glassvue.com/store/index.php?route=product/product&path=26&product_id=71",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/7326_f-540x660.jpg", String.valueOf(Gender. MAN), 0.5, 0.2, 0, 0.75, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("MUSE M CLASSIC","https://glassvue.com/store/index.php?route=product/product&path=26&product_id=55",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/9147_sun_f-540x660.jpg", String.valueOf(Gender.WOMEN), 0.75, 0.5, 0.5, 0.2, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("OAKLEY CAVEAT","https://glassvue.com/store/index.php?route=product/product&path=26&product_id=72",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/6849_f-540x660.jpg", String.valueOf(Gender.WOMEN), 0.3, 0.65, 0, 0.7, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("RAY BARRY","https://glassvue.com/store/index.php?route=product/product&path=26&product_id=76",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/6555_f_2_-540x660.jpg", String.valueOf(Gender.WOMEN), 0.2, 0.7, 0, 0.65, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("RAY BARRY","https://glassvue.com/store/index.php?route=product/product&path=26&product_id=77",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/6825_f-540x660.jpg", String.valueOf(Gender.WOMEN), 0.5, 0.2, 0.2, 0.75, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("RAY BO1800","https://glassvue.com/store/index.php?route=product/product&path=26&product_id=74",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/6499_f-540x660.jpg", String.valueOf(Gender.WOMEN), 0.2, 0.7, 0.6, 0.3, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("RAY BO8301 CLEAR W/BLUE (NON-RX-ABLE)","https://glassvue.com/store/index.php?route=product/product&path=26&product_id=75",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/6555_f_2_-540x660.jpg", String.valueOf(Gender.WOMEN), 0, 0.7, 0, 0.85, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("RAY-BAN 3447","https://glassvue.com/store/index.php?route=product/product&path=26&product_id=61",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/6874_f-540x660.jpg", String.valueOf(Gender.WOMEN), 0.6, 0.3, 0, 0.85, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("RAY-BAN 4171 ERIKA","https://glassvue.com/store/index.php?route=product/product&path=26&product_id=62",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/46-6720_f-540x660.jpg", String.valueOf(Gender.WOMEN), 0.65, 0.2, 0, 0.75, String.valueOf(glassType.sunglass)));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        addGlass(makeGlass("WESTON","https://glassvue.com/store/index.php?route=product/product&path=64&product_id=30",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/1996_f_1-540x660.jpg", String.valueOf(Gender.UNISEX), 0.65, 0.4, 0, 0.75,  String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("FREUD","https://glassvue.com/store/index.php?route=product/product&path=64&product_id=69",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/31-1887_f-540x660.jpg", String.valueOf(Gender.UNISEX), 0.65, 0.4, 0, 0.75,String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("SAM","https://glassvue.com/store/index.php?route=product/product&path=64&product_id=79",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/1940_f-540x660.jpg", String.valueOf(Gender.UNISEX), 0.75, 0.5, 0.4, 0.9, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("MUSE M CLASSIC","https://glassvue.com/store/index.php?route=product/product&path=20&product_id=55",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/9147_sun_f-540x660.jpg", String.valueOf(Gender.UNISEX),0.75, 0.5, 0.5, 0.2 , String.valueOf(glassType.sunglass)));
        ////////////////////////////////////////////////////////////////////////pppppppppppppppppppppppppppppppppppppppppppp
        addGlass(makeGlass("RAY BO8301 CLEAR W/BLUE (NON-RX-ABLE)","https://glassvue.com/store/index.php?route=product/product&path=20&product_id=75",

                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/6555_f_2_-540x660.jpg", String.valueOf(Gender.UNISEX), 0.2, 0.7, 0, 0.2, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("JASON","https://glassvue.com/store/index.php?route=product/product&path=20&product_id=78",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/31-1825_f-540x660.jpg", String.valueOf(Gender.UNISEX), 0.9, 0.3, 0.5, 0, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("OAKLEY CAVEAT","https://glassvue.com/store/index.php?route=product/product&path=20&product_id=72",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/6849_f-540x660.jpg", String.valueOf(Gender.UNISEX), 0.3, 0.65, 0, 0.7, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("CAROLINA LAMKE CL2401","https://glassvue.com/store/index.php?route=product/product&path=20&product_id=71",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/7326_f-540x660.jpg", String.valueOf(Gender.UNISEX),0.5, 0.2, 0, 0.75, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("RAY-BAN 3447","https://glassvue.com/store/index.php?route=product/product&path=20&product_id=61",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/6874_f-540x660.jpg", String.valueOf(Gender.UNISEX), 0.6, 0.3, 0, 0.85, String.valueOf(glassType.sunglass)));

        addGlass(makeGlass("MUSE M8090","https://glassvue.com/store/index.php?route=product/product&path=63&product_id=44",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/9178_f_1-540x660.jpg", String.valueOf(Gender.UNISEX), 0.5, 0.2, 0.2, 0.65, String.valueOf(glassType.eyeglass)));
        addGlass(makeGlass("RAY BO6900 BLACK (NON-RX-ABLE)","https://glassvue.com/store/index.php?route=product/product&path=63&product_id=50",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Men/6560_f-540x660.jpg", String.valueOf(Gender.UNISEX), 0.85, 0, 0.3, 0, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("RAY-BAN 4170 ERIKA","https://glassvue.com/store/index.php?route=product/product&path=26&product_id=62",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/46-6720_f-540x660.jpg", String.valueOf(Gender.UNISEX), 0.65, 0.2, 0, 0.75, String.valueOf(glassType.sunglass)));
        addGlass(makeGlass("RAY BARRY","https://glassvue.com/store/index.php?route=product/product&path=65&product_id=77",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Women/6825_f-540x660.jpg", String.valueOf(Gender.UNISEX),0.65, 0.2, 0, 0.9, String.valueOf(glassType.sunglass)));

        addGlass(makeGlass("EMERSON","https://glassvue.com/store/index.php?route=product/product&path=46&product_id=63",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Kids/10125_f-540x660.jpg",0.75,0.5,0.2,0 ,true));
        addGlass(makeGlass("EVA BLACK W/RED","https://glassvue.com/store/index.php?route=product/product&path=46&product_id=68",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Kids/10106_f-540x660.jpg",0.3,0.2,0.75,0 ,true));
        addGlass(makeGlass("HARRITE","https://glassvue.com/store/index.php?route=product/product&path=46&product_id=67",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Kids/10100_f-540x660.jpg",0.3,0.2,0.75,0 ,true));
        addGlass(makeGlass("LIL'RUTH","https://glassvue.com/store/index.php?route=product/product&path=46&product_id=65",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Kids/10098.jpg",0.3,0.3,0.8,0 ,true));
        addGlass(makeGlass("LIL'SUSIE","https://glassvue.com/store/index.php?route=product/product&path=46&product_id=64",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Kids/10136_f-540x660.jpg",0.5,0,0,0.8 ,true));
        addGlass(makeGlass("LORAIN PURPLE","https://glassvue.com/store/index.php?route=product/product&path=46&product_id=66",
                "https://glassvue.com/store/image/cache/catalog/demo/product/Kids/10123_f-540x660.jpg",0.6,0.75,0.2,0.2 ,true));

        List<Glass> glassList=glassCollection;
        return glassList;
    }
    public Glass makeGlass(String name ,String storeUrl,String imageUrl,String gender,double heart,double oval,double round,double square)
    {
        Glass glass=new Glass(name,storeUrl,imageUrl);
        glass.setGender(gender);
        glass.setHeart(heart);
        glass.setOval(oval);
        glass.setRound(round);
        glass.setSquare(square);
        return glass;
    }
    public Glass makeGlass(String name,String storeUrl,String imageUrl,String gender,double heart,double oval,double round,double square,String glasstype)
    {
        Glass glass=new Glass(name,storeUrl,imageUrl);
        glass.setGender(gender);
        glass.setHeart(heart);
        glass.setOval(oval);
        glass.setRound(round);
        glass.setSquare(square);
        glass.setGlassType(glasstype);
        return glass;
    }
    public Glass makeGlass(String name,String storeUrl,String imageUrl,double heart,double oval,double round,double square,boolean isKid)
    {
        Glass glass=new Glass(name,storeUrl,imageUrl);

        glass.setHeart(heart);
        glass.setOval(oval);
        glass.setRound(round);
        glass.setSquare(square);
        glass.setGlassType(String.valueOf(glassType.eyeglass));
        glass.setKid(isKid);
        return glass;
    }

}
