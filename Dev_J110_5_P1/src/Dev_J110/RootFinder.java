package Dev_J110;

import java.util.function.Function;


//Это класс, который умеет искать корни уравнения методом половинного деления.
public class RootFinder {
    
    public static double rf(Function<Double, Double> f, double from, double to, double precision) {
        
        if(Math.signum(f.apply(from)) == Math.signum(f.apply(to)))
            throw new IllegalArgumentException("Границы интервала заданы некорректно. Невозможно использовать метод половинного деления.");
        
        double middle = (from + to) / 2;
        while((middle - from) >= precision) {
             if(Math.signum(f.apply(from)) != Math.signum(f.apply(middle))) {
                 to = middle; }
             if(Math.signum(f.apply(middle)) != Math.signum(f.apply(to))) {
                 from = middle; }
             
             middle = (from + to) / 2;
        }        
        return middle;
    } 
}
