package com.demoqa.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    // Bu classin amaci, configuration.properties dosyasindaki verileri(test data) okumaktir
    //create properties instance
    private static Properties properties;
    //FileInputStream kullanarak, bir dosya aciyoruz
    //Properties'i bu dosyaya yukluyoruz
    //Daha sonra properties dosyasini okuyacagiz.

    //Baslatmak icin static block olusturduk.
    static{
        String path = "configuration.properties";
        try {
            FileInputStream file =new FileInputStream(path); //FileInputStream kullanarak, bir dosya aciyoruz
            properties = new Properties();
            properties.load(file);  //Properties'i bu dosyaya yukluyoruz(load)
        } catch (Exception e) {
            System.out.println("file path bulunamadi");
            e.printStackTrace();
        }

    }
    //Okumak icin static bir method olusturulmali.
    //Bu method kullanici anahtar kelimeyi(key) girdiginde value return eder.
    public static String getProperty(String key){
        return properties.getProperty(key);
    }



}
