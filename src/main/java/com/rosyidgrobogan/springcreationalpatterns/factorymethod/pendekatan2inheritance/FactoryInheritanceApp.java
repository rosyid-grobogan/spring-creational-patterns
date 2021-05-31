package com.rosyidgrobogan.springcreationalpatterns.factorymethod.pendekatan2inheritance;

import com.rosyidgrobogan.springcreationalpatterns.factorymethod.pendekatan1.FacebookV2SocialMedia;
import com.rosyidgrobogan.springcreationalpatterns.factorymethod.pendekatan1.InstagramSocialMedia;
import com.rosyidgrobogan.springcreationalpatterns.factorymethod.pendekatan1.SocialMedia;
import com.rosyidgrobogan.springcreationalpatterns.factorymethod.pendekatan1.TwitterSocialMedia;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryInheritanceApp {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaFacebook(){
        return new FacebookV2SocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaInstagram(){
        return new InstagramSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaTwitter(){
        return new TwitterSocialMedia();
    }

}
