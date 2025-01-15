// Author: Roy Rozin Date: 1/14/2025 Description: A constructor to initialize 4 private instance variables. Includes getter and setter methods that return the names, capitals, and languages of countries. 
//Also has a to string method.
public class Country {
  // add private instance variables for the name, capital, language, and image file.
  private String name;
  private String capital;
  private String language;
  private String image;

  //constructors
  public Country (){
    this.name = "";
    this.capital = "";
    this.language = "";
    this.image = "";
  }

  public Country (String name, String capital, String language, String image){
    this.name = name;
    this.capital = capital;
    this.language = language;
    this.image = image;
  }

  // Write accessor/get methods for each instance variable that returns it.

  public String getName(){
    return name;
  }

  public String getCapital(){
    return capital;
  }

  public String getLanguage(){
    return language;
  }

  public String getImage(){
    return image;
  }

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 
  //returns the name, capital, and language of the country in a String
  public String toString(){
    return name + "'s capital is " + capital + " and its primary language is " + language;
  }
}