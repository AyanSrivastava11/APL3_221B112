// class Whisky{
//     private void pour(){
//         System.out.println("pour 30 ml of Whisky");
//     }
    
//     private void addContainment(){
//         System.out.println("add some ice");
//     }
    
//     private void stir(){
//         System.out.println("stir for exactly 29 sec");
//     }
    
//     private void serve(){
//         System.out.println("Serve through waiter");
//     }
    
//     public void template Method(){
//         pour();
//         addContainment();
//         stir();
//         serve();
//     }
// }

class Whisky extends Beverage{
    protected void addCondiment(){
        System.out.println("Message");
    }
}