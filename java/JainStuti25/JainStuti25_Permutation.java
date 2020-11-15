// AUTHOR
// Stuti Jain
// USER ID
// https://cses.fi/user/25504
// PROBLEM NUMBER
// https://cses.fi/problemset/task/1070
// A permutation of integers 1,2,…,n is called beautiful if there are no adjacent elements whose difference is 1.
//Given n, construct a beautiful permutation if such a permutation exists.

public class JainStuti25_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        if (n == 1)
            System.out.print(n + " ");

        else if (n == 2 || n == 3)
            System.out.print("NO SOLUTION");
        else {
            StringBuilder str = new StringBuilder();
            for (int i = 2; i <= n; i += 2) {
                str.append(i).append(" ");
            }
            for (int i = 1; i <= n; i += 2) {
                str.append(i).append(" ");
            }
            System.out.println(str);
        }
    }
}
