public class HelloWorld {
    public static void main(String[] args){

        String greetings = "Hello world from Java";
        System.out.println(greetings);
        System.out.println("greetings.toUpperCase() = " + greetings.toUpperCase());
        //Different ways to edit a text through Java.

        int number = 10; //variable integer

        boolean value = true;
        int number2 = 5;
        if(value){
            System.out.println("number = " + number);
            int number3 = 7;
        }

        System.out.println("number2 = " + number2);

        var number4 = 15;
        //The use of "" transforms var into a String. It can be used in any object and class.
    }
    
}
