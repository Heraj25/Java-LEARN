package Learn_Class;


class reference{
    public void heraj(){
        System.out.println("My name is heraj.");
    }
   
}

class protect{
    private void message(){
        System.out.println("I have a Unique Personality.");
    }
    
    public static void main(String[] args) {
    reference sj = new reference();
    sj.heraj();
    protect ob = new protect();
    ob.message();
    }
}