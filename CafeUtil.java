import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CafeUtil{
    
	
	public int getStreakGoal(){
        int sum = 0;
        for(int i = 1; i < 11; i++){
            sum+=i;
        }
        return sum;
    }

    public void printPriceChart(String thingy, double price, int amount){
        System.out.println(thingy);
        for(int i = 1; i <= amount; i++){
            System.out.println(i + " - " + (price*i));
        }
    }

    public double getOrderTotal(double[] prices){
        double sum = 0;
        
        for(int i = 0; i < prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> thingy, ArrayList<Double> price){
        for(int i = 0; i < thingy.size(); i++){
            System.out.println(i + " " + thingy.get(i) + " -- $" + price.get(i));
        }
    }

    public void addCustomer(ArrayList<String> peoples){
        System.out.println("What is your name?");
        String name = System.console().readLine();
        peoples.add(name);
        System.out.println("Hello " + name + ". There are " + (peoples.size()-1) + " infront of you.");
    }
}