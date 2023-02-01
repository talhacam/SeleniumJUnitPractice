package practise;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_Verify {
    //Verify that we have pom.xml file in our project


    @Test
    public void verify() {
        String path ="C:\\Users\\pc\\Desktop\\selenium\\SeleniumPreactise\\pom.xml";

        Assert.assertTrue(Files.exists(Paths.get(path)));
    }
}
