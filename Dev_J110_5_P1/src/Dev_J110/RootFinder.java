
package Dev_J110;


public class RootFinder {
    
    public static double rootFinder(Function f, double from, double to, double precision) {
        
        if(Math.signum(f.getValue(from)) == Math.signum(f.getValue(to)))
            throw new IllegalArgumentException("Границы интервала заданы некорректно. Невозможно использовать метод половинного деления.");
        
        double middle = (from + to) / 2;
        while((middle - from) >= precision) {
             if(Math.signum(f.getValue(from)) != Math.signum(f.getValue(middle))) {
                 to = middle; }
             if(Math.signum(f.getValue(middle)) != Math.signum(f.getValue(to))) {
                 from = middle; }
             
             middle = (from + to) / 2;
        }        
        return middle;
    }   
}
