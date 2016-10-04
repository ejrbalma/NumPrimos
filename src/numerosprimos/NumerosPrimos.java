
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

                private int index = 1;
                List <Integer> listPrimes  = new ArrayList <> ();
                
                
                @Override
                public boolean hasNext() {
                    return index < max;
                }

                @Override
                public Integer next() {
                    while   (!isPrime (++index));
                    return index;
                }
                
                private boolean isPrime (int num){
                    for (Integer prime : listPrimes) {
                        if (num % prime == 0) return false;
                    }
                    listPrimes.add(num);
                    return true;
                }
                
            };
        }
        
        }
}
