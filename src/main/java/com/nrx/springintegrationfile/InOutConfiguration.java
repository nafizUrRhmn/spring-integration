package com.nrx.springintegrationfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.FileWritingMessageHandler;

import java.io.File;

@Configuration
public class InOutConfiguration {

    @Bean
    @InboundChannelAdapter(value = "fileChannel", poller = @Poller(fixedDelay="1000"))
     public  FileReadingMessageSource fileReadingMessageSource(){
         FileReadingMessageSource reader = new FileReadingMessageSource();
         reader.setDirectory(new File("/Users/nafizurrahman/Desktop/source"));
         return reader;
     }

     @Bean
     @ServiceActivator(inputChannel = "fileChannel")
     public FileWritingMessageHandler fileWritingMessageHandler(){
        FileWritingMessageHandler fileWritingMessageHandler =
                new FileWritingMessageHandler(new File("/Users/nafizurrahman/Desktop/destination"));
        fileWritingMessageHandler.setAutoCreateDirectory(true);
        fileWritingMessageHandler.setExpectReply(false);
        return fileWritingMessageHandler;
     }
}
