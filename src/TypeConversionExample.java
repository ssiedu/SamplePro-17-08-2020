
public class TypeConversionExample {

    public static void main(String[] args) {

        int v1=10;              //no conversion required (types are same)
        
        double v2=50;           //conversion required but java is converting automatically
        
        int v3=(int) 23.34;     //converting double to int
        
        //double v4=(double)true;
        
        //boolean v5=(boolean)1;
        
        long v6=(long) 23.4f;
    }

}
