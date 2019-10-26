public class Review1 {
    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println(multiply(1.2, 1.3));
        System.out.println(doubleString("Najib"));
        System.out.println(isNajibGay(true));
        System.out.println(singleCharacter('A'));
        
    }
    
    public static Double multiply(Double a, Double b){
        return a*b;
    }
    public static String doubleString(String str){
        return str + " " + str;
    }
    public static boolean isNajibGay(boolean isHeGay){
        return isHeGay && !isHeGay;
    }
    public static char singleCharacter(char character){
        return (char)(character +1);
    }
   
}