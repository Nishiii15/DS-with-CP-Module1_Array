class sum{
int sumoftwo(int a,int b){
    int c=a+b;
    return c;
   }
 }

class Main {
    public static void main(String[] args){
        System.out.println("Try programi.pro");
        sum a = new sum();
        int result =a.sumoftwo(15,23);
        System.out.println("result="+result);
    }
        
}
