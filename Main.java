// This program prints table of given number by user with the help of for loop

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int table = sc.nextInt();
//         for(i = 1 ; i <= 10 ; 1++){
//              System.out.println(table * i);
//         }
//     }
// }





// This program prints table of given number by user with the help of while loop

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int table = sc.nextInt();
//         int i = 1;
//         while(i<=10){
//             System.out.println(table * i);
//             i++;
//         }
//     }
// }





// This program prints table of given number by user with the help of dowhile loop

 import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();
        int i = 1;
        do{
            System.out.println(table * i);
            i++;
        }while (i <= 10);
    }
}