public enum Test {
    INSTANCE;
    private int state;
    
    public void test() {
        System.out.println("a");
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
}
