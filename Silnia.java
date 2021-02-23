public class Silnia {
    int fact(int n){
        int result;
        if(n==1) return 1;
        result = fact(n-1)*n;
        return result;
    }
}
class Obliczenie{
    public static void main(String[] args) {
        Silnia f = new Silnia();
        System.out.println("10! wynosi "+f.fact(10));
    }
}
