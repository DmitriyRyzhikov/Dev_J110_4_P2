
package Dev_J110;

import java.util.function.Function;

public class Main {
    
    public static void main(String[] args) {
               
       /*Вызов метода поиска корней уравнения - с использованием реализации функционального интерфейса 
       Function через вложенный класс Exponenta. */
       double rootExpon = RootFinder.rf(new Exponenta(), 0.01, 2, 0.00005);
       
       /*Вызов метода поиска корней уравнения - с использованием реализации функционального интерфейса 
       Function через анонимный внутренний класс. */
       double rootSinus = RootFinder.rf(new Function<Double, Double>() {
           @Override
           public Double apply(Double argument) {
               return Math.sin(argument) - 0.75; }
       }, 2, 3, 0.00005); 
        
       /*Вызов метода поиска корней уравнения - с использованием реализации функционального интерфейса
       Function через ссылку на метод экземпляра.*/
       Tangens tangens = new Tangens();
       double rootTan = RootFinder.rf(tangens::tan, 2, 4, 0.00005);
       
       /*Вызов метода поиска корней уравнения - с использованием реализации функционального интерфейса 
       Function через ссылку на статический метод.*/
       double rootLgNat = RootFinder.rf(LogNatural::log, 1, 3, 0.00005);
       
       /*Вызов метода поиска корней уравнения - с использованием реализации функционального интерфейса 
       Function через лямбда-выражение. */
       double rootCube = RootFinder.rf(argument -> Math.pow(argument, 3) - 8*argument + 2, 1, 5, 0.00005);
       
       //Печатаем результат - корни уравнений.
        System.out.println("Корень уравнения e^(-x)-0.5 = 0, равен " + rootExpon + 
                           "\nКорень уравнения Sin(x)-0.75 = 0, равен " + rootSinus + 
                           "\nКорень уравнения tg(x) = 0, равен " + rootTan + 
                           "\nКорень уравнения ln(x\u00B3)-2 = 0, равен " + rootLgNat + 
                           "\nКорень уравнения x\u00B3-8x+2 = 0, равен " + rootCube);
    }

    //Вложенный класс Exponenta.
    private static class Exponenta implements Function<Double, Double>{

        @Override
        public Double apply(Double exp) {
            return Math.exp(-exp) - 0.5;
        }
    }  
}
