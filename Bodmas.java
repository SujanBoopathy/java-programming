/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roundTwoProblems;

/**
 *
 * @author Saubali
 */
import java.util.*;
public class Bodmas {
    public static int addValue(int val){
        int temp=0;
        while(val>0){
            temp+=(val%10);
            val/=10;
        }
        return temp;
    }
    public static int subValue(int val,int val2){
        int a=val%10;
        val/=10;
        int b=val%10;
        int temp=b-a;
        while(val2>0){
            temp+=(val2%10);
            val2/=10;
        }
        return temp;
    }
    public static int multiplyValue(int val){
        int temp=1;
        while(val>0){
            temp*=(val%10);
            val/=10;
        }
        return temp;

        
    }
    public static int divideValue(int val,int val2){
        int a=val%10;
        val/=10;
        int b=val%10;
        int temp=b/a;
        while(val2>0){
            temp+=(val2%10);
            val2/=10;
        }
        return temp;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String h=sc.next();
        List<String> s=new ArrayList<String>();
        List<Character> op=new ArrayList<Character>();
        String t="";
        for(int i=0;i<h.length();i++){
            if(h.charAt(i)=='+' || h.charAt(i)=='-' || h.charAt(i)=='*' || h.charAt(i)=='/'){
                op.add(h.charAt(i));
                if(!t.equals("")){
                    s.add(t);
                }
                t="";
                
            }
            else{
                t+=h.charAt(i);
            }
        }
        s.add(t);
        int res=0;
        
        Iterator<String> num=s.iterator();
        Iterator<Character> operator=op.iterator();
        
        while(num.hasNext() || operator.hasNext()){
            Character ch=operator.next();
            String ch2=num.next();
            System.out.println(ch+" "+ch2);
            int z;
            switch(ch){
                case '+':
                    z=addValue(Integer.parseInt(ch2));
                    System.out.println(z);
                    res+=z;
                    break;
                case '-':
                    z=subValue(Integer.parseInt(ch2.substring(0,2)),Integer.parseInt(ch2.substring(2,ch2.length())));
                    System.out.println(z);
                    res+=z;
                    break;
                case '*':
                    z=multiplyValue(Integer.parseInt(ch2));
                    System.out.println(z);
                    res+=z;
                    break;
                case '/':
                    z=divideValue(Integer.parseInt(ch2.substring(0,2)),Integer.parseInt(ch2.substring(2,ch2.length())));
                    System.out.println(z);
                    res+=z;
                    break;
            }
        }
        System.out.println(res);
    }
}
