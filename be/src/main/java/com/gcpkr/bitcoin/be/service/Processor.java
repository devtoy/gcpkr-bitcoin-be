package com.gcpkr.bitcoin.be.service;

import com.gcpkr.bitcoin.be.model.Message;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Processor extends AbstractProcessor<Message> {

    @Override
    public Message processOne() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Message(new Date().toString());
    }
}
