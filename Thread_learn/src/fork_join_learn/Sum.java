/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fork_join_learn;

import java.util.concurrent.RecursiveTask;

/**
 *
 * @author Walton
 */
class Sum extends RecursiveTask<Long> {
      int low;
      int high;
      int[] array;

      Sum(int[] array, int low, int high) {
         this.array = array;
         this.low   = low;
         this.high  = high;
      }

      protected Long compute() {
         
         if(high - low <= 10) {
            long sum = 0;
            
            for(int i = low; i < high; ++i) 
               sum += array[i];
               return sum;
         } else {	    	
            int mid = low + (high - low) / 2;
            Sum left  = new Sum(array, low, mid);
            Sum right = new Sum(array, mid, high);
            left.fork();
            long rightResult = right.compute();
            long leftResult  = left.join();
            return leftResult + rightResult;
         }
      }
   }

