import java.util.Scanner;

class collatz{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int temp;

System.out.print("Enter starting n value for 3n+1: ");
int n = scan.nextInt();

System.out.print("Enter number of results: ");
int loop = scan.nextInt();

while(loop > 0){

    //System.out.print(n + "\n");

    for(int i = n; i > 0; i--){
        System.out.print("X");
    }
    System.out.println("");

if(n % 2 == 0){
n = n / 2;
temp = n;
}
if(n % 2 == 1){
n = 3 * n + 1;
temp = n;
}

loop--;
}




}
}
