class FibRunnable implements Runnable{
int count;
FibRunnable(int count){
this.count=count;
}
public void run(){
int a=0,b=1,c;
System.out.println("Fibonacci Series:");
for(int i=0;i<count;i++){
System.out.print(a+" ");
c=a+b;
a=b;
b=c;
}
System.out.println();
}
}
class EvenRunnable implements Runnable{
int start,end;
EvenRunnable(int start,int end){
this.start=start;
this.end=end;
}
public void run(){
System.out.println("Even Number:");
for(int i=start;i<=end;i++){
if(i%2==0){
System.out.print(i+" ");
}
}
System.out.println();
}
}

public class ThreadMain{
public static void main(String[] args){
Runnable fib=new FibRunnable(10);
Thread fibThread=new Thread(fib);

fibThread.start();

Runnable even=new EvenRunnable(1,20);
Thread evenThread=new Thread(even);

evenThread.start();
}
}


