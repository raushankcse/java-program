public class data5 {
    public static void main(String[] args) {
        byte b =4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        Object variable = (f*b)+(i%c)-(d*5);

        System.out.println(variable.getClass());
    }
}
