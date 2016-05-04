//Create two classes, Book and Movie. Both classes should have at least
//two attributes each, such as title, and genre. Create a class
//called a Hobbie that has a list of books and movies. Create an application
//class called UserHobbies which has a main method and a method that collects
//users hobbies, such as books  and movies. Create a method that displays
//the collected information.

package com.company;
import java.util.*;

public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Book book = new Book();
            Movie movie = new Movie();



            Hobbie [] hobbie = new Hobbie[2];
            for ( int i=0; i < hobbie.length; i++)
            {
                hobbie[i] = new Hobbie();
                inputBook(hobbie[i].book.title, hobbie[i].book.genre);
                inputMovie(hobbie[i].movie.title, hobbie[i].movie.genre);
            }

            System.out.println("Please enter which user information you want to see from 1 to " + hobbie.length);
            int choose =  input.nextInt();

            display(hobbie[choose-1].book.title, hobbie[choose-1].book.genre);
            display(hobbie[choose-1].movie.title, hobbie[choose-1].movie.genre);
    }

    public static void inputMovie (String [] title, String [] genre )
    {
        Scanner input = new Scanner(System.in);

        for (int i=0; i < title.length; i++)
        {
            System.out.println("Please input the title of movie: ");
            String temp = input.nextLine();
            title[i] = temp;
        }

        for (int i=0; i < genre.length; i++)
        {
            System.out.println("Please input the genre of movie: ");
            String temp = input.nextLine();
            genre[i] = temp;
        }
    }

    public static void inputBook (String [] title, String [] genre )
    {
        Scanner input = new Scanner(System.in);

        for (int i=0; i < title.length; i++) {
            System.out.println("Please input the title of book: ");
            String temp = input.nextLine();
            title[i] = temp;
        }
        for (int i=0; i < genre.length; i++)
        {
            System.out.println("Please input the genre of book: ");
            String temp = input.nextLine();
            genre[i] = temp;
        }
    }

    public static void display (String [] title, String [] genre )
    {
        for (int i=0; i < title.length; i++ )
        {
            System.out.println(title[i]);
        }
        for (int i=0; i < genre.length; i++ )
        {
            System.out.println(genre[i]);
        }
    }
}
