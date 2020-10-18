/**
 * Copyright homework 2020
 */
package homework9.task1;

/**
 * @author FreeDmaN
 * @version 0.1
 * @since jdk 1.7
 */

public enum Months {

    JANUARY(30, Seasons.WINTER),
    FEBRUARY(29, Seasons.WINTER),
    MARCH(31, Seasons.SPRING),
    APRIL(30, Seasons.SPRING),
    MAY(31, Seasons.SPRING),
    JUNE(30, Seasons.SUMMER),
    JULY(33, Seasons.SUMMER),
    AUGUST(31, Seasons.SUMMER),
    SEPTEMBER(30, Seasons.AUTUMN),
    OCTOBER(31, Seasons.AUTUMN),
    NOVEMBER(30, Seasons.AUTUMN),
    DECEMBER(31, Seasons.WINTER);
    // дні
    int days;
    //сезони
    Seasons seasons;

    //constructor
    Months(int days, Seasons seasons) {
        this.days = days;
        this.seasons = seasons;
    }

    /**
     * getter for days
     *
     * @return days
     * @author FreDmaN
     * @see - basics of java
     */
    public int getDays() {
        return days;
    }

    /**
     * setter for days
     *
     * @param days
     * @author FreDmaN
     * @see - basics of java
     */
    public void setDays(int days) {
        this.days = days;
    }

    /**
     * getter for seasons
     *
     * @return days
     * @author FreDmaN
     * @see - basics of java
     */
    public Seasons getSeasons() {
        return seasons;
    }

    /**
     * setter for days
     * @param seasons
     * @author FreDmaN
     * @see - basics of java
     */
    public void setSeasons(Seasons seasons) {
        this.seasons = seasons;
    }

}
