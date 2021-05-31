package com.rosyidgrobogan.springcreationalpatterns.factorymethod.pendekatan1;

import lombok.Getter;


public class TwitterSocialMedia implements SocialMedia {

    @Getter
    private final String name = "TWITTER";

    @Getter
    private final String link = "https://twitter.com";

    @Getter
    private final SocialMediaTypeEnum type = SocialMediaTypeEnum.TWITTER;
}
