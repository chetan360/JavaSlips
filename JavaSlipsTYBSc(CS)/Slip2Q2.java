
import java.util.Scanner;

class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int total_runs;
    double bat_avg;
    
    CricketPlayer(String name, int no_of_innings, int no_of_times_notout, int total_runs) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.total_runs = total_runs;
    }
    
    void display() {
        System.out.println("--------------------------------------");
        System.out.println("Name = " + name);
        System.out.println("No. of Innings = " + no_of_innings);
        System.out.println("No. of Times Notout = " + no_of_times_notout);
        System.out.println("Total runs = " + total_runs);
        System.out.println("Batting Average = " + bat_avg);
    }
    
    static void sort(CricketPlayer[] c, int n) {
        //bubble sort
        for(int i=1; i<n; i++) {
            for(int j=0; j<n-i; j++) {
                if(c[j+1].bat_avg < c[j].bat_avg) {
                    CricketPlayer t = c[j+1];
                    c[j+1] = c[j];
                    c[j] = t;
                }
            }
        }
    }
    
    static void avg(CricketPlayer[] c) {
        for(CricketPlayer x:c) {
            double avg;
            if((x.no_of_innings - x.no_of_times_notout) == 0) {
                avg = 1;
            } else {
                avg = x.no_of_innings - x.no_of_times_notout;
            }
            
            x.bat_avg = x.total_runs / avg; 
        }
    }
}

public class Slip2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many players :");
        int n = sc.nextInt();
        
        CricketPlayer[] c = new CricketPlayer[n];
        System.out.println("Enter " + n + " Cricket players details :");
        for(int i=0; i<n; i++) {
            sc.nextLine();
            System.out.println("Name :");
            String name = sc.nextLine();
            
            System.out.println("No. of Innings :");
            int no_of_innings = sc.nextInt();
    
            System.out.println("No. of Times Notout :");
            int no_of_times_notout = sc.nextInt();
            
            System.out.println("Total runs :");
            int total_runs = sc.nextInt();
            
            c[i] = new CricketPlayer(name, no_of_innings, no_of_times_notout, total_runs);
        }
        
        CricketPlayer.avg(c);
        CricketPlayer.sort(c, n);
                
        for(CricketPlayer x:c) {
            x.display();
        }
    }
}
