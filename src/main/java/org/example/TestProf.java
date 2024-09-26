package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class TestProf {
    public static void main(String[] args)
    {
        Properties prop = new Properties();

        try(InputStream resourceAsStream = TestMaven.class.getClassLoader().getResourceAsStream("config.properties"))
        {
            prop.load(Objects.requireNonNull(resourceAsStream));
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

        System.out.println(prop.get("props.local.hello"));
        System.out.println(prop.get("props.mvn.hello"));
    }
}
