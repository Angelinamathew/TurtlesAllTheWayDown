public class Factorial {
    public int recursion(int i) {
        //What happens when it reaches at 1
        if(i==1){
            return 1;
        }
        return i * recursion(i-1);
    }
}
