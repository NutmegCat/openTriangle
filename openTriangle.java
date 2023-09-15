class openTriangle {
    public static void main(String[] args) {
        // loop 
        while (true) {
            
            // get the 3 {#159, 2}
            System.out.println("\nEnter your character?");
            char character = In.getChar();
            
            // get amount {#747, 2}
            System.out.println("How many times should it print? (-1 to exit)");
            int number = In.getInt();
            
            // if else to quit {#456, 5}
            if (number == -1) {
                System.out.println("\nExiting... \n");
            } else {
                printTriangle(character, number);
            }
        }
    }

    public static void printTriangle (char c, int n) {
        
        // print first character {#743, 3}
        if (n > 1) {
            System.out.println(c);
        }

        // the rest of the rows except the last
        for (int i = 1; i < n -2 ; i++) {

        }
    }
}