class Continent {
    String continent;
    
    Continent(String continent) {
        this.continent = continent;
    }
}

class Country extends Continent {
    String country;
    
    Country(String country, String continent) {
        super(continent);
        this.country = country;
    }
}

class State extends Country {
    String state;
    String place;
    
    State(String place, String state, String country, String continent) {
        super(country, continent);
        this.state = state;
        this.place = place;
    }
    
    void display() {
        System.out.println("---------------------------------");
        System.out.println("Place = " + place);
        System.out.println("State = " + state);
        System.out.println("Country = " + country);
        System.out.println("Continent = " + continent);
    }
}

public class Slip5Q1 {
    public static void main(String[] args) {
        State s = new State("Malegaon", "Maharashtra", "India", "Ashia");
        s.display();
    }
}
