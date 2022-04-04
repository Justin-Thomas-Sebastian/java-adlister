package models;

import java.util.ArrayList;
import java.util.Date;

public class BeanTest {
    public static void main(String[] args){
        Album album1 = new Album();
        Author author1 = new Author();
        Author author2 = new Author();
        Author author3 = new Author();
        Quote quote1 = new Quote();
        Quote quote2 = new Quote();
        Quote quote3 = new Quote();

        album1.setArtist("Gojira");
        album1.setGenre("Metal");
        album1.setId(1);
        album1.setName("Fortitude");
        album1.setSales(10.5F);
        album1.setReleaseDate(new Date(1335765600L));

        author1.setId(1);
        author1.setFirstName("Brandon");
        author1.setLastName("Sanderson");
        author2.setId(2);
        author2.setFirstName("George");
        author2.setLastName("Martin");
        author3.setId(3);
        author3.setFirstName("Justin");
        author3.setLastName("Sebastian");

        quote1.setId(1);
        quote1.setAuthor(author1);
        quote1.setContent("The purpose of a storyteller is not to tell you how to think, but to give you questions to think upon.");
        quote2.setId(2);
        quote2.setAuthor(author2);
        quote2.setContent("A reader lives a thousand lives before he dies, said Jojen. The man who never reads lives only one.");
        quote3.setId(3);
        quote3.setAuthor(author3);
        quote3.setContent("I'm hungry.");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        for(int i = 0; i < quotes.size(); i++){
            String firstName = quotes.get(i).getAuthor().getFirstName();
            String lastName = quotes.get(i).getAuthor().getLastName();
            String content = quotes.get(i).getContent();
            System.out.println("Author: " + firstName + " " + lastName);
            System.out.println("Quote: " + content);
        }
    }
}