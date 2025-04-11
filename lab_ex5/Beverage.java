abstract class Beverage{
    void pour(int qty){
        System.out.print("Add" + qty + "to drink");
    }
    
    protected abstract void addCondiment();
    //hook
    
    protected void stir(){
        
    }
    
    private void serve(){
        System.out.println("Server through waiter");
    }
    public void templateMethod(int qty){
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
}