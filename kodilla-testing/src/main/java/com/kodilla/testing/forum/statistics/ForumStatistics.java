package com.kodilla.testing.forum.statistics;



import java.util.*;
import java.lang.RuntimeException;

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

        try {
            double averagePostsPerUser = posts / users;
            return averagePostsPerUser;
        } catch(ArithmeticException e) {
            return 0;
        }


    }

    public double averageCommentsPerUser() {
        double users = usersNames().size();
        double comments = commentsCount();

        try {
            double averageCommentsPerUser = comments / users;
            return averageCommentsPerUser;
        } catch(ArithmeticException e) {
            return 0;
        }


    }

    public double averageCommentsPerPost() {
        double posts = postCount();
        double comments = commentsCount();
        try {
            double averageCommentsPerPost = comments / posts;
            return averageCommentsPerPost;
        } catch(ArithmeticException p) {
            return 0;
        }

    }



    public void calculateAdvStatistics() {
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