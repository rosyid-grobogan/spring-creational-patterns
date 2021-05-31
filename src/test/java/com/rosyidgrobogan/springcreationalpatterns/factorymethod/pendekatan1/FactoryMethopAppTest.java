package com.rosyidgrobogan.springcreationalpatterns.factorymethod.pendekatan1;

import com.rosyidgrobogan.springcreationalpatterns.factorymethod.pendekatan1.SocialMedia;
import com.rosyidgrobogan.springcreationalpatterns.factorymethod.pendekatan1.SocialMediaTypeEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class FactoryMethopAppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testFactoryMethod(){
        SocialMedia facebook = applicationContext.getBean(SocialMedia.class, SocialMediaTypeEnum.FACEBOOK);
        SocialMedia instagram = applicationContext.getBean(SocialMedia.class, SocialMediaTypeEnum.INSTAGRAM);
        SocialMedia twitter = applicationContext.getBean(SocialMedia.class, SocialMediaTypeEnum.TWITTER);

        System.out.println(facebook);
        System.out.println(instagram);
        System.out.println(twitter);
    }
}