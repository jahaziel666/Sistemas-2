/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

/**
 *
 * @author Uriel
 */
public class Challenge {
    public static int Adittion(int num){
        return num + 1;    
    }
    public static int power(int voltage, int current){
    return voltage*current;
    }
    public static boolean isSameNum(int x,int y){
    boolean same = false;
    if (x == y){
    same = true;
    }
    return same;
    }
    public static int nextEdge(int side1, int side2){
    return (side1 + side2) -1;
    }
    public static String helloName(String name){
    return "Hello " + name + "!";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
