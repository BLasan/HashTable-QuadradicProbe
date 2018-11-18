/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadradicprobes;
import java.util.*;
/**
 *
 * @author Benura
 */
public class Run {
   
    public static void main(String[] args){
        
        QuadradicProbes obj=new QuadradicProbes();
        System.out.println("Enter the size");
        Scanner sc=new Scanner(System.in);
        int sz=sc.nextInt();
       
        System.out.println("Enter the values");
        for(int i=0;i<sz;i++){
            int num=sc.nextInt();
            obj.insert(num);
        }
        
        obj.display();
       
        int num=obj.search(22);
        if(num==-1)
            System.out.println("Not exist");
        
        else
            System.out.println("Position"+num);
    }
}
