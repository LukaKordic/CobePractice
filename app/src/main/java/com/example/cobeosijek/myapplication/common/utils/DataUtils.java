package com.example.cobeosijek.myapplication.common.utils;

import com.example.cobeosijek.myapplication.data_object.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cobeosijek on 17/07/2017.
 */

public class DataUtils {

    public static List<String> loadAudiImages(){
        List<String> audiImageList = new ArrayList<>();

        audiImageList.add("http://blog.caranddriver.com/wp-content/uploads/2015/11/BMW-2-series.jpg");
        audiImageList.add("https://content.audi.co.uk/dam/7_days/CAD/External%20Assets/A5/MY17%20A5%20Coupe/035.png");
        audiImageList.add("http://blog.caranddriver.com/wp-content/uploads/2016/06/2018-Audi-A5-S5-Euro-spec-PLACEMENT1-626x382.jpg");
        return audiImageList;
    }

    public static List<String> loadMercedesImages(){
        List<String> mercedesImageList = new ArrayList<>();

        mercedesImageList.add("http://proauto.ba/wp-content/uploads/2016/01/mercedes-e-klasa-2017-proauto-36-625x400.jpg");
        mercedesImageList.add("https://adriaticmedianethr.files.wordpress.com/2016/07/unutrac5a1njost.jpg?quality=100&strip=all&w=669&strip=all");
        mercedesImageList.add("https://automobili.hr/wp/wp-content/uploads/2016/01/new-2017-mercedes-benz-e-class-leaked-photo-gallery_10.jpg");

        return mercedesImageList;
    }

    public static List<String> loadBMWImages(){
        List<String> bmwImageList = new ArrayList<>();

        bmwImageList.add("https://www.bmw.hr/content/dam/bmw/common/all-models/m-series/m6-gran-coupe/2015/model-card/BMW-M6-Gran-Coupe_ModelCard.png");
        bmwImageList.add("https://pictures.topspeed.com/IMG/crop/201604/2016-bmw-m6-gran-coupe-by_600x0w.jpg");

        return bmwImageList;
    }
    private static List<String> loadSkodaImages() {
        List<String> skodaImageList = new ArrayList<>();

        skodaImageList.add("https://images.cdn.autocar.co.uk/sites/autocar.co.uk/files/styles/gallery_slide/public/images/car-reviews/first-drives/legacy/skdoa-superb-ac-web-1.jpg?itok=fNbZyMUQ");
        skodaImageList.add("https://www.google.hr/search?q=skoda+superb&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjIm4mNsJLVAhVMthQKHak3CUwQ_AUICigB&biw=1720&bih=1000#imgrc=-d5RB22NTSOJdM:");

        return skodaImageList;
    }

    private static List<String> loadPassatImages() {
        List<String> passatImagelist = new ArrayList<>();

        passatImagelist.add("https://www.volkswagen.com.au/content/dam/vw-ngw/vw_pkw/importers/au/showrooms/passat-sedan/16x9/Passat_Gallery-2.png/jcr:content/renditions/original.transform/min/img.png");
        passatImagelist.add("http://www.volkswagen.co.uk/assets/common/content/mlp/passat-viii/gallery/fullscreen/newgolf_gallery1_v2.jpg");

        return passatImagelist;
    }

    private static List<String> loadHondaImages() {
        List<String> hondaImageList = new ArrayList<>();

        hondaImageList.add("https://a5-gallery.s3-us-west-2.amazonaws.com/2017/Honda/Civic%20Coupe/LX/front34/med/545454");

        return hondaImageList;
    }

    public static List<Car> loadAllCars() {
        List<Car> carArrayList = new ArrayList<>();

        carArrayList.add(new Car("Audi A5", 2015, loadAudiImages(), 250, "OS 031 OS"));
        carArrayList.add(new Car("Mercedes E class", 2017, loadMercedesImages(), 260, "OS 246 OS"));
        carArrayList.add(new Car("BMW M6", 2016, loadBMWImages(), 260, "OS 897 OS"));
        carArrayList.add(new Car("Skoda", 2015, loadSkodaImages(), 220, "OS 564 OS"));
        carArrayList.add(new Car("Passat", 2014, loadPassatImages(), 230, "OS 378 OS"));
        carArrayList.add(new Car("Honda", 2015, loadHondaImages(), 220, "OS 645 OS"));

        return carArrayList;
    }

    public static List<Car> loadFavouriteCars() {
        List<Car> carArrayList = new ArrayList<>();

        carArrayList.add(new Car("Audi A5", 2015, loadAudiImages(), 250, "OS 031 OS"));
        carArrayList.add(new Car("Mercedes E class", 2017, loadMercedesImages(), 260, "OS 246 OS"));
        carArrayList.add(new Car("BMW M6", 2016, loadBMWImages(), 260, "OS 897 OS"));

        return carArrayList;
    }
}
