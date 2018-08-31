package com.fileupload.fileupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Hashtable;

@SpringBootApplication
/**
 * @author:Aunsetre
 */
public class FileuploadApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FileuploadApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }
}
