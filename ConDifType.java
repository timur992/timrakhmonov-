import org.w3c.dom.TypeInfo;

public class ConDifType{


    public static void main(String[] args){
        
        ByteToString();
        ShortToString();
        IntToString();
        LongToString();
        FloatToString();
        DoubleToString();

        
    }

    public static void ByteToString(){
        byte age = 127;
        String result = String.valueOf(age);
        System.out.println("Converted variable byte " + age + " to String: " + result);
        System.out.println("The type of the converted variable is: " + result.getClass().getName());
    }

    public static void ShortToString(){
        short number = 2325;
        String result = String.valueOf(number);
        System.out.println("Converted variable short " + number + " to String: " + result);
        System.out.println("The type of the converted variable is: " + result.getClass().getName());
    }
    public static void IntToString(){
        int age = 3325698;
        String result = String.valueOf(age);
        System.out.println("Converted variable integer " + age + " to String: " + result);
        System.out.println("The type of the converted variable is: " + result.getClass().getName());
    }
    public static void LongToString(){
        long age = 1564789987;
        String result = String.valueOf(age);
        System.out.println("Converted variable byte " + age + " to String: " + result);
        System.out.println("The type of the converted variable is: " + result.getClass().getName());
    }

    public static void FloatToString(){
        float age = 1564.65365F;
        String result = String.valueOf(age);
        System.out.println("Converted variable byte " + age + " to String: " + result);
        System.out.println("The type of the converted variable is: " + result.getClass().getName());
    }
    public static void DoubleToString(){
        double age = 1.564789987;
        String result = String.valueOf(age);
        System.out.println("Converted variable byte " + age + " to String: " + result);
        System.out.println("The type of the converted variable is: " + result.getClass().getName());
    }


    
}