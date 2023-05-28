import java.util.Scanner;

 public class Exercise {  
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//creamos un objeto de tipo scanner

        boolean nameTry = true;//creamos una variable de tipo boleano
        String name;

        do { //inicialisamos un bucle para comprobar el nombre del usuario
 
        System.out.print("Enter your name: "); // pedimos el nombre al usuario
        name = scanner.next();
         
        //condicionamos la variable name
        if (name.equals("Sam") || name.equals("SAM") || name.equals("sam") ) {
            System.out.print( "you can enter the house " + name);
            nameTry = false;
        } else{
            System.out.println("try again!!");
        }

    }while(nameTry); // condicionamos el bucle
    
    }
 }
 