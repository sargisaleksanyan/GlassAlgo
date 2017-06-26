package model.Graph;

import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.Kohonen;
import org.neuroph.nnet.Perceptron;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by sargis on 3/7/17.
 */
public class Graph {

   // private double data[];
    private short input_size;
    private short output_size;
    private  NeuralNetwork neuralNetwork; /*= new Kohonen(2, 1);*/
    public Graph(/*double[] data,*/int input_size,int output_size) {
        neuralNetwork = new Perceptron(input_size, output_size);
        this.input_size= (short) input_size;
        this.output_size= (short) output_size;
       // this.data = data;
    }
    public void teachGraphXOR()
    {
        DataSet trainingSet = new DataSet(input_size, output_size);
        trainingSet.addRow(new DataSetRow(new double[]{0,0},new  double[]{0}));
        trainingSet.addRow(new DataSetRow(new double[]{0,1},new  double[]{1}));
        trainingSet.addRow(new DataSetRow(new double[]{1,0},new  double[]{1}));
        trainingSet.addRow(new DataSetRow(new double[]{1,1},new  double[]{1}));
        neuralNetwork.learn(trainingSet);
        neuralNetwork.save("text.txt");

    }
     public static NeuralNetwork getNetwork(String pathName)
    {
        FileInputStream fs=null;
        NeuralNetwork  neuralNetwork=null;
        ObjectInputStream os=null;
        try {
            fs=new FileInputStream(pathName);
            os=new ObjectInputStream(fs);
            neuralNetwork= (NeuralNetwork) os.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
         finally {
             if(fs!=null && os!=null)
             {
                try {
                    fs.close();
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return neuralNetwork;
    }

    public double getdataOutput(double input[])
    {
        NeuralNetwork net=getNetwork("text.txt");
        net.setInput(input);
        net.calculate();
        double outputnumbers[]=net.getOutput();
        return outputnumbers[0];
    }
  /*  public void teachGraph() {
        DataSet trainingSet = new DataSet(input_size, output_size);
        short size= (short) (input_size+output_size);
        for(int i=0;i<data.length;i+=size)
        {
            byte count=0;
            double input[]=new double[input_size];
            double output[]=new double[output_size];

            while(count<size-output_size)
            {
                // System.out.print(" input"+count+" =  "+data[i+count]);
                input[count]=data[i+count];
                count++;
            }
            while(count!=size)
            {
                output[count-input_size]=data[i+count];
                // System.out.print(" output "+data[i+count]);
                count++;
            }
            trainingSet.addRow(new DataSetRow(input, output));
        }

        neuralNetwork.learn(trainingSet);
        System.out.println("hellow world");
        neuralNetwork.setInput(new double[]{4, 5});
        System.out.println( neuralNetwork.getOutput()[0]);
        neuralNetwork.calculate();
    }*/
}