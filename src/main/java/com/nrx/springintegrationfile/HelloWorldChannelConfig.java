package com.nrx.springintegrationfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.dsl.MessageChannels;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;

@Configuration
public class HelloWorldChannelConfig {

    @Bean
    @InboundChannelAdapter(value = "input")
    MessageChannel inputChannel(){
        return MessageChannels.publishSubscribe().get();
    }
}
