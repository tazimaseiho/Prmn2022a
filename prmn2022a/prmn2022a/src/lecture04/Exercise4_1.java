package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter F1 = new Fighter(210,100,"Fighter1");
        Fighter F2 = new Fighter(180,150,"Fighter2");

        while(true){
            F1.attack(F2);
            if (!F2.isAlive()){
                System.out.println(F2.getName()+"は倒れた.");
                break;
            }
            F2.attack(F1);
            if (!F1.isAlive()){
                System.out.println(F1.getName()+"は倒れた.");
                break;
            }
        }
    }
}
