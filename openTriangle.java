// Aaron Prince Anu

class openTriangle {
    public static void main(String[] args) {
        // loop 
        while (true) {
            
            // get the 3 {#159, 2}
            System.out.println("\nEnter your character?");
            char character = In.getChar();
            
            // get amount {#747, 2}
            System.out.println("\nHow many times should it print? (-1 to exit)");
            int number = In.getInt();
            
            // if else to quit {#456, 5}
            if (number == -1) {
                System.out.println("\nExiting... \n");
                break;
            } else {
                printTriangle(character, number);
            }
        }
    }

    public static void printTriangle(char c, int n) {
        // first char line
        if (n > 0){
            System.out.println(c);
        }
         
        // the middle except the top line and the bottom line
        for(int i = 1; i < n-1; i++) {
            System.out.print(c);
           
            // for loop for spaces
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
           
            System.out.println(c);
        }
       
        // the bottom line
        for(int i = 1; i <= n; i++) {
            System.out.print(c);
        }
    }
}