package com.rosyidgrobogan.springcreationalpatterns.factorymethod.pendekatan2inheritance;

import com.rosyidgrobogan.springcreationalpatterns.factorymethod.pendekatan1.SocialMedia;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FactoryInheritanceAppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testFactoryInheritance(){
        SocialMedia facebook = applicationContext.getBean("socialMediaFacebook", SocialMedia.class);
        SocialMedia instagram = applicationContext.getBean("socialMediaInstagram", SocialMedia.class);
        SocialMedia twitter = applicationContext.getBean("socialMediaTwitter", SocialMedia.class);

        System.out.println(facebook);
        System.out.println(instagram);
        System.out.println(twitter);
    }

}