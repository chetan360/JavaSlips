
import java.util.Scanner;

class Matrix {
    int[][] mat;
    int m, n;
    
    Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        mat = new int[m][n];
    }
    
    void readMat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of matrix :");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }
    
    void displayMat() {
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Slip5Q2 {
    static void addMat(Matrix A, Matrix B) {
        if(A.m == B.m && A.n == B.n) {
            Matrix C = new Matrix(A.m, A.n);
            for(int i=0; i<C.m; i++) {
                for(int j=0; j<C.n; j++) {
                    C.mat[i][j] = A.mat[i][j] + B.mat[i][j];
                }
            }
            System.out.println("Addition of matrices is :");
            C.displayMat();
        } else {
            System.out.println("Rule of Addition of Matrices faild.");
        }
    }
    
    static void multiMat(Matrix A, Matrix B) {
        if(A.n == B.m) {
            Matrix C = new Matrix(A.m, B.n);
            for(int i=0; i<A.m; i++) {
                for(int j=0; j<B.n; j++) {
                    for(int k=0; k<A.m; k++) {
                        C.mat[i][j] += A.mat[i][k] * B.mat[k][j];
                    }
                }
            }
            System.out.println("Multiplication of matrices is :");
            C.displayMat();
        } else {
            System.out.println("Rule of Multiplication of Matrices faild.");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\n       Matrix Operations");
            System.out.println("1. Addition.");
            System.out.println("2. Multiplication.");
            System.out.println("3. Exit.");
            
            System.out.println("Enter your choise :");
            int ch = sc.nextInt();
            Matrix A, B;
            
            switch(ch) {
                case 1:
                    A = new Matrix(2, 2);
                    A.readMat();
                    B = new Matrix(2, 2);
                    B.readMat();
                    addMat(A, B);
                    break;
                case 2:
                    A = new Matrix(2, 2);
                    A.readMat();
                    B = new Matrix(2, 2);
                    B.readMat();
                    multiMat(A, B);
                case 3:
                    System.out.println("Exiting program.");
                    return;
            }
        }
    }
}
