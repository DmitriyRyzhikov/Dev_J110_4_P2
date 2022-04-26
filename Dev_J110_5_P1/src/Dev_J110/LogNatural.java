
package Dev_J110;


/*Класс LogNatural со статическим методом static double log(double argument). Функциональный интерфейс 
будет реализован через ссылку на этот статический метод.*/

public class LogNatural {
    
    public static double log(double argument) {
        
       return Math.log(Math.pow(argument, 3)) - 2;
    }
}
