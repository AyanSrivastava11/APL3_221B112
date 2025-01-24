public class Application {
    public static void main(String[] args) {
        Mother m1 = new Child(); 
        m1.show();  
        
        System.out.println("\nStatic Method Test (before making show static in either class):");
        Mother.showStatic(); // Calls static show() from Mother
        Child.showStatic();  // Calls static show() from Child
        
        System.out.println("\nStatic Methods after making 'show' static in both classes:");
        Mother.showStatic();  // Will call static method of Mother
        Child.showStatic();   // Will call static method of Child
    }
}
