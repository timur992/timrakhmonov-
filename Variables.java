public class Variables{

    public static void main(String[] args){
      
        String str = "8 j 8   mBliB8g  imjB8B8  jl B";
        
        System.out.println(str.replaceAll(" ", ""));


        String str1 = "1234";
        int result = Integer.valueOf(str1);
        System.out.println(result);

        String  str2 = "Shams Ziyo Tabrez";
        int x = str2.indexOf(' ')+1;
        System.out.println(str2 +" , your initials maybe this: =>> " + str2.charAt(0) +"."+ str2.charAt(x));
        
        
       
    }

}