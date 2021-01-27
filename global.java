public class global {
    public static final int SIZE=4; //final means is a constant 

        public static void main(String[] args) {
            for(int i = 1; i <= SIZE; i++) {
                for(int j = 0; j < SIZE * i - SIZE; j++)
                    System.out.print("\\");
                    
                for(int j = 0; j < SIZE * i + SIZE; j++)
                    System.out.print("!");
                    
                for(int j = 0; j < 2 * i - 2; j++)
                    System.out.print("/");
                    
                System.out.println();
            }
        }
    }

