package src.basics_p_collection_12_jan20;

public class Hello {
    public static void main(String[] args) throws Exception {
        H h = new H();
        h.process();
    }
}

class H{
    public int process() throws Exception{
//        int a = 10/0;
//        throw new NullPointerException();
        int a= 10/0;
        return 0;
    }
}
