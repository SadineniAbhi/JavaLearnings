public class UdemyChallenge3 {
    public static void main(String[] args){
        double p = 0;
        int oneApplePrice = 1;
        int numOfCustomers = 0;
        int numOfApples = 500;
        int numOfApplesSold = 0;
        numOfCustomers++;
        numOfApplesSold+=4;
        numOfCustomers++;
        numOfApplesSold+=20;
        numOfCustomers++;
        numOfApplesSold+=200;
        System.out.println("wow so far you made "+(numOfApplesSold*oneApplePrice));
        System.out.println(numOfCustomers +" customers love your apples");
        System.out.println("you have "+(numOfApples-numOfApplesSold)+" left we will sell tommorow");

    }
}
