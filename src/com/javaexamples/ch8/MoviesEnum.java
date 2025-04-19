package com.javaexamples.ch8;

// Declare Enum class only using:
// "public/private/protected" + "enum" + <name of the enum class>
public enum MoviesEnum 
{
    // First declare enum constants: VAR_1(argument1, argument2), ..., VAR_N(argument1, argument2);
    ACTION_MOVIES("American Samurai", "John Wick", "Ronin"),
    COMEDY_MOVIES("Trading Places", "Balls of Fire", "Old School"),
    THRILLER_MOVIES("Glass", "Unbreakable", "Split"),
    SCIFI_MOVIES("Valerian", "Star Wars", "Odesy Space 2001"),
    DRAMA_MOVIES("The Good Father", "The Founder", "As Good as it Gets"),
    HORROR_MOVIES("Truck & Trucker", "American Werewolf in London", "Vampire Movies");

    // Second declare private Enum variables: "private <type_var1> <parameter for argument1>...
    private String movie1;
    private String movie2;
    private String movie3; 

    // Third declare Enum constructor "only name of the Enum class"
    MoviesEnum(String movie1, String movie2, String movie3)
    {
        this.movie1 = movie1;
        this.movie2 = movie2;
        this.movie3 = movie3;
    }

    // Finally Declare the Enum methods to access the private Enum vars
    public String getMovie1()
    {
        return movie1;
    }

    public String getMovie2()
    {
        return movie2;
    }

    public String getMovie3()
    {
        return movie3;
    }
}
