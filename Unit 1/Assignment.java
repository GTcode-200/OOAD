import java.util.*;


public class Assignment
{
    public static void main(String[] args) {

        Card card1=new Card("Club","1");
        Card card2=new Card("Diamond","2");
        Card card3=new Card("Spade","3");
        Card card4=new Card("Heart","4");
      
        Pile pile=new Pile();
        Scanner s=new Scanner(System.in);
        int op;
        while(true)
        {
            System.out.println("1.Place");
            System.out.println("2.Draw");
            System.out.println("3.Peek");
            System.out.println("4.Exit\n");
            op=s.nextInt();

            switch(op)
            {
                case 1:
                if((pile.top)!=pile.capacity)
                {
                System.out.println("Enter card number");
                int card_no=s.nextInt();
                if(card_no==1)
                pile.place(card1);
                else if(card_no==2)
                pile.place(card2);
                else if(card_no==3)
                pile.place(card3);
                else
                pile.place(card4);
                }
                else
                {
                    System.out.println("Stack overflow");
                }
                break;
                case 2:
                if(pile.top!=-0)
                {
                    pile.draw();
                }
                else
                System.out.println("Stack underflow");
                break;
                case 3:
                pile.peek();
                break;
                case 4:
                System.exit(1);

            }

        }
    }
}

class Card
{
    String suit,value;

    Card(String suit,String value)
    {
        this.suit=suit;
        this.value=value;
    }

    void display()
    {
        System.out.println("Suit="+this.suit+" Value="+this.value);
    }
}

class Pile{
    int top=0;
    int capacity=10;
    int temp=0;
    Card arr[]=new Card[capacity];

    void place(Card card)
    { 
        arr[top]=card;
        top++;
        System.out.println("Card is placed successfully");
    }

    void draw()
    { 
        System.out.print("Card drawn is =");arr[top-1].display();
        top--;
    }

    void peek()
    {
        arr[top-1].display();
    }

}

//GANESH TARUN S R