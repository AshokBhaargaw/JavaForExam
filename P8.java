class P8{
    public static void main(String[] args){
        double hours = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double minimumWage = 4.35;
        double weekhours = 40;
        if(rate < minimumWage){
            System.err.println("Warning: Pay rate is less then minimum wage " + minimumWage + " per hour");
        }
        if(hours > weekhours){
            System.err.println("Warning: employee is working less then weekly limit of " + weekhours + " hours");
        }

        double total = hours * rate;
        System.out.println("Total pay due: $" + total);
    }
}