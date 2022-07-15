package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int spaces = cathetusLength-1;

        for(int i=1 ;i<=cathetusLength;i++){
            for(int j = 1;j<=cathetusLength;j++){
                if(j <=spaces){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            spaces--;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
