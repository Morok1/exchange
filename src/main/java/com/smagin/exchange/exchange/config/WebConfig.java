package com.smagin.exchange.exchange.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.XmlBeamHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@EnableWebMvc
@Configuration
@ComponentScan({"com.smagin.exchange.exchange"})
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.add(new XmlBeamHttpMessageConverter());
    }
//    private HttpMessageConverter<Object> createXmlHttpMessageConverter(){
//        MarshallingHttpMessageConverter  converter = new MarshallingHttpMessageConverter();
//        return converter;
//    }
}
