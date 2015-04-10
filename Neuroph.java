/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmib_4_4;

import org.neuroph.core.NeuralNetwork;

/**
 *
 * @author Prabhath
 */
public class Neuroph {
    
    
    public static void main(String [] args){
        
        NeuralNetwork network = NeuralNetwork.load("iris.nnet");
        network.setInput(0.8,0.67,4.5,0.08); 
        network.calculate();
        double[] output = network.getOutput();
       
        System.out.println(output[0]);
    }
}
