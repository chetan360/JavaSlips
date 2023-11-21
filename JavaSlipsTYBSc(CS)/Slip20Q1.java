
class Continent2 {
    String continentName;
    Continent2(String continentName) {
        this.continentName = continentName;
    }
    
    public void printContinent() {
        System.out.println("Continent = " + continentName);
    }
}

class Country2 extends Continent2 {
    String countryName;
    Country2(String continentName, String countryName) {
        super(continentName);
        this.countryName = countryName;
    }

    public void printCountry() {
        System.out.println("Country = " + countryName);
    }
}

class State2 extends Country2 {
    String stateName;
    String place;
    
    State2(String continentName, String countryName, String stateName, String place) {
        super(continentName, countryName);
        this.stateName = stateName;
        this.place = place;
    }

    public void printState() {
        System.out.println("State = " + stateName);
        System.out.println("Place = " + place);
    }
}

class Slip20Q1 {
    public static void main(String args[]) {
        State2 Maharashtra = new State2("Asia" , "India", "Maharashtra", "Dabhadi");
        
        Maharashtra.printContinent();
        Maharashtra.printCountry();
        Maharashtra.printState();
    }
}