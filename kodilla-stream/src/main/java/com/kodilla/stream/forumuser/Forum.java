package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUser = new ArrayList<>();
    public Forum() {
        theForumUser.add(new ForumUser(1, "user1", 'M', LocalDate.of(1990,07,01), 3));
        theForumUser.add(new ForumUser(2, "user2", 'F', LocalDate.of(1994,3,15), 5));
        theForumUser.add(new ForumUser(3, "user3", 'M', LocalDate.of(1991,5,20), 2));
        theForumUser.add(new ForumUser(4, "user4", 'M', LocalDate.of(1999,5,15), 0));
        theForumUser.add(new ForumUser(5, "user5", 'M', LocalDate.of(2006,12,30), 10));
    }

    public List<ForumUser> getTheForumUser() {
        return new ArrayList<>(theForumUser);
    }
}

