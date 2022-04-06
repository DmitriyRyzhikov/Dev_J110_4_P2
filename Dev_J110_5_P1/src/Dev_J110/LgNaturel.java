
package Dev_J110;


public class LgNaturel implements Function{
    
   @Override
    public double getValue(double argument) {
     return Math.log(Math.pow(argument, 3)) - 2;
    }
}
