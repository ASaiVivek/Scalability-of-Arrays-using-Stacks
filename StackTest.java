import java.io.*;
import java.util.*;
class StackTest{
    public static int SIZE=10;
    public static int Growth=10;
    public static int Top=-1;
    public static int Stack[]=new int[SIZE];    
   void Push(int i){
       
       Top++;
       
       if(Top==SIZE){
           SIZE=SIZE+Growth;
           Stack=Arrays.copyOf(Stack,SIZE);
       }
       
       Stack[Top]=i;
   }
    void Pop(){
        if(Top==-1){
            System.out.println("Stack is Empty");
        }
        else{
            Top--;
        }
    }
    
    public static void main(String[] args){
        StackTest ST=new StackTest();
        ST.Push(3);
        ST.Push(4);
        ST.Push(5);
        ST.Push(3);
        ST.Push(4);
        ST.Push(5);
        ST.Push(3);
        ST.Push(4);
        ST.Push(5);
        ST.Push(5);
        ST.Push(5);
        ST.Push(5);
        ST.Push(5);
        for(int i=0;i<=Top;i++){
             System.out.println(Stack[i]);
        }
        ST.Pop();
        ST.Pop();
        System.out.println("POP");
        for(int i=0;i<=Top;i++){
             System.out.println(Stack[i]);
        }   
    }
}