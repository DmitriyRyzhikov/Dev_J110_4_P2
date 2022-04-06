
package Dev_J110;


public class Main {
    
    public static void main(String[] args) {
               
       //Вызов метода поиска корней уравнения - реализация функционального интерфейса Function через
       //вложенный класс Exponenta.
       double rootExponenta = RootFinder.rootFinder(new Exponenta(), 0.01, 2, 0.00005);
       
       //Вызов метода поиска корней уравнения - реализация функционального интерфейса Function через
       //анонимный внутренний класс.
       double rootSinus = RootFinder.rootFinder(new Function() {
           @Override
           public double getValue(double argument) {
               return Math.sin(argument) - 0.75; }
       }, 2, 3, 0.00005);
       
       //Вызов метода поиска корней уравнения - реализация функционального интерфейса Function через
       //ссылку на метод экземпляра.
       Function tangens = new Tangens();
       double rootTangens = RootFinder.rootFinder(tangens :: getValue, 2, 4, 0.00005);
       
       
       Function lgNaturel = new LgNaturel();
       double rootLgNaturel = RootFinder.rootFinder(lgNaturel, 1, 3, 0.00005);
       
       //Вызов метода поиска корней уравнения - реализация функционального интерфейса Function через
       //лямбда-выражение.
       double rootCube = RootFinder.rootFinder((double argument) -> Math.pow(argument, 3) - 8*argument + 2, 1, 5, 0.00005);
       
       //Печатаем результат - вычисленные корни уравнения.
        System.out.println("rootExponenta = " + rootExponenta + "\nrootSinus = " + rootSinus + 
                           "\nrootTangens = " + rootTangens + "\nrootLgNaturel = " + rootLgNaturel + 
                           "\nrootCube = " + rootCube);
    }

    private static class Exponenta implements Function {

        @Override
        public double getValue(double exp) {
            return Math.exp(-exp) - 0.5;
        }
    }
    
}
