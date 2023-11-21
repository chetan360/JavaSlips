
import java.util.Scanner;

class CricketPlayer2 {
    public String name;
    public int no_of_innings, no_of_times_notout, totalruns;
    public double bat_avg;
    
    CricketPlayer2(String name, int no_of_innings, int no_of_times_notout, int totalruns) {
        this.name = name;
        this.no_of_times_notout = no_of_times_notout;
        this.no_of_innings = no_of_innings;
        this.totalruns = totalruns;
    }
    
    public void display() {
        System.out.println("-----------------------------------");
        System.out.println("Player name : " + name);
        System.out.println("No. of innings : " + no_of_innings);
        System.out.println("No. of times notout : " + no_of_times_notout);
        System.out.println("Total runs : " + totalruns);
        System.out.println("Batting Avarage : " + bat_avg);
    }
}

public class Slip18Q2 {
    public static void avg(CricketPlayer2 c[], int n) {
        for(int i=0; i<n; i++) {
            c[i].bat_avg = (double)c[i].totalruns / (double)(c[i].no_of_innings - c[i].no_of_times_notout);
        }
    }
    
    public static void sort(CricketPlayer2 c[], int n) {
        for(int i=1; i<n; i++) {
            for(int j=0; j<n-i; j++) {
                if(c[j+1].bat_avg < c[j].bat_avg) {
                    CricketPlayer2 t = c[j+1];
                    c[j+1] = c[j];
                    c[j] = t;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("How many values :");
        n = sc.nextInt();
        
        CricketPlayer2[] c = new CricketPlayer2[n];
        for(int i=0; i<n; i++) {
            sc.nextLine();
            
            System.out.println("Player name :");
            String name = sc.nextLine();
            
            System.out.println("No. of innings :");
            int no_of_times_notout = sc.nextInt();
            
            System.out.println("No. of times notout :");
            int no_of_innings = sc.nextInt();
            
            System.out.println("Total runs :");
            int totalruns = sc.nextInt();
            
            c[i] = new CricketPlayer2(name, no_of_times_notout, no_of_innings, totalruns);
        }
        
        avg(c, n);
        sort(c, n);
        
        for(int i=0; i<n; i++)    
            c[i].display();
        }
}
