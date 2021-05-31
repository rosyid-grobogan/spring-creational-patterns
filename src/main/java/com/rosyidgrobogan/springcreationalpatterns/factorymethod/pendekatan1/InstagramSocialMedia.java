package com.rosyidgrobogan.springcreationalpatterns.factorymethod.pendekatan1;

import lombok.Getter;


public class InstagramSocialMedia implements SocialMedia {

    @Getter
    private final String name = "INSTAGRAM";

    @Getter
    private final String link = "https://instagram.com";

    @Getter
    private final SocialMediaTypeEnum type = SocialMediaTypeEnum.INSTAGRAM;
}
