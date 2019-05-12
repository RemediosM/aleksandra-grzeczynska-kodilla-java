package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics{

    int usersCount;
    int postsCount;
    int commentsCount;
    double postsAvg;
    double usersCommentsAvg;
    double postsCommentsAvg;

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (usersCount!= 0) {
            postsAvg = (double) postsCount / (double) usersCount;
        } else {
            postsAvg = 0.0;
        }

        if (usersCount != 0) {
            usersCommentsAvg = (double) commentsCount / (double) usersCount;
        } else {
            usersCommentsAvg = 0.0;
        }

        if (postsCount != 0) {
            postsCommentsAvg = (double) commentsCount / (double) postsCount;
        } else {
            postsCommentsAvg = 0.0;
        }
    }

}
