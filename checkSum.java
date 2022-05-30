/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roundTwoProblems;

/**
 *
 * @author Sujan
 */
import java.util.*;
public class checkSum {
    public static void main(String args[]){     
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int value=sc.nextInt();
        
        List<Integer> list=new ArrayList<Integer>();
        while(value>0){
            list.add(value%10);
            value/=10;
        }
        ListIterator<Integer> itr=list.listIterator();
        int sum=0;
        while(itr.hasNext()){
            int index=itr.nextIndex();
            int val=itr.next();
            if(index%2==0){
                int temp=val;
                temp*=2;
                if(temp>10){
                    temp-=9;
                }
                sum+=temp;
                list.set(index,temp);
            }
            else{
                sum+=val;
            }
        }
        if(sum%10==0){
            System.out.println(0);
        }
        else{
            System.out.println(10-(sum%10));
        }
    }
}
