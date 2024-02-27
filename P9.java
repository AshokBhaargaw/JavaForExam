class circle{
    int radius;
    double area; 

    void getArea(){
        System.out.println("Enter radius of the circle:- ");
        radius = Integer.parseInt(System.console().readLine());
        area = 3.14 * radius * radius;
    }

    void printinfo(){
        System.out.println("Radius of circle is - " + radius);
        System.out.println("Area of the circle is:- " + area);
    }
}

class P9{
    public static void main(String[] args){
        circle gola = new circle();
        gola.getArea();
        gola.printinfo();
    }
    
}