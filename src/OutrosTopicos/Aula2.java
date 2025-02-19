package OutrosTopicos;

public class Aula2 {
    public static void main(String[] args) {
        String texto = "abcde FGHIJ ABC abc DEFG   ";

        String s1 = texto.toLowerCase();
        String s2 = texto.toUpperCase();
        String s3 = texto.trim();
        String s4 = texto.substring(2);
        String s5 = texto.substring(2, 9);
        String s6 = texto.replace('a', 'x');
        String s7 = texto.replace("abc", "xy");
        int i = texto.indexOf("bc");
        int j = texto.lastIndexOf("bc");

        System.out.println("Original: " + texto);
        System.out.println("toLowerCase: " + s1);
        System.out.println("toUpperCase: " + s2);
        System.out.println("Trim: " + s3);
        System.out.println("Substring(2): " + s4);
        System.out.println("Substring(2, 9)" + s5);
        System.out.println("Replace('a', 'x')" + s6);
        System.out.println("Replace('abc', 'xy')" + s7);
        System.out.println("Index of 'bc'" + i);
        System.out.println("Last Index of 'bc'" + j);
    }
}
