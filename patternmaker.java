import java.util.Scanner;
public class patternmaker {
    static int l=12;
    static int width=23;

    static void printa(int n)
    {
        if(n==1)
        {
            System.out.print(" ");
            for(int i=1;i<l-1;i++)
            System.out.print("*");
            System.out.print(" ");
        }else if(n==(l/2 + 1))
        {
            for(int i=1;i<=l;i++)
            System.out.print("*");
        }
        else
        {
            System.out.print("*");
            for(int i=1;i<l-1;i++)
            System.out.print(" ");
            System.out.print("*");
        }
    }

    static void printb(int n)
    {
        if(n==1 || n==l)
        {
            for(int i=1;i<l-1;i++)
            System.out.print("*");
        }else if(n==(l/2 +1))
        {
            for(int i=1;i<l;i++)
            System.out.print("*");
            System.out.print(" ");
        }
        else{
            System.out.print("*");
            for(int i=1;i<=l-2;i++)
            System.out.print(" ");
            System.out.print("*");
        }
    }

    static void printc(int n)
    {
        if(n==1)
        {
            int c=0;
            for(int i=n;i<=(l/4);i++){
            System.out.print(" ");
            c++;
            }
            for(int i=1;i<=l-c;i++)
            System.out.print("*");

        }else if(n<=(l/4) && n!=1)
        {
            int c=0;
            for(int i=n;i<=(l/4);i++){
            System.out.print(" ");
            c++;
            }
            System.out.print("*");
            for(int i=1;i<l-c;i++)
            System.out.print(" ");
        }
        else if(n>(3*l/4) && n!=l)
        {
            int c=0;
            for(int i=n;i>(3*l/4);i--){
            System.out.print(" ");
            c++;}
            System.out.print("*");
            for(int i=1;i<l-c;i++)
            System.out.print(" ");
        }else if(n==l)
        {
            int c=0;
            for(int i=n;i>(3*l/4);i--){
            System.out.print(" ");
            c++;}
            for(int i=1;i<=l-c;i++)
            System.out.print("*");
        }
        else
        { 
            System.out.print("*");
            for(int i=1;i<l;i++)
            System.out.print(" ");
        }
    }
    static void printd(int n)
    {
        if(n==1)
        {
            int c=l/4;
            for(int i=1;i<=l-c;i++)
            System.out.print("*");
            for(int i =1;i<=c;i++)
            System.out.print(" ");

        }else if(n<=(l/4) && n!=1)
        {
            int c=(l/4)-n+1;
            System.out.print("*");
            for(int i=1;i<l-c-1;i++)
            System.out.print(" ");
            System.out.print("*");
            for(int i=1;i<=c;i++)
            System.out.print(" ");
        }
        else if(n>(3*l/4) && n!=l)
        {
            int c=n-3*(l/4)+1;
            System.out.print("*");
            for(int i=1;i<l-c;i++)
            System.out.print(" ");
            System.out.print("*");
            for(int i=1;i<c;i++)
            System.out.print(" ");
        }else if(n==l)
        {
            int c=n-3*(l/4)+1;
            System.out.print("*");
            for(int i=1;i<l-c;i++)
            System.out.print("*");
            System.out.print("*");
            for(int i=1;i<c;i++)
            System.out.print(" ");
        }
        else
        { 
            System.out.print("*");
            for(int i=1;i<l-1;i++)
            System.out.print(" ");
            System.out.print("*");
        }
    }

    static void printe(int n)
    {
        if(n==1 || n== l)
        {
            for(int i=1;i<=l;i++)
        System.out.print("*");
        }
        else if(n==l/2)
        {
            for(int i=1;i<=l/2+1;i++)
            System.out.print("*");
            for(int i=1;i<l/2;i++)
            System.out.print(" ");
        }
        else
        {
            System.out.print("*");
            for(int i=1;i<l;i++)
            System.out.print(" ");
        }
    }
    static void printf(int n)
    {
        if(n==1 )
        {
            for(int i=1;i<=l;i++)
        System.out.print("*");
        }
        else if(n==l/2)
        {
            for(int i=1;i<=l/2+1;i++)
            System.out.print("*");
            for(int i=1;i<l/2;i++)
            System.out.print(" ");
        }
        else
        {
            System.out.print("*");
            for(int i=1;i<l;i++)
            System.out.print(" ");
        }
    }

    static void printg(int n)
    {
        if(n<l/2)
            {
                if(n==1)
                {
                    for(int j=1;j<=l+1;j++)
                    System.out.print("*");
                }else{
                    System.out.print("*");
                    for(int j=1;j<=l;j++)
                    System.out.print(" ");
                }
            }else if(n==l/2){
                System.out.print("*");
                for(int j=1;j<l/2;j++)
                System.out.print(" ");
                for(int j=1;j<=l/2;j++)
                System.out.print("*");
                System.out.print("*");

            }else if(n==l){
                System.out.print("*");
                for(int j=1;j<=l/2;j++)
                System.out.print("*");
                for(int j=1;j<l/2;j++)
                System.out.print(" ");
                System.out.print("*");

            }else{
                System.out.print("*");
                for(int j=1;j<l/2;j++)
                System.out.print(" ");
                System.out.print("*");
                for(int j=1;j<l/2;j++)
                System.out.print(" ");
                System.out.print("*");
            }
    }

    static void printh(int n)
    {
        if(n==l/2)
        for(int i=1;i<=l;i++)
        System.out.print("*");
        else
        {
            System.out.print("*");
            for(int i=1;i<=l-2;i++)
            System.out.print(" ");
            System.out.print("*");
        }
    }
    static void printi(int n)
    {
        if(n==1 || n==l)
        {
            for(int i=1;i<=l;i++)
            System.out.print("*");
        }
        else{
            for(int i=1;i<=l/2;i++)
            System.out.print(" ");
            System.out.print("*");
            for(int i=1;i<l/2;i++)
            System.out.print(" ");

        }
    }
    static void printj(int n)
    {
        if(n==1)
        {
            for(int i=1;i<=l;i++)
            System.out.print("*");
        }
        else if(n>=(l/2+l/4) && n!=l)
        {
            System.out.print("*");
            for(int i=1;i<l/2;i++)
            System.out.print(" ");
            System.out.print("*");
            for(int i=1;i<l/2;i++)
            System.out.print(" ");
        }else if(n==l)
        {
            System.out.print("*");
            for(int i=1;i<l/2;i++)
            System.out.print("*");
            System.out.print("*");
            for(int i=1;i<l/2;i++)
            System.out.print(" ");
        }
        else{
            for(int i=1;i<=l/2;i++)
            System.out.print(" ");
            System.out.print("*");
            for(int i=1;i<l/2;i++)
            System.out.print(" ");

        }
    }
    static void printk(int n)
    {
        System.out.print("*");
            if(n<l/2)
            {
                for(int j=1;j<=l/2-n+1;j++)
                System.out.print(" ");
                System.out.print("*");
                for(int j=1;j<n;j++)
                System.out.print(" ");
            }else if(n==l/2)
            {
                System.out.print(" *");
                for(int j=1;j<l/2;j++)
                System.out.print(" ");
            }
            else{
                for(int j=1;j<=n-l/2;j++)
                System.out.print(" ");
                System.out.print("*");
                for(int j=n;j<l;j++)
                System.out.print(" ");
            }
    }
    static void printl(int n)
    {
        if( n==l)
        {
            for(int i=1;i<=l;i++)
            System.out.print("*");
        }
        else{
            System.out.print("*");
            for(int i=1;i<l;i++)
            System.out.print(" ");

        }
    }
    static void printm(int n)
    {
        if(n<=l/2+1)
            {
                System.out.print("*");
                for(int j=1;j<n;j++)
                System.out.print(" ");
                System.out.print("*");

                for(int j=l/2+1;j>n;j--)
                System.out.print(" ");
                for(int j=l/2+1;j>n;j--)
                System.out.print(" ");
                System.out.print("*");
                for(int j=1;j<n;j++)
                System.out.print(" ");
                System.out.print("*");


            }else{
                System.out.print("*");
                for(int j=1;j<=l+2;j++)
                System.out.print(" ");
                System.out.print("*");
            }
    }
    static void printn(int n)
    {
        System.out.print("*");
        if(n==1)
        {
            for(int i=1;i<l-1;i++)
            System.out.print(" ");
        }else if(n==l)
        {
            for(int i=1;i<l-1;i++)
            System.out.print(" ");
        }else
        {
            for(int i=1;i<n-1;i++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int i=l-2;i>=n;i--)
            {
                System.out.print(" ");
            }
        }
        System.out.print("*");
    }
    
    static void printo(int n)
    {
        if(n==1 || n==l)
        {
            for(int j=1;j<=l;j++)
            System.out.print("*");
        }else{
            System.out.print("*");
            for(int j=1;j<=l-2;j++)
            System.out.print(" ");
            System.out.print("*");
        }
    }
    static void printp(int n)
    {
        if(n==1 || n==l/2)
        {
            for(int i=1;i<l;i++)
            System.out.print("*");
            System.out.print(" ");
        }else if(n>1 && n<l/2)
        {
            System.out.print("*");
            for(int i=1;i<=l-2;i++)
            System.out.print(" ");
            System.out.print("*");
        }else
        {
            System.out.print("*");
            for(int i=1;i<l;i++)
            System.out.print(" ");
        }
    }
    static void printq(int n)
    {
        if(n<=(3*l/4))
            {
                if(n==1 || n==(3*l/4))
                {
                    for(int j=1;j<=l;j++)
                    System.out.print("*");
                }else{
                    System.out.print("*");
                    for(int j=1;j<=l-2;j++)
                    System.out.print(" ");
                    System.out.print("*");
                }
                for(int j=(3*l/4);j<l;j++)
                System.out.print(" ");
            }else{
                for(int j=1;j<=(3*l/4)+2;j++)
                System.out.print(" ");
                for(int j=(3*l/4);j<n;j++)
                System.out.print(" ");
                System.out.print("*");
                
                for(int j=n;j<l;j++)
                System.out.print(" ");

            }
   
    }
    static void printr(int n)
    {
        if(n<=l/2)
        {
            printp(n);
        }else{
            System.out.print("*");
            for(int j=0;j<=n-l/2+1;j++)
            System.out.print(" ");
            System.out.print("*");
            for(int j=0;j<=l-n+1;j++)
            System.out.print(" ");
        }
    }
    static void prints(int n)
    {
        for (int j = 1; j <= l; j++)  
        { 
            if ((n == 1 || n == l / 2 || n == l )) 
                System.out.print("*"); 
            else if (n < l / 2 && j == 1) 
                System.out.print("*"); 
            else if (n > l / 2 && j == l ) 
                System.out.print("*"); 
            else
                System.out.print(" "); 
        } 
    }
    static void printt(int n)
    {
        if(n==1)
        {
            for(int i=1;i<=l;i++)
            System.out.print("*");
        }else{
            for(int i=1;i<=l/2;i++)
            System.out.print(" ");
            System.out.print("*");
            for(int i=1;i<l/2;i++)
            System.out.print(" ");
        }
    }
    static void printu(int n)
    {
        if(n==l)
        {
            System.out.print(" ");
            for(int i=1;i<=l-2;i++)
            System.out.print("*");
            System.out.print(" ");
        }else{
            System.out.print("*");
            for(int i=1;i<=l-2;i++)
            System.out.print(" ");
            System.out.print("*");
        }
    }
    static void printv(int n)
    {
        for(int j=1;j<n;j++)
        System.out.print(" ");

        System.out.print("*");

        for(int j=0;j<=22-(2*n);j++)
        System.out.print(" ");
        
        if(n!=12)
        System.out.print("*");

        for(int j=1;j<n;j++)
        System.out.print(" ");
    }
    static void printw(int n)
    {
        if(n<l/2)
            {
                System.out.print("*");
                for(int j=1;j<=l+2;j++)
                System.out.print(" ");
                System.out.print("*");
            }else{
                System.out.print("*");
                for(int j=1;j<=l-n;j++)
                System.out.print(" ");
                System.out.print("*");
                for(int j=l/2;j<n;j++)
                System.out.print(" ");
                for(int j=l/2;j<n;j++)
                System.out.print(" ");
                System.out.print("*");
                for(int j=1;j<=l-n;j++)
                System.out.print(" ");
                System.out.print("*");

            }
    }
    static void printx(int n)
    {
        if(n<l/2)
            {
                for(int j=1;j<n;j++)
                System.out.print(" ");
                System.out.print("*");

                for(int j=l/2;j>n;j--)
                System.out.print(" ");
                for(int j=l/2;j>n;j--)
                System.out.print(" ");

                System.out.print("*");
                for(int j=1;j<n;j++)
                System.out.print(" ");

            }else if(n==l/2)
            {
                for(int j=1;j<l/2;j++)
                System.out.print(" ");
                System.out.print("**");
                for(int j=1;j<l/2;j++)
                System.out.print(" ");
            }else{
                for(int j=n;j<l;j++)
                System.out.print(" ");
                System.out.print("*");

                for(int j=l/2;j<n-1;j++)
                System.out.print(" ");
                for(int j=l/2;j<n-1;j++)
                System.out.print(" ");
                System.out.print("*");
                for(int j=n;j<l;j++)
                System.out.print(" ");

            }
    }
    static void printy(int n)
    {
        if(n<=l/2)
            {
                for(int j=1;j<n;j++)
                System.out.print(" ");
                System.out.print("*");

                for(int j=l/2;j>n;j--)
                System.out.print(" ");
                for(int j=l/2;j>n;j--)
                System.out.print(" ");

                System.out.print("*");
                for(int j=1;j<n;j++)
                System.out.print(" ");
            }else{
                for(int j=1;j<l/2;j++)
                System.out.print(" ");
                System.out.print("**");
                for(int j=1;j<l/2;j++)
                System.out.print(" ");
                
            }
    }
    static void printz(int n)
    {
        if(n==1 || n==l)
        {
            for(int i=1;i<=l;i++)
            System.out.print("*");
        }else{
            for(int i=1;i<=l-n;i++)
            System.out.print(" ");
            System.out.print("*");
            for(int i=n;i>2;i--)
            System.out.print(" ");
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word");
        String word=sc.next();
        word=word.toLowerCase();
        sc.close();
        System.out.println("Iterating");

        for(int i=1;i<=l;i++)
        {
            for(int index=0;index<word.length();index++)
            {
                char ch=word.charAt(index);
                try {
                    Thread.sleep(70);
                } catch (Exception e) {
                       
                }
            switch (ch) {

                case 'a':
                    printa(i);
                break;

                case 'b':
                    printb(i);
                break;

                case 'c':
                    printc(i);
                break;

                case 'd':
                    printd(i);
                break;

                case 'e':
                    printe(i);
                break;

                case 'f':
                    printf(i);
                break;

                case 'g':
                    printg(i);
                break;

                case 'h':
                    printh(i);
                break;

                case 'i':
                    printi(i);
                break;

                case 'j':
                    printj(i);
                break;

                case 'k':
                    printk(i);
                break;

                case 'l':
                    printl(i);
                break;

                case 'm':
                    printm(i);
                break;

                case 'n':
                    printn(i);
                break;

                case 'o':
                    printo(i);
                break;

                case 'p':
                    printp(i);
                break;

                case 'q':
                    printq(i);
                break;

                case 'r':
                    printr(i);
                break;

                case 's':
                    prints(i);
                break;

                case 't':
                    printt(i);
                break;

                case 'u':
                    printu(i);
                break;

                case 'v':
                    printv(i);
                break;

                case 'w':
                    printw(i);
                break;

                case 'x':
                    printx(i);
                break;

                case 'y':
                    printy(i);
                break;

                case 'z':
                    printz(i);
                break;
            }
            System.out.print("    ");
            }
            System.out.println();

        }
        
    }
        
}

