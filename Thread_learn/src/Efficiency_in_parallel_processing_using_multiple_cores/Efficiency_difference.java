/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Efficiency_in_parallel_processing_using_multiple_cores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Walton
 */
public class Efficiency_difference {
    private static void processData() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List numList = new ArrayList();
        for (int i = 0; i < 10000; i++) {
        	numList.add(i);
        }
 
        // Processing sequentially
        long startTime = System.currentTimeMillis();
        numList.stream().forEach(i -> processData());
        long endTime = System.currentTimeMillis();
        double sequentialStreamTimetaken = (endTime - startTime) / 1000;
        System.out.println("Time required with stream() : " + sequentialStreamTimetaken);
 
        // Parallel processing 
        startTime = System.currentTimeMillis();
        numList.parallelStream().forEach(i -> processData());
        endTime = System.currentTimeMillis();
        long parallelStreamTimetaken = (endTime - startTime) / 1000;
        System.out.println("Time required with parallelStream() : " + parallelStreamTimetaken);
        System.out.println("Difference of time : " + (sequentialStreamTimetaken - parallelStreamTimetaken));
    }
}
