package com.fitbit.api.common.model.user;

public class FriendStats {
    private UserInfo user;
    private StatisticInfo summary;
    private StatisticInfo average;

    public FriendStats(UserInfo user, StatisticInfo summary, StatisticInfo average) {
        this.user = user;
        this.summary = summary;
        this.average = average;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public StatisticInfo getSummary() {
        return summary;
    }

    public void setSummary(StatisticInfo summary) {
        this.summary = summary;
    }

    public StatisticInfo getAverage() {
        return average;
    }

    public void setAverage(StatisticInfo average) {
        this.average = average;
    }

    public static class StatisticInfo {
        private int steps;
        private int calories;
        private double distance;
        private int activeScore;

        public int getSteps() {
            return steps;
        }

        public void setSteps(int steps) {
            this.steps = steps;
        }

        public int getCalories() {
            return calories;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }

        public int getActiveScore() {
            return activeScore;
        }

        public void setActiveScore(int activeScore) {
            this.activeScore = activeScore;
        }
    }
}