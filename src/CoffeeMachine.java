import java.util.Scanner;

public class CoffeeMachine {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int waterStart = 400;
            int milkStart = 540;
            int beansStart = 120;
            int cupsStart = 9;
            int moneyStart = 550;

            System.out.println("The coffee machine has: ");
            System.out.println(waterStart + " ml of water");
            System.out.println(milkStart + " ml of milk");
            System.out.println(beansStart + " g of coffee beans");
            System.out.println(cupsStart + " disposable cups");
            System.out.println("$" + moneyStart + " of money");
            System.out.println();
            System.out.println("Write action (buy, fill, take):");
            String choice = input.nextLine();


            int moneyIn;


            switch (choice) {
                case "fill": {
                    System.out.println("Write how many ml of water you want to add: ");
                    int waterAdded = input.nextInt();
                    waterAdded += waterStart;
                    System.out.println("Write how many ml of milk you want to add:");
                    int milkAdded = input.nextInt();
                    milkAdded += milkStart;
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    int beansAdded = input.nextInt();
                    beansAdded += beansStart;
                    System.out.println("Write how many disposable cups of coffee you want to add: ");
                    int cupsAdded = input.nextInt();
                    cupsAdded += cupsStart;




                    System.out.println("The coffee machine has: ");
                    System.out.println(waterAdded + " ml of water");
                    System.out.println(milkAdded + " ml of milk");
                    System.out.println(beansAdded + " g of coffee beans");
                    System.out.println(cupsAdded + " of disposable cups");
                    System.out.println("$" + moneyStart + " of money");
                    break;


                }
                case "buy": {
                    int waterAdded;
                    int milkAdded;
                    int beansAdded;
                    int cupsAdded;
                    int money;

                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    int coffee = input.nextInt();
                    switch (coffee) {
                        case 1: {
                            waterAdded = waterStart - 250;
                            milkAdded = milkStart;
                            beansAdded = beansStart - 16;
                            cupsAdded = cupsStart - 1;
                            money = moneyStart + 4;
                            System.out.println("The coffee machine has: ");
                            System.out.println(waterAdded + " ml of water");
                            System.out.println(milkAdded + " ml of milk");
                            System.out.println(beansAdded + " g of coffee beans");
                            System.out.println(cupsAdded + " of disposable cups");
                            System.out.println("$" + money + " of money");
                            break;
                        }
                        case 2: {
                            waterAdded = waterStart - 350;
                            milkAdded = milkStart - 75;
                            beansAdded = beansStart - 20;
                            cupsAdded = cupsStart - 1;
                            money = moneyStart + 7;
                            System.out.println("The coffee machine has: ");
                            System.out.println(waterAdded + " ml of water");
                            System.out.println(milkAdded + " ml of milk");
                            System.out.println(beansAdded + " g of coffee beans");
                            System.out.println(cupsAdded + " of disposable cups");
                            System.out.println("$" + money + " of money");
                            break;

                        }

                        case 3: {
                            waterAdded = waterStart - 200;
                            milkAdded = milkStart - 100;
                            beansAdded = beansStart - 12;
                            cupsAdded = cupsStart - 1;
                            money = moneyStart + 6;
                            System.out.println("The coffee machine has: ");
                            System.out.println(waterAdded + " ml of water");
                            System.out.println(milkAdded + " ml of milk");
                            System.out.println(beansAdded + " g of coffee beans");
                            System.out.println(cupsAdded + " of disposable cups");
                            System.out.println("$" + money + " of money");
                            break;
                        }
                    }
                    break;
                }


                case "take": {

                    int giveMoney = 0;
                     System.out.println("I gave you $" + moneyStart);
                    System.out.println();
                    System.out.println("The coffee machine has: ");
                    System.out.println(waterStart + " ml of water");
                    System.out.println(milkStart + " ml of milk");
                    System.out.println(beansStart + " g of coffee beans");
                    System.out.println(cupsStart + " of disposable cups");
                    System.out.println("$" + giveMoney + " of money");
                    break;
                }


            }



    }
}




