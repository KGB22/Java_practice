package March5;

class FieldInitValueExample {
    public static void main(String[] args) {
        FieldInitValue fiv = new FieldInitValue();

        System.out.println("byteField: " + fiv. byteField);
        System.out.println("shortField: " + fiv.shortField); 
        System.out.println("intField: " + fiv.intField);
        System.out.println("longField: " + fiv.longField);
        System.out.println("floatField: " + fiv.floatField);
        System.out.println("booleanField: " + fiv.booleanField);
        System.out.println("charField: " + fiv.charField);
        System.out.println("arrField: " + fiv.arrField);
        System.out.println("referanceField: " + fiv.referanceField);
        
    }
}

public class FieldInitValue {
    byte byteField;
    short shortField;
    int intField;
    long longField;

    boolean booleanField;
    char charField;

    float floatField;
    double doubleField;

    int[] arrField;
    String referanceField;


}
