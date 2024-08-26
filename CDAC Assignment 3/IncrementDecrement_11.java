public class IncrementDecrement_11 {
    public static void main(String[] args) {
        int A = 5;
        int B =10;
        int result = ++A + B--; //in pre value get increase first and then aassign
                                //in post value get assign first and then get increase
        System.out.println("Result:"+ result);
        System.out.println("Pre-increment : "+A); //it increase by 1
        System.out.println("post-decrement : "+B);//it get decrease by 1

    }
}
