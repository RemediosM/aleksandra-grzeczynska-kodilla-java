package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void  testCalculateAdvStatisticsEmpty(){
      //Given
       Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.usersCount);
        Assert.assertEquals(0, forumStatistics.commentsCount);
        Assert.assertEquals(0, forumStatistics.postsCount);
        Assert.assertEquals(0.0, forumStatistics.postsAvg, 0.01);
        Assert.assertEquals(0.0, forumStatistics.postsCommentsAvg, 0.01);
        Assert.assertEquals(0.0, forumStatistics.usersCommentsAvg, 0.01);
    }
    @Test
    public void  testCalculateAdvStatistics1000posts100postsLessComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            usersNamesList.add("user" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.commentsCount()).thenReturn(900);
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, forumStatistics.usersCount);
        Assert.assertEquals(900, forumStatistics.commentsCount);
        Assert.assertEquals(1000, forumStatistics.postsCount);
        Assert.assertEquals(10.0, forumStatistics.postsAvg, 0.01);
        Assert.assertEquals(0.9, forumStatistics.postsCommentsAvg, 0.01);
        Assert.assertEquals(9.0, forumStatistics.usersCommentsAvg, 0.01);
    }

    @Test
    public void  testCalculateAdvStatisticsLessPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            usersNamesList.add("user" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.commentsCount()).thenReturn(900);
        when(statisticsMock.postsCount()).thenReturn(800);
        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, forumStatistics.usersCount);
        Assert.assertEquals(900, forumStatistics.commentsCount);
        Assert.assertEquals(800, forumStatistics.postsCount);
        Assert.assertEquals(8.0, forumStatistics.postsAvg, 0.01);
        Assert.assertEquals(9.0/8.0, forumStatistics.postsCommentsAvg, 0.01);
        Assert.assertEquals(9.0, forumStatistics.usersCommentsAvg, 0.01);
    }
}
