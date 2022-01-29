package com.geekbrains.wsboot;

import com.geekbrains.springsoap.gen.Greeting;
import com.geekbrains.springsoap.gen.Greeting2;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.util.GregorianCalendar;

@Component
public class GreetingRepository {
    public Greeting getGreeting(String name) throws DatatypeConfigurationException {
        Assert.notNull(name, "Имя не может быть пустым");
        Greeting greeting = new Greeting();
        greeting.setText(String.format("Привет, %s", name));
        greeting.setDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
        return greeting;
    }

    public Greeting2 getGreeting2(String name) throws DatatypeConfigurationException {
        Assert.notNull(name, "Имя не может быть пустым");
        Greeting2 greeting = new Greeting2();
        greeting.setText(String.format("Привет, %s", name));
        greeting.setDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
        return greeting;
    }
}


