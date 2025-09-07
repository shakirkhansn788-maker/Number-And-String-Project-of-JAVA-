import java.util.*;

class MAINCLASSOFTHISPROJECT
{
        
        Scanner a = new Scanner(System.in);
        int input;
        void info(){
        do{
        System.out.println("\n\n\t\t\t\tMy new Project\n");
        System.out.println("\n\t\t\t1.String Project\t\t2.Number Project\t\t3.Exit\n");
        System.out.print("\n\t\tEnter..");
        input = a.nextInt();
           if(input == 1)
           {
              STRINGMAINPROJECT s = new STRINGMAINPROJECT();
              s.STRINGmainMudule();       
           }
           else if(input == 2)
           {
             NUMBERMAINPROJECT n = new NUMBERMAINPROJECT();
             n.NUMBERMainModul();
           }
         else if(input > 3)
         {
            System.out.println("\n\t\tWrong input please Try again");
         }
        } while(input != 3);
        
        
    }
}

class STRINGMAINPROJECT
{
    String s[][] = {
            {" XXX  XXXX  XXXXX XXXX  XXXXX XXXXX XXXXX X   X XXXXX XXXXX X   X X     X   X X   X  XXX  XXXX   XXX  XXXX  XXXX  XXXXX X   X X   X X   X X   X X   X XXXXX "},
            {"X   X X   X X     X   X X     X     X     X   X   X      X  X  X  X     XX XX XX  X X   X X   X X   X X   X X   X   X   X   X X   X X   X  X X   X  X    X  "},
            {"XXXXX XXXX  X     X   X XXXX  XXXX  X XXX XXXXX   X      X  XX    X     X X X XXX X X   X XXXX  X   X XXXX    X     X   X   X  X X  X X X   X     XX    X   "},
            {"X   X X   X X     X   X X     X     X   X X   X   X   X  X  X  X  X     X   X X  XX X   X X     X X X X  X  X   X   X   X   X  X X  XX XX  X X     X   X    "},
            {"X   X XXXX  XXXXX XXXX  XXXXX X     XXXXX X   X XXXXX XXXX  X   X XXXXX X   X X   X  XXX  X      XX X X   X  XXXX   X    XXX    X   X   X X   X   X   XXXXX "}
        };

    void AllPrint()
    {
        int choice;
        Scanner x = new Scanner(System.in);
        System.out.println("\n\n");
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.println(s[i][j]);
            }
        }
        System.out.print("\n\t\t\t\tIf you want to continue press-1...");
        choice = x.nextInt(); 
        if(choice == 1)
        {
           STRINGmainMudule();
        }
    } 

    void SingleChar()
    {
        int choice;
        System.out.println("\n\n");
        Scanner x = new Scanner(System.in);
        char c[];
        System.out.print("\n\t\t\t\tEnter a Character : ");
        String s1 = x.nextLine();
        int i , j , cut ;
        int p = Character.toUpperCase(s1.charAt(0)) - 64;
        cut = 6*(p-1);
        for(i = 0 ; i < 5 ; i++){
             c = String.valueOf(s[i][0]).toCharArray(); 
                for(j = cut ; j < cut+6 ; j++){
                    System.out.print(c[j]);
                }
                 System.out.println();
            }

        System.out.print("\n\t\t\t\tIf you want to continue press-1...");
        choice = x.nextInt(); 
        if(choice == 1)
        {
            STRINGmainMudule();
        }
    }

    void NamePrint()
    {
        int choice;
        System.out.println("\n\n");
        Scanner x = new Scanner(System.in);
        char c[];
        System.out.print("\n\t\t\t\tEnter a String : ");
        String s1 = x.nextLine();
        int i , j , cnt , p ;
        for(i = 0 ; i < 5 ; i++){
            for(int k = 0 ; k < s1.length(); k++){
                p = Character.toUpperCase(s1.charAt(k)) - 64;
                cnt = 6*(p-1);
                c = String.valueOf(s[i][0]).toCharArray();
                for(j = cnt ; j < cnt+6 ; j++){
                    System.out.print(c[j]);
                }
            }
            System.out.println();
        }
        System.out.print("\n\t\t\t\tIf you want to continue press-1...");
        choice = x.nextInt(); 
        if(choice == 1)
        {
           STRINGmainMudule();
        }
    }

    void RangePrint()
    {
        int choice;
        System.out.println("\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t\t\t\tEnter first character: ");
        char first = Character.toUpperCase(sc.next().charAt(0));

        System.out.print("\t\t\t\tEnter second character: ");
        char second = Character.toUpperCase(sc.next().charAt(0));

        if (first > second) {
            char temp = first;
            first = second;
            second = temp;
        }

        int letterWidth = 6;

        int start = (first - 'A') * letterWidth;
        int end   = (second - 'A' + 1) * letterWidth;

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i][0].substring(start, end));
        }

        System.out.print("\n\t\t\t\tIf you want to continue press-1...");
        choice = sc.nextInt(); 
        if(choice == 1)
        {
            STRINGmainMudule();
        }
    }

     void STRINGmainMudule()
     {
         Scanner x = new Scanner(System.in);
         int num;
         do{
        System.out.println("\n\n\t\t\t-------------------------String Project-------------------------");
        System.out.println("\n\t\t\t\t1.All Character\t\t\t2.Single Character");
        System.out.println("\n\t\t\t\t3.Print Name\t\t\t4.Range of Character\n\n\t\t\t\t5.Back");
        System.out.print("\n\t\t\t\tEnter..");
         num = x.nextInt();
        if(num == 1){
           AllPrint();
        }
        else if(num == 2){
             SingleChar();
        }
        else if(num == 3){
            NamePrint();
        }
        else if(num == 4){
            RangePrint();
        }
        else if(num > 5)
        {
            System.out.println("\n\t\t\t\tWrong input! try again..");
        }
      }while (num != 5);
        
     }
}

class NUMBERMAINPROJECT
{
     Scanner sc = new Scanner(System.in);
     String num;
     String s[][] = {
            {" XXX   XX   XXXXX XXXXX X   X XXXXX XXXXX XXXXX XXXXX XXXXX"},
            {"X   X X X       X     X X   X X     X         X X   X X   X"},
            {"X   X   X   XXXXX XXXXX XXXXX XXXXX XXXXX    X  XXXXX XXXXX"},
            {"X   X   X   X         X     X     X X   X   X   X   X     X"},
            {" XXX  XXXXX XXXXX XXXXX     X XXXXX XXXXX   X   XXXXX XXXXX"}
        };

        void AllNumber()
        {
                 for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.println(s[i][j]);
            }
        }
        }

      void AnyNumber()
      {      
        System.out.print("Enter a number: ");
        num = sc.nextLine();
        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < num.length(); i++) {
                int digit = num.charAt(i) - '0'; 
                System.out.print(s[row][0].substring(digit * 6, digit * 6 + 5) + "  ");
            }
            System.out.println();
        }
      }
       void RangeOfNumber()
       {
        
           Scanner sc = new Scanner(System.in);
        int f , l ;
        System.out.print("\n\t\tEnter First number : "); 
        f = sc.nextInt() ;
        System.out.print("\n\t\tEnter last number : ");
        l = sc.nextInt();
        if(f < 0 || l > 9 || f > l){

             System.out.println("Range 0-9 only");
              return; 
            
            }

        for(int n = f; n <= l; n++) {
            System.out.println("\nNumber: " + n);
            for(int r = 0; r < s.length; r++)
                System.out.println(s[r][0].substring(n*6, n*6+5));
        }
       }
      void NUMBERMainModul()
      {
        int n;
        do{
        System.out.println("\n\n\t\t\t-------------------------Number Project-------------------------");
        System.out.println("\n\t\t\t\t1.All Number\t\t\t2.Any Number\n\n\t\t\t\t3.Range in Number\t\t4.Back");
      
        System.out.print("\n\t\t\t\tEnter..");
         num = sc.nextLine();
         n = Integer.valueOf(num);
        if(n == 1){
          AllNumber();
        }
        else if(n == 2)
        {
             AnyNumber();
        }
        else if(n == 3)
        {
            RangeOfNumber();
        }
        else 
        {
            System.out.println("\n\t\t\t\tWrong input! try again..");
        }
      }while (n != 4);
      }
}

public class MynewProject
{
    public static void main(String []args)
    {
      MAINCLASSOFTHISPROJECT m = new MAINCLASSOFTHISPROJECT();
      m.info();
    }
}