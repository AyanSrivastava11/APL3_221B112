class Child extends Mother {
    @Override
    public void show() {
        System.out.println("Hello JUET from Child");
    }

    public static void showStatic() {
        System.out.println("Hello JUET from Static Child");
    }
}
