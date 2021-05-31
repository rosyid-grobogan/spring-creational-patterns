package com.rosyidgrobogan.springcreationalpatterns.factorymethod.pendekatan1;

import lombok.Getter;

@Deprecated
public class FacebookSocialMedia implements SocialMedia {

    @Getter
    private final String name = "FACEBOOK";

    @Getter
    private final String link = "https://facebook.com";

    @Getter
    private final SocialMediaTypeEnum type = SocialMediaTypeEnum.FACEBOOK;
}
