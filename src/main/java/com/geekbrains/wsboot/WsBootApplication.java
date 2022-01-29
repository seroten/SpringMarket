package com.geekbrains.wsboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WsBootApplication {
/*
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:gs="http://www.geekbrains.com/springsoap/gen">
    <soapenv:Header/>
    <soapenv:Body>
        <gs:getGreetingRequest>
            <gs:name>Bobby</gs:name>
        </gs:getGreetingRequest>
    </soapenv:Body>
</soapenv:Envelope>
*/

	public static void main(String[] args) {
		SpringApplication.run(WsBootApplication.class, args);
	}
}

