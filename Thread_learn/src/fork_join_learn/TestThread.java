/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fork_join_learn;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author Walton
 */
public class TestThread {
    public static void main(final String[] arguments) throws InterruptedException, 
      ExecutionException {
      
      int nThreads = Runtime.getRuntime().availableProcessors();
      System.out.println(nThreads);
      
      int[] numbers = new int[90000000]; 

      for(int i = 0; i < numbers.length; i++) {
         numbers[i] = i;
      }
      
      ForkJoinPool forkJoinPool = new ForkJoinPool(nThreads);
      long startTime = System.nanoTime();
      Long result = forkJoinPool.invoke(new Sum(numbers,0,numbers.length));
      System.out.println(result);
      long endTime   = System.nanoTime();
      long totalTime = endTime - startTime;
      
      System.out.println("Parallel Running Time"+(double)totalTime/1000000000);
      
      
      
      startTime = System.nanoTime();
      long sum=0;
      for(int i = 0; i < numbers.length; i++) {
         sum+=numbers[i];
      }
      System.out.println(sum);
      endTime   = System.nanoTime();
      totalTime = endTime - startTime;
      
      System.out.println("Sequential Running Time"+(double)totalTime/1000000000);
      
   }  
}
