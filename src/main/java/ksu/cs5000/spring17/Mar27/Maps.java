package ksu.cs5000.spring17.Mar27;


import java.util.*;

public class Maps {

    public static class State {
        public String abbreviation, name;
        public int population;

        State(String abbreviation, String name, int population) {
            this.abbreviation=abbreviation;
            this.name=name;
            this.population=population;
        }

        @Override
        public String toString() {
            return "State - "+abbreviation + " "+name + " pop="+population;
        }
    }

    private static Map<String, State> statesByAbbreviation=new TreeMap<>();
    private static Map<Integer, List<State>> statesByPopulation=new HashMap<>();
    static void initialize_states() {
        State al=new State("AL","Alabama",10000);
        State ak=new State("AK","Alaska",7);
        State az=new State("AZ","Arizona",10000);
        statesByAbbreviation.put("AL",al);
        statesByAbbreviation.put("AK",ak);
        statesByAbbreviation.put("AZ",az);

        statesByPopulation.put(al.population, Arrays.asList(al,az));
        statesByPopulation.put(ak.population, Arrays.asList(ak));

        // add other 47
    }


    public static Map<String, Integer> wordFrequencies(Collection<String> words) {
        Map<String,Integer> frequencies=new HashMap<>();
        for(String word : words) {
            Integer currentFrequency=frequencies.get(word);
            if(currentFrequency==null)
                currentFrequency=0;
            frequencies.put(word, currentFrequency+1);
        }
        return frequencies;
    }

    public static void main(String args[]) {

        Collection<String> words=new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("one");

        System.out.println(words.size());
        System.out.println(words);

        System.out.println( wordFrequencies(Arrays.asList("one","one","two","one")));
/*        initialize_states();
        System.out.println( statesByAbbreviation.get("AL"));
        System.out.println( statesByPopulation.get(10000));

        for(String key:  statesByAbbreviation.keySet() ) {
            System.out.println(key+ "->"+statesByAbbreviation.get(key) );
        }

        for(State state:  statesByAbbreviation.values() ) {
            System.out.println(state );
        }

        for(Map.Entry<String,State> entry : statesByAbbreviation.entrySet()) {
            System.out.println( entry.getKey()+ " -> " +entry.getValue() );
        }
    */

    }
}