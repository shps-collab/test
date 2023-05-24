public class App {
    public static void main(String[] args) throws Exception {
        int integer = 45;
        long longValue = 1L;
        float floatValue = 3.0f/10.0f;
        double doubleValue = 45.0;
        char charValue = 'a';
        String stringValue = "a";
        boolean booleanValue = true;

        // if(integer == doubleValue){
        //     System.out.println("integer is " + doubleValue);
        // }else{
        //     System.out.println("integer is not " + doubleValue);
        // }
        // System.out.println(floatValue);
        // System.out.println(integer+34);
        // System.out.println(doubleValue+34);
        // System.out.println(doubleValue+charValue);
        // System.out.println(doubleValue+stringValue);

//         while(integer < 50){
//             System.out.println(integer);
//             integer++;
//         }
// integer = 123;
//         do {
//             System.out.println(integer);
//             integer++;
//         }   while(integer < 50);

        for(int i = 0; i < integer; i++){
            System.out.println(i);
            if(i == 10){
                break;
            }
        }

        // System.out.println(System.currentTimeMillis());

        // System.out.println("Hello, World!");
    }
}
