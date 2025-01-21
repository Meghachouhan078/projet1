package collections.Array_List;

import java.util.ArrayList;

public class arraylistToStringarray {
    public static void main(String args[]) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("indore");
        cities.add("delhi");
        cities.add("bhopal");
        cities.add("ujjain");

        String citiesname[] = cities.toArray(new String[cities.size()]);
        for (String s : citiesname) {
            System.out.println(s);
        }
    }
}
