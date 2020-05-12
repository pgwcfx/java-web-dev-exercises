package exercises.technology;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class Program {

    public static void main(String[] args){
        Laptop acer = new Laptop("acer",new ArrayList<>(List.of("gsak",
                "chrome","file explorer","mail","VLC media player")),
                new ArrayList<>(List.of("Monday.cpp","5.3notes","Week 1 discussion")),13.75);
        acer.countApps();
        acer.countFiles();
        System.out.println(acer.getInfo());

        Smartphone moto = new Smartphone(new ArrayList<>(List.of("geocaching", "Lets roam", "facebook", "camera")),
                5.8,new ArrayList<>(List.of("Anna","Beth","Dr Schaberg","Steve","Megan")));
        moto.countApps();
        System.out.println(moto.getInfo());
    }

    @Test
    public void smartphoneInheritsSuperInFirstConstructor(){
        Smartphone moto = new Smartphone(new ArrayList<>(List.of("geocaching", "Lets roam", "facebook", "camera")),
                5.8,new ArrayList<>(List.of("Anna","Beth","Dr Schaberg","Steve","Megan")));
        assertEquals(List.of("geocaching", "Lets roam", "facebook", "camera"),moto.getApplications());
        assertEquals(5.8,moto.getMemory(),.001);
    }

    @Test
    public void laptopInheritsSuperInFirstConstructor(){
        Laptop acer = new Laptop("acer",new ArrayList<>(List.of("gsak",
                "chrome","file explorer","mail","VLC media player")),
                new ArrayList<>(List.of("Monday.cpp","5.3notes","Week 1 discussion")),13.75);
        assertEquals(List.of("gsak",
                "chrome","file explorer","mail","VLC media player"),acer.getApplications());
        assertEquals(List.of("Monday.cpp","5.3notes","Week 1 discussion"),acer.getFiles());
        assertEquals(13.75,acer.getMemory(),.001);
    }
}
