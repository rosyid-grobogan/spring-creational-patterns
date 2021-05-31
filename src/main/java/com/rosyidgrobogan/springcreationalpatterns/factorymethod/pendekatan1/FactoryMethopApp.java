package com.rosyidgrobogan.springcreationalpatterns.factorymethod.pendekatan1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryMethopApp {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMedia(SocialMediaTypeEnum type) {
        if (type == SocialMediaTypeEnum.FACEBOOK) {
//            return new FacebookSocialMedia();
            return new FacebookV2SocialMedia();
        } else if (type == SocialMediaTypeEnum.INSTAGRAM) {
            return new InstagramSocialMedia();
        } else if (type == SocialMediaTypeEnum.TWITTER) {
            return new TwitterSocialMedia();
        } else {
            throw new IllegalArgumentException("Unsupported Social Media");
        }
    }
}
