public class Primitivos {
    public static void main(String[] args) {
        byte numByte = 127;
        System.out.println("numByte = " + numByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor maximo de un byte es " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte es " + Byte.MIN_VALUE);
        System.out.println("---------------------------------------------");

        short numShort = 32767;
        System.out.println("numShort = " + numShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("valor maximo de un short es " + Short.MAX_VALUE);
        System.out.println("valor minimo de un short es " + Short.MIN_VALUE);
        System.out.println("---------------------------------------------");

        int numInt = 2147483647;
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("valor int de un short es " + Integer.MAX_VALUE);
        System.out.println("valor int de un short es " + Integer.MIN_VALUE);
        System.out.println("---------------------------------------------");

        long numLong = 9223372036854775807L;
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("valor maximo de un long es " + Long.MAX_VALUE);
        System.out.println("valor minimo de un long es " + Long.MIN_VALUE);
        System.out.println("---------------------------------------------");

        //Se crearan mas apartados para realizar y seguir con este proyecto
    }
}
