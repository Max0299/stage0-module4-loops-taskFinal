package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
     for(int i = 1;i<=cathetusLength;i++){
         for(int j = 1;j<=cathetusLength;j++){
             if(i <=j){
                 System.out.println("*");
             }
         }
         System.out.println();
     }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
