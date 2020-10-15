package com.kodilla.testing.forum.statistics;


import java.util.*;

public class ForumStatistics {
    private Statistics statisticsDatabase;

    public double averageCommentsPerPost, averageCommentsPerUser, averagePostsPerUser;

    public ForumStatistics (Statistics statisticsDatabase){
        this.statisticsDatabase = statisticsDatabase;
    }

    public List<User> usersNames() {
        List<User> usersList = statisticsDatabase.usersNames();
        return usersList;
    }

    public int postCount() {
        int postsNumber = statisticsDatabase.postsCount();
        return postsNumber;
    }

    public int commentsCount() {
        int commentsNumber = statisticsDatabase.commentsCount();
        return commentsNumber;
    }



    public double averagePostsPerUser() {
        double users = usersNames().size();
        double posts = postCount();
        double averagePostsPerUser = posts / users;
        return averagePostsPerUser;
    }

    public double averageCommentsPerUser() {
        double users = usersNames().size();
        double comments = commentsCount();
        double averageCommentsPerUser = comments / users;
        return averageCommentsPerUser;
    }

    public double averageCommentsPerPost() {
        double posts = postCount();
        double comments = commentsCount();
        double averageCommentsPerPost = comments / posts;
        return averageCommentsPerPost;
    }



    public void calculateAdvStatistics(Statistics statisticsDatabase) {
        this.averageCommentsPerPost = averageCommentsPerPost();
        this.averageCommentsPerUser = averageCommentsPerUser();
        this.averagePostsPerUser = averagePostsPerUser();
    }

    public List<Double> showStatistics() {
        List<Double> statisticsList = new ArrayList<>();
        statisticsList.add(averageCommentsPerPost);
        statisticsList.add(averageCommentsPerUser);
        statisticsList.add(averagePostsPerUser);
        return  statisticsList;
    }


}