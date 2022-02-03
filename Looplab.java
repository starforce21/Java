public class Looplab{
    public static void main(String args[]){
        // int a,b,c=1,sum=0,d=2;
        // for(a=1;a<=10;a+=2)
        // {
        //     System.out.println("Jack");
        // }
        // for(b=1;b<=15;b++)
        // {
        //     System.out.print('*');
        // }
        // System.out.println();
        // while(c<=20){
        //     sum+=c;
        //     c++;
        // }
        // System.out.println(sum);
        // while(d<=20)
        // {
        //     System.out.print(d);
        //     d+=2;
        // }
        // System.out.println();
        // int i,x;
        // for(i=0;i<=1;i++){
        //     for(x=1+i;x<=9+i;x+=2){
        //         System.out.print(x);
        //         if(x!=9+i){
        //         System.out.print(',');   
        //         }  
        //     }
        //     System.out.println();
        // }
        int x,y;
        boolean prime=true;
        for(x=1;x<=20;x++)
        {
            for(y=2;y*y<=x;y++)
            {
                if(x%y>0)
                {
                    prime=true;
                }
                else
                {
                    prime=false;
                    break;
                }
            }
            System.out.print(x);
            System.out.println(prime?" is Prime":" is not Prime");
        }
    }
}