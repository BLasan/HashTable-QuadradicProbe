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
public class QuadradicProbes {
    
    int temp,flag;
    int size=11;
    int[] table=new int[size];
    
    protected void insert(int key){
        
        int pos=key%size;
        if(table[pos]==0){
            table[pos]=key;
            System.out.println("Done");
        }
        else{
            for(int i=pos+1;i!=size/2;i=(i+1)%size){
               temp=(key+i*i)%size;
               if(table[temp]==0||table[temp]==-999){
                   table[temp]=key;
                   flag=1;
                   break;
               }
               else
                   flag=0;
               
            }
            if(flag==1)
                System.out.println("Done");
            
            else
                System.out.println("Not inserted");
        }
    }
    
    protected int search(int key){
        
        int pos=key%size;
        if(table[pos]==key)
            return pos;
        
        else{
            
            for(int i=pos+1;i!=pos;i=(i+1)%size){
                
                if(table[i]==key){
                    
                    return i;
                }
                    
                
                else
                    continue;
            }
        }
        
        return -1;
            
    }
    
    protected void deleted(int key){
        
        int pos=key%size;
        if(table[pos]==key)
            table[pos]=-999;
        
        else{
            
            for(int i=pos+1;i!=pos;i=(i+1)%size){
                
                if(table[i]==key){
                    
                    table[i]=-999;
                    break;
                }
                
                else
                    continue;
            }
        }
    }
    
    protected void display(){
        
        for(int i=0;i<size;i++){
            
            if(table[i]==0||table[i]==-999)
                continue;
            
            else
                System.out.print(table[i]+"->");
        }
        
        System.out.println();
    }
}
