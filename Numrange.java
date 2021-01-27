public class Numrange {
        public static final int Numrepetition = 6;
        public static final int Numrange = 10;
        public static void main(String[] args) {
            for(int i = 0; i < Numrepetition; i++) {
                for(int j = 0; j <  Numrange - 1; j++)
                    System.out.print(" ");
                    System.out.print("|");
                }
                
                System.out.println();
                
                for(int i = 1; i <=Numrepetition *  Numrange; i++)
                    System.out.print(i %  Numrange);
            }
        }

