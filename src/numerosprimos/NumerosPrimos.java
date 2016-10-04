
package numerosprimos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumerosPrimos {

    public static void main(String[] args) {
        
    }

        private static class Primes implements Iterable<Integer> {
    
            private int max;

        public Primes(int max) {
            this.max = max;
        }
            
        public static Primes to (int max){
            return new Primes (max);
        } 

        @Override
        public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {

                @Override
                public boolean hasNext() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public Integer next() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
        }
        
        }
}
