public class Muti_table {
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scanner.nextInt();
        for(int i = 1; i <= 10;i++){
            int result = num * i;
            System.out.println(num + " X "+ i + "=" + result);
        }
        scanner.close();
    }
}
