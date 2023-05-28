import java.util.Scanner;

public class Index{ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        /*programa que condicione si una persona es mayor de 14 años puede entrar a ver la pelicula
         Fredy's y si es menor no puede entrar a ver la pelicula*/

      
        int age; //inicializamos la variable de tipo entero int

        System.out.print("Enter your name: "); //pedimos mediante consola el nombre del usuario
        String name = scanner.nextLine(); //guardamos en la variable instanciada de tipo String que guarda caracteres

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if(age >= 14){ //consicionamos que la edad sea mayor o igual a 14 años para que pueda entrar
            System.out.print("Congratulations " + name + ", you can enter to see the Freddy's movie :) ");
        }else { //si no tiene 14 o mas le mandamos un mensage de error
            System.out.print("Sorry " + name + ", you can't enter to see the Freddy's movie :(");
        }
        
    }
}