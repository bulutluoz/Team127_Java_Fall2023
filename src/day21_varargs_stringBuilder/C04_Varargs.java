package day21_varargs_stringBuilder;

public class C04_Varargs {
    public static void main(String[] args) {

        islem(3,4,5,6,7,8); // 3 + 4 + 8 = 15    c[3]
        islem(1,2,3,4,5,6); // 1 + 2 + 4 = 7     c[1]
        islem(0,1,2); // 0 + 1 + 2 = 3   c[0]
        islem(3,4); // 3 + 4 +        bu kodda c array'i [] olur c[3] ==>
        // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 0

    }

    public static void islem(int a , int b, int... c){

        System.out.println(a+b+c[a]);
    }
}
