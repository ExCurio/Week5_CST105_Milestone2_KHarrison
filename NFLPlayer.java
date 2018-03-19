/** Program: NFL Player Class
 * File: NFLPLayer.java
 * Summary: This file creates the NFL Player variables, constructors, getters, setters, and testing.
 *
 * Author: Keith Harrison
 * Date: 3/17/2018
 * 
 */


public class NFLPlayer {
    
    //Declare instance variables
    public String name;
    private int age;
    private int weight;
    private int height;
    private String college;
    private int touchdowns;
    private int attempts;
    private int completions;
    private double completionPercentage;
    private double rating;
    
    //Declare empty constructor
    public NFLPlayer () { }

    //Declare NFLPlayer constructor that takes 10 parameters
    public NFLPlayer (String nameIn, int ageIn, int weightIn, int heightIn, String collegeIn, int touchdownsIn, int attemptsIn, 
            int completionsIn, double completionPercentageIn, double ratingIn)
    {
        name = nameIn;
        age = ageIn;
        weight = weightIn;
        height = heightIn;
        college = collegeIn;
        touchdowns = touchdownsIn;
        attempts = attemptsIn;
        completions = completionsIn;
        completionPercentage = completionPercentageIn;
        rating = ratingIn;
        
    }
    
    public void setName(String nameIn)
    {
        this.name = nameIn; 
    }

    public String getName()
    {
        return this.name;
    } 
    
    public void setAge(int ageIn)
    {
        this.age = ageIn;
    }

    public int getAge()
    {
        return this.age;
    }
    
    public void setWeight(int weightIn)
    {
        this.weight = weightIn;
    }
    
    public int getWeight()
    {
        return this.weight;
    }
    
    public void setHeight(int heightIn)
    {
        this.height = heightIn;
    }
    
    public int getHeight()
    {
        return this.height;
    }
    
    public void setCollege(String collegeIn)
    {
        this.college = collegeIn;
    }
    
    public String getCollege()
    {
        return this.college;
    }
    
    public void setTouchdowns(int touchdownsIn)
    {
        this.touchdowns = touchdownsIn;
    }
    
    public int getTouchdowns()
    {
        return this.touchdowns;
    }
    
    public void setAttempts(int attemptsIn)
    {
        this.attempts = attemptsIn;
    }
    
    public int getAttempts()
    {
        return this.attempts;
    }
    
    public void setCompletions(int completionsIn)
    {
        this.completions = completionsIn;
    }
    
    public int getCompletions()
    {
        return this.completions;
    }
    
    public void setCompletionPercentage(double completionPercentageIn)
    {
        this.completionPercentage = completionPercentageIn;
        completionPercentageIn = (completions / attempts) * 100;
    }
    
    public double getCompletionPercentage()
    {
        return this.completionPercentage;
    }
    
    public void setRating(double ratingIn)
    {
        this.rating = ratingIn;
    }
    
    public double getRating()
    {
        return this.rating;
    }
    
    
    public static void nflPlayerTest() {

                //Driver testing
		NFLPlayer keenum = new NFLPlayer("Case Keenum", 30, 215, 73, "Houston", 22, 481, 325, 67.6, 98.3);
		System.out.println("\nNFL Player's Getter Test: " + keenum.getName() + " is " + keenum.getHeight() + " inches in height and is " + keenum.getAge()
                + " years old.");
                keenum.setHeight(184);
                keenum.setAge(64);
                System.out.println("NFL Player's Setter Test: Case Keenum's new height is " + keenum.getHeight() + " inches and his new age is " + keenum.getAge() + ".");

    }
    
}
