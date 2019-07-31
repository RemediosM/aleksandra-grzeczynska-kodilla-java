package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven");
        User john = new YGeneration("John");
        User alex = new ZGeneration("Alex");

        //When
        String stevenPost = steven.sharePost();
        System.out.println("Steven: " + stevenPost);
        String johnPost = john.sharePost();
        System.out.println("John: " + johnPost);
        String alexPost = alex.sharePost();
        System.out.println("Alex: " + alexPost);

        //Then
        Assert.assertEquals("Share on Facebook", stevenPost);
        Assert.assertEquals("Share on Twitter", johnPost);
        Assert.assertEquals("Share on Snapchat", alexPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven");

        //When
        String stevenPost = steven.sharePost();
        System.out.println("Steven should: " + stevenPost);
        steven.setSharePost(new SnapchatPublisher());
        stevenPost = steven.sharePost();
        System.out.println("Steven now: " + stevenPost);

        //Then
        Assert.assertEquals("Share on Snapchat", stevenPost);
    }
}
