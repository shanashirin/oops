class CPU{
double price;
CPU(double price){
this.price=price;
}
class Processor{
int cores;
String manufacturer;
Processor(int cores,String manufacturer){
this.cores=cores;
this.manufacturer=manufacturer;
}
void displayProcessor(){
System.out.println("Processor Information:");
System.out.println("Number of cores:"+cores);
System.out.println("Manufacturer:"+manufacturer);
}
}
static class RAM{
int memory;
String manufacturer;
RAM(int memory,String manufacturer){
this.memory=memory;
this.manufacturer=manufacturer;
}
void displayRAM(){
System.out.println("\nRAM information:");
System.out.println("Memory size:"+memory+"GB");
System.out.println("Manufacturer:"+manufacturer);
}
}
void displayCPU(){
System.out.println("\nCPU price:"+price);
}
public static void main(String[] args){
CPU cpu=new CPU(30000);
CPU.Processor processor=cpu.new Processor(8,"intel");
CPU.RAM ram=new CPU.RAM(16,"samsung");
cpu.displayCPU();
processor.displayProcessor();
ram.displayRAM();
}
}
