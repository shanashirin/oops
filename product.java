class Product{
String pcode,pname;
double price;
Product(String pcode,String pname,double price){
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
static Product findLowestPrice(Product p1,Product p2,Product p3){
if(p1.price<=p2.price && p1.price<=p3.price)
return p1;
else if(p2.price<=p1.price && p2.price<=p3.price)
return p2;
else
return p3;
}
void display(){
System.out.println("product code:"+pcode);
System.out.println("product name:"+pname);
System.out.println("product price:"+price);
}
public static void main(String[] args){
Product prod1=new Product("p001","Laptop",45000);
Product prod2=new Product("p002","Tablet",20000);
Product prod3=new Product("p003","Smartphone",30000);
Product lowest=findLowestPrice(prod1,prod2,prod3);
System.out.println("\nProduct with the lowest price:");
lowest.display();
}
}
