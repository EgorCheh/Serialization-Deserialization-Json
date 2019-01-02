


import com.github.javafaker.Faker;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

class main {
    public static void main (String[] arg)
    {

        ArrayList<Person> personArrayList = new ArrayList<Person>();

        Random random = new Random();
        Faker faker = new Faker();
        Person person;
        int age;
        final int min = 18;
        final int max = 64;
        final int diff = max - min;


        for(int i =0; i<20;i++)
        {
            age = min + random.nextInt(diff+1);
            person = new Person(faker.name().fullName(),age,faker.job().title());
            personArrayList.add(person);
        }


        Gson gson = new Gson();
        String json = gson.toJson(personArrayList);

       try(FileWriter writer = new FileWriter("Persons.json",false);){
           writer.write(json);

        } catch (IOException e) {
            e.printStackTrace();
        }
       Person []personsBefore;

        try{
            personsBefore  = gson.fromJson(new FileReader("Persons.json"), Person[].class);
            for (Person item : personsBefore)
            {
                System.out.println(item.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}