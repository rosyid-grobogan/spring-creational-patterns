package com.rosyidgrobogan.springcreationalpatterns.factorymethod.pendekatan1;

import lombok.Getter;

public class FacebookV2SocialMedia implements SocialMedia {

    @Getter
    private final String name = "FACEBOOK";

    @Getter
    private final String link = "https://web.facebook.com";

    @Getter
    private final SocialMediaTypeEnum type = SocialMediaTypeEnum.FACEBOOK;
}
