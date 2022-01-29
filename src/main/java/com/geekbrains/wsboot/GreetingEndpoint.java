package com.geekbrains.wsboot;

import com.geekbrains.springsoap.gen.GetGreetingRequest;
import com.geekbrains.springsoap.gen.GetGreetingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.datatype.DatatypeConfigurationException;

@Endpoint
public class GreetingEndpoint {
    private static final String NAMESPACE_URI = "http://www.geekbrains.com/springsoap/gen";

    private GreetingRepository greetingRepository;

    @Autowired
    public GreetingEndpoint(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getGreetingRequest")
    @ResponsePayload
    public GetGreetingResponse getGreeting(@RequestPayload GetGreetingRequest request) throws DatatypeConfigurationException {
        GetGreetingResponse response = new GetGreetingResponse();
        response.setGreeting(greetingRepository.getGreeting(request.getName()));
        response.setGreeting2(greetingRepository.getGreeting2(request.getName() + " 2"));
        return response;
    }
}

